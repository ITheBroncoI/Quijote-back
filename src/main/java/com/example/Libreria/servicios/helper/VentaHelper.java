package com.example.Libreria.servicios.helper;

import com.example.Libreria.modelo.DetalleVenta;
import com.example.Libreria.repositorios.DetalleVentaRepository;
import com.example.Libreria.servicios.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VentaHelper {
    private final DetalleVentaRepository detalleVentaRepository;
    private final DetalleVentaService detalleVentaService;
    private final InventarioHelper inventarioHelper;

    @Autowired
    public VentaHelper(DetalleVentaRepository detalleVentaRepository, DetalleVentaService detalleVentaService, InventarioHelper inventarioHelper) {
        this.detalleVentaRepository = detalleVentaRepository;
        this.detalleVentaService = detalleVentaService;
        this.inventarioHelper = inventarioHelper;
    }

    public void retornarLibrosVenta(int idVenta) {
        List<DetalleVenta> detalles = detalleVentaRepository.findAllByIdVenta(idVenta);

        for (DetalleVenta detalle : detalles) {
            int id = detalle.getId();
            detalleVentaService.eliminarDetallesVenta(id);
        }
    }
}
