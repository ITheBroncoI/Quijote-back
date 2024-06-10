package com.example.Libreria.Controladores;

import com.example.Libreria.dto.DetalleVentaDTO;
import com.example.Libreria.dto.mapper.DetalleVentaMapperImpl;
import com.example.Libreria.servicios.DetalleVentaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalle_venta")
public class DetalleVentaController {
    DetalleVentaService detalleVentaService;
    DetalleVentaMapperImpl detalleVentaMapper;

    @Autowired
    public DetalleVentaController(DetalleVentaService detalleVentaService, DetalleVentaMapperImpl detalleVentaMapper) {
        this.detalleVentaService = detalleVentaService;
        this.detalleVentaMapper = detalleVentaMapper;
    }

    @PostMapping("/guardar")
    public int guardarDetalleVenta(@RequestBody @Valid DetalleVentaDTO detalle_ventaDTO){
        return detalleVentaService.guardarLibro(detalleVentaMapper.detalleVentaDTOToDetalleVenta(detalle_ventaDTO));
    }

    @PutMapping("/actualizar")
    public int actualizarDetalleVenta(@RequestBody @Valid DetalleVentaDTO detalle_ventaDTO){
        return detalleVentaService.guardarLibro(detalleVentaMapper.detalleVentaDTOToDetalleVenta(detalle_ventaDTO));
    }

    @GetMapping("/obtener")
    public List<DetalleVentaDTO> obtenerDetalleVenta(){
        return detalleVentaMapper.detalleVentaToDetalleVentaDTO(detalleVentaService.obtenerDetalles());
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarDetalleVenta(@PathVariable int id){
        detalleVentaService.eliminarDetallesVenta(id);
    }
}
