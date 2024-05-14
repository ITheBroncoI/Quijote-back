package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Libro;
import com.example.Libreria.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public int guardarLibro(Libro libro) {
        return libroRepository.save(libro).getId();
    }
}
