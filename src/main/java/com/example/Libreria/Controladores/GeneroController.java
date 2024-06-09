package com.example.Libreria.Controladores;

import com.example.Libreria.dto.GeneroDTO;
import com.example.Libreria.dto.mapper.GeneroMapperImpl;
import com.example.Libreria.modelo.Genero;
import com.example.Libreria.servicios.GeneroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    GeneroService generoService;
    GeneroMapperImpl generoMapper;

    @Autowired
    public GeneroController(GeneroService generoService, GeneroMapperImpl generoMapper) {
        this.generoService = generoService;
        this.generoMapper = generoMapper;
    }

    // Metodo para guardar/actualizar un genero
    @PostMapping("/guardar")
    public int guardarGenero(@RequestBody @Valid GeneroDTO generoDTO) {
        return generoService.guardarGenero(generoMapper.generoDTOToGenero(generoDTO));
    }

    // Metodo para obtener los generos existentes
    @GetMapping("/obtener")
    public List<GeneroDTO> obtenerGeneros() {
        return generoMapper.generosToGenerosDTO(generoService.obtenerGeneros());
    }

    // Metodo para borrar un genero segun su Id
    @DeleteMapping("/borrar/{id}")
    public void borrarGenero(@PathVariable int id) {
        generoService.eliminarGenero(id);
    }
}
