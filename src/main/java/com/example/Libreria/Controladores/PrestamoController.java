package com.example.Libreria.Controladores;

import com.example.Libreria.dto.PrestamoDTO;
import com.example.Libreria.dto.mapper.PrestamoMapperImpl;
import com.example.Libreria.servicios.PrestamoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {
    PrestamoService prestamoService;
    PrestamoMapperImpl prestamoMapper;

    @Autowired
    public PrestamoController(PrestamoService prestamoService, PrestamoMapperImpl prestamoMapper) {
        this.prestamoService = prestamoService;
        this.prestamoMapper = prestamoMapper;
    }

    // Metodo para guardar prestamos
    @PostMapping("/guardar")
    public int guardarPrestamo(@RequestBody @Valid PrestamoDTO prestamo) {

    }

}

