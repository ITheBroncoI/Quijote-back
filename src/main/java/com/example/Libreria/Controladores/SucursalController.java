package com.example.Libreria.Controladores;

import com.example.Libreria.dto.SucursalDTO;
import com.example.Libreria.dto.mapper.SucursalMapperImpl;
import com.example.Libreria.modelo.Sucursal;
import com.example.Libreria.servicios.SucursalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {
    SucursalService sucursalService;
    SucursalMapperImpl sucursalMapper;

    @Autowired
    public SucursalController(SucursalService sucursalService, SucursalMapperImpl sucursalMapper) {
        this.sucursalService = sucursalService;
        this.sucursalMapper = sucursalMapper;
    }

    // Metodo para guardar/actualizar una sucursal
    @PostMapping("/guardar")
    public int guardarSucursal(@RequestBody @Valid SucursalDTO sucursalDTO) {
        return sucursalService.guardarSucursal(sucursalMapper.sucursalDTOToSucursal(sucursalDTO));
    }

    // Metodo para obtener las sucursales existentes
    @GetMapping("/obtener")
    public List<SucursalDTO> obtenerSucursales() {
        return sucursalMapper.sucursalesToSucursalDTOs(sucursalService.obtenerSucursales());
    }

    // Metodo para borrar una sucursal segun su Id
    @DeleteMapping("/borrar/{id}")
    public void borrarSucursal(@PathVariable int id) {
        sucursalService.eliminarSucursal(id);
    }
    
}
