package com.example.Libreria.Controladores;

import com.example.Libreria.dto.DetallePrestamoDTO;
import com.example.Libreria.dto.mapper.DetallePrestamoMapperImpl;
import com.example.Libreria.servicios.DetallePrestamoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalle_prestamo")
public class DetallePrestamoController {
    DetallePrestamoService detallePrestamoService;
    DetallePrestamoMapperImpl detallePrestamoMapper;

    @Autowired
    public DetallePrestamoController(DetallePrestamoService detallePrestamoService, DetallePrestamoMapperImpl detallePrestamoMapper) {
        this.detallePrestamoService = detallePrestamoService;
        this.detallePrestamoMapper = detallePrestamoMapper;
    }

    // Metodo para guardar el detalle del prestamo
    @PostMapping("/guardar")
    public int guardarDetallePrestamo(@RequestBody @Valid DetallePrestamoDTO detalle_prestamoDTO) {
        return detallePrestamoService.guardarLibro(detallePrestamoMapper.detallePrestamoDTOToDetallePrestamo(detalle_prestamoDTO));
    }

    @PutMapping("/actualizar")
    public int actualizarDetallePrestamo(@RequestBody @Valid DetallePrestamoDTO detalle_prestamoDTO) {
        return detallePrestamoService.guardarLibro(detallePrestamoMapper.detallePrestamoDTOToDetallePrestamo(detalle_prestamoDTO));
    }

    // Metodo para obtener todos los detalles del prestamo
    @GetMapping("/obtener")
    public List<DetallePrestamoDTO> obtenerDetallePrestamos(){
        return detallePrestamoMapper.detallesToDetallePrestamoDTO(detallePrestamoService.obtenerDetalles());
    }

    // Metodo para eliminar un libro de detalle del prestamo
    @DeleteMapping("/borrar/{id}")
    public void borrarDetallePrestamo(@PathVariable int id) {
        detallePrestamoService.eliminarDetallePrestamo(id);
    }
}

