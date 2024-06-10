package com.example.Libreria.Controladores;

import com.example.Libreria.dto.EmpleadoDTO;
import com.example.Libreria.dto.mapper.EmpleadosMapperImpl;
import com.example.Libreria.modelo.Empleado;
import com.example.Libreria.servicios.EmpleadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    EmpleadoService empleadoService;
    EmpleadosMapperImpl empleadosMapper;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService, EmpleadosMapperImpl empleadosMapper) {
        this.empleadoService = empleadoService;
        this.empleadosMapper = empleadosMapper;
    }

    // Metodo para guardar un empleado
    @PostMapping("/guardar")
    public int guardarEmpleado(@RequestBody @Valid EmpleadoDTO empleadoDTO) {
        return empleadoService.guardarEmpleado(empleadosMapper.empleadoDTOToEmpleado(empleadoDTO));
    }

    // Metodo para actualizar un empleado
    @PutMapping("/actualizar")
    public int actualizarEmpleado(@RequestBody @Valid EmpleadoDTO empleadoDTO) {
        return empleadoService.guardarEmpleado(empleadosMapper.empleadoDTOToEmpleado(empleadoDTO));
    }

    // Metodo para obtener los empleados existentes
    @GetMapping("/obtener")
    public List<EmpleadoDTO> obtenerEmpleados() {
        return empleadosMapper.empleadosToEmpleadoDTO(empleadoService.obtenerEmpleados());
    }

    // Metodo para borrar un empleado segun su Id
    @DeleteMapping("/borrar/{id}")
    public void borrarEmpleado(@PathVariable Integer id) {
        empleadoService.eliminarEmpleado(id);
    }
}
