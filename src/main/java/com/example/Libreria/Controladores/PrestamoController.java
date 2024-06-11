package com.example.Libreria.Controladores;

import com.example.Libreria.dto.PrestamoDTO;
import com.example.Libreria.dto.mapper.PrestamoMapperImpl;
import com.example.Libreria.servicios.PrestamoService;
import com.example.Libreria.servicios.SucursalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {
    private final PrestamoService prestamoService;
    private final PrestamoMapperImpl prestamoMapper;

    @Autowired
    public PrestamoController(PrestamoService prestamoService, PrestamoMapperImpl prestamoMapper) {
        this.prestamoService = prestamoService;
        this.prestamoMapper = prestamoMapper;
    }

    // Metodo para guardar un prestamo
    @PostMapping("/guardar")
    public int guardarPrestamo(@RequestBody @Valid PrestamoDTO prestamoDTO) {
        return prestamoService.guardarPrestamo(prestamoMapper.prestamoDTOToPrestamo(prestamoDTO));
    }

    // Metodo para obtener todos lo prestamos vigentes
    @GetMapping("/obtener")
    public List<PrestamoDTO> obtenerPrestamos() {
        return prestamoMapper.prestamosToPrestamoDTO(prestamoService.obtenerPrestamos());
    }

    // Metodo para entregar un prestamo
    @DeleteMapping("/borrar/{id}")
    public void entregarPrestamo(@PathVariable int id) {
        prestamoService.entregarPrestamo(id);
    }
}
