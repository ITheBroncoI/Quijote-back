package com.example.Libreria.servicios.helper;

import com.example.Libreria.repositorios.LibroRepository;
import org.springframework.stereotype.Component;

@Component
public class InventarioHelper {
    private static LibroRepository libroRepository;

    public static boolean verificarInventario(int id) {
        return libroRepository.verificarInventario(id);
    }

    public static void extraerInventario(int id, int cantidad) {
        libroRepository.restarCantidad(id, cantidad);
    }
}
