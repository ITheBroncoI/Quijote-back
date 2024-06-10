package com.example.Libreria.servicios;

import com.example.Libreria.modelo.DetallePrestamo;
import com.example.Libreria.repositorios.DetallePrestamoRepository;
import com.example.Libreria.servicios.helper.InventarioHelper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePrestamoService {
    private final InventarioHelper inventarioHelper;
    private final DetallePrestamoRepository detallePrestamoRepository;

    @Autowired
    public DetallePrestamoService(InventarioHelper inventarioHelper, DetallePrestamoRepository detallePrestamoRepository) {
        this.inventarioHelper = inventarioHelper;
        this.detallePrestamoRepository = detallePrestamoRepository;
    }

    @Transactional
    // Metodo para guardar un registro en el detalle prestamo
    public int guardarLibro(DetallePrestamo detalle_prestamo) {
        int id_libro = detalle_prestamo.getId_libro();
        int cantidad = detalle_prestamo.getCantidad();

        if (!inventarioHelper.verificarInventario(id_libro)) {
            throw new IllegalStateException("No hay suficiente inventario para el libro con ID: " + id_libro);
        }

        inventarioHelper.extraerInventario(id_libro, cantidad);
        return detallePrestamoRepository.save(detalle_prestamo).getId();
    }

    // Metodo para obtener los registros del prestamo
    public List<DetallePrestamo> obtenerDetalles() {
        return detallePrestamoRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para borrar un detalle del prestamo
    public void eliminarDetallePrestamo(int id) {
        DetallePrestamo detallePrestamo = detallePrestamoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Detalle de prestamo no encontrado con id: " + id));

        int id_libro = detallePrestamo.getId_libro();
        int cantidad = detallePrestamo.getCantidad();

        inventarioHelper.retornarInventario(id_libro, cantidad);
        detallePrestamoRepository.eliminarDetallePrestamo(id);
    }

}
