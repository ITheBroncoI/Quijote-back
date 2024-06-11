package com.example.Libreria.Controladores;

import com.example.Libreria.dto.VentaDTO;
import com.example.Libreria.dto.mapper.VentaMapperImpl;
import com.example.Libreria.servicios.VentaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    private final VentaService ventaService;
    private final VentaMapperImpl ventaMapper;

    @Autowired
    public VentaController(VentaService ventaService, VentaMapperImpl ventaMapper) {
        this.ventaService = ventaService;
        this.ventaMapper = ventaMapper;
    }

    // Metodo para guardar una venta
    @PostMapping("/guardar")
    public int guardarVenta(@RequestBody @Valid VentaDTO ventaDTO) {
        return ventaService.guardarVenta(ventaMapper.ventaDTOToVenta(ventaDTO));
    }

    // Metodo para obtener todas las ventas realizadas
    @GetMapping("/obtener")
    public List<VentaDTO> obtenerVenta() {
        return ventaMapper.ventasToVentasDTO(ventaService.obtenerVentas());
    }

    // Metodo para devolver una venta
    @DeleteMapping("/borrar/{id}")
    public void devolverVenta(@PathVariable int id) {
        ventaService.devolverVenta(id);
    }
}
