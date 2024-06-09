package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Genero;
import com.example.Libreria.repositorios.GeneroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    GeneroRepository generoRepository;

    @Autowired
    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    // Metodo para guardar/actualizar un genero
    public int guardarGenero(Genero genero) {
        return generoRepository.save(genero).getId();
    }

    // Metodo para obtener los generos existentes
    public List<Genero> obtenerGeneros() {
        return generoRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para borrar un genero
    @Transactional
    public void eliminarGenero(Integer id) {
        generoRepository.eliminarGenero(id);
    }
}
