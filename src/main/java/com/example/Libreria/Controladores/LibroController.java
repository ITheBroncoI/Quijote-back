package com.example.Libreria.Controladores;

import com.example.Libreria.dto.LibroDTO;
import com.example.Libreria.dto.mapper.LibroMapperImpl;
import com.example.Libreria.servicios.LibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/guardar")
    public int guardarLibro(@RequestBody @Valid LibroDTO libroDTO) {
        return libroService.guardarLibro(libroMapper.libroDTOToLibro(libroDTO));
    }
}
