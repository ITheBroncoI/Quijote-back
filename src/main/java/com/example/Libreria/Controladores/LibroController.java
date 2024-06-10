package com.example.Libreria.Controladores;

import com.example.Libreria.dto.LibroDTO;
import com.example.Libreria.dto.mapper.LibroMapperImpl;
import com.example.Libreria.servicios.LibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {
    LibroService libroService;
    LibroMapperImpl libroMapper;

    @Autowired
    public LibroController(LibroService libroService, LibroMapperImpl libroMapper) {
        this.libroService = libroService;
        this.libroMapper = libroMapper;
    }

    // Metodo para guardar un libro
    @PostMapping("/guardar")
    public int guardarLibro(@RequestBody @Valid LibroDTO libroDTO) {
        return libroService.guardarLibro(libroMapper.libroDTOToLibro(libroDTO));
    }

    // Metodo para actualizar un libro
    @PutMapping("/actualizar")
    public int actualizarLibro(@RequestBody @Valid LibroDTO libroDTO) {
        return libroService.guardarLibro(libroMapper.libroDTOToLibro(libroDTO));
    }
    // Metodo para obtener los libros existentes
    @GetMapping("/obtener")
    public List<LibroDTO> obtenerLibros() {
        return libroMapper.librosToLibroDTOs(libroService.obtenerLibros());
    }

    // Metodo para borrar un libro segun su Id
    @DeleteMapping("/eliminar/{id}")
    public void eliminarLibro(@PathVariable int id) {
        libroService.eliminarLibro(id);
    }
}
