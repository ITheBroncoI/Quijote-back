package com.example.Libreria.servicios;

import com.example.Libreria.modelo.DetalleVenta;
import com.example.Libreria.repositorios.DetalleVentaRepository;
import com.example.Libreria.servicios.helper.InventarioHelper;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaService {
    private final InventarioHelper inventarioHelper;
    private final DetalleVentaRepository detalleVentaRepository;

    @Autowired
    public DetalleVentaService(InventarioHelper inventarioHelper, DetalleVentaRepository detalleVentaRepository) {
        this.inventarioHelper = inventarioHelper;
        this.detalleVentaRepository = detalleVentaRepository;
    }

    @Transactional
    //Metodo para guardar un registro en el detalle venta
    public  int guardarLibro(DetalleVenta detalleVenta){
        int id_libro = detalleVenta.getId_libro();
        int cantidad = detalleVenta.getCantidad();

        if(!inventarioHelper.verificarInventario(id_libro)){
            throw new IllegalStateException("No hay suficiente inventario para el libro con ID: " + id_libro);
        }

        inventarioHelper.extraerInventario(id_libro, cantidad);
        return detalleVentaRepository.save(detalleVenta).getId();
    }

    public List<DetalleVenta> obtenerDetalles(){
        return detalleVentaRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    public void eliminarDetallesVenta(int id){
        DetalleVenta detalleVenta = detalleVentaRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("No se encontro el libro con ID: " + id));

        int id_libro = detalleVenta.getId_libro();
        int cantidad = detalleVenta.getCantidad();

        inventarioHelper.retornarInventario(id_libro,cantidad);
        detalleVentaRepository.deleteById(id);
    }
}
