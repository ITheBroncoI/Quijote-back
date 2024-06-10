package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Libro;
import com.example.Libreria.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Metodo para guardar/actualizar un libro
    public int guardarLibro(Libro libro) {
        return libroRepository.save(libro).getId();
    }

    // Metodo para obtener los libros existentes
    public List<Libro> obtenerLibros() {
        return libroRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para borrar un libro
    public void eliminarLibro(Integer id) {
        libroRepository.eliminarLibro(id);}

}
