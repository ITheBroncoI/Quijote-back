package com.example.Libreria.servicios.helper;

import com.example.Libreria.modelo.DetallePrestamo;
import com.example.Libreria.repositorios.DetallePrestamoRepository;
import com.example.Libreria.servicios.DetallePrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrestamoHelper {
    private final DetallePrestamoRepository detallePrestamoRepository;
    private final DetallePrestamoService detallePrestamoService;
    private final InventarioHelper inventarioHelper;

    @Autowired
    public PrestamoHelper(DetallePrestamoRepository detallePrestamoRepository, DetallePrestamoService detallePrestamoService, InventarioHelper inventarioHelper) {
        this.detallePrestamoRepository = detallePrestamoRepository;
        this.detallePrestamoService = detallePrestamoService;
        this.inventarioHelper = inventarioHelper;
    }

    public void retornarLibrosDePrestamo(int idPrestamo) {
        System.out.println("--- PASA 4 ---");
        List<DetallePrestamo> detalles = detallePrestamoRepository.findAllByIdPrestamo(idPrestamo);
        System.out.println("--- PASA 5 ---");
        System.out.println("TAMAÑO: " + detalles.size());

        for (DetallePrestamo detalle : detalles) {
            int id = detalle.getId();
            detallePrestamoService.eliminarDetallePrestamo(id);
        }
    }
}
