package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Detalle_prestamo;
import com.example.Libreria.repositorios.DetallePrestamoRepository;
import com.example.Libreria.servicios.helper.InventarioHelper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePrestamoService {
    DetallePrestamoRepository detallePrestamoRepository;

    @Autowired
    public DetallePrestamoService(DetallePrestamoRepository detallePrestamoRepository) {
        this.detallePrestamoRepository = detallePrestamoRepository;
    }

    @Transactional
    // Metodo para guardar un registro en el detalle prestamo
    public int guardarLibro(Detalle_prestamo detalle_prestamo) {
        int id_libro = detalle_prestamo.getId_libro();
        int cantidad = detalle_prestamo.getCantidad();

        if (!InventarioHelper.verificarInventario(id_libro)) {
            throw new IllegalStateException("No hay suficiente inventario para el libro con ID: " + id_libro);
        }

        InventarioHelper.extraerInventario(id_libro, cantidad);
        return detallePrestamoRepository.save(detalle_prestamo).getId();

    }

    // Metodo para obtener los registros del prestamo
    public List<Detalle_prestamo> obtenerDetalles(List<Detalle_prestamo> detalle_prestamos) {
        return detallePrestamoRepository.findAll();
    }

    // Metodo para borrar un detalle del prestamo
    public void eliminarDetallePrestamo(int id) {
        detallePrestamoRepository.deleteById(id);
    }
}
