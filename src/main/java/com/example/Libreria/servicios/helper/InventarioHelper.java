package com.example.Libreria.servicios.helper;

import com.example.Libreria.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InventarioHelper {

    private final LibroRepository libroRepository;

    @Autowired
    public InventarioHelper(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public boolean verificarInventario(int id) {
        return libroRepository.verificarInventario(id);
    }

    public void extraerInventario(int id, int cantidad) {
        libroRepository.restarCantidad(id, cantidad);
    }

    public void retornarInventario(int id, int cantidad) {
        libroRepository.agregarCantidad(id, cantidad);
    }
}