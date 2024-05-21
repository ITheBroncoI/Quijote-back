package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.EmpleadoDTO;
import com.example.Libreria.modelo.Empleado;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmpleadosMapper {
    // Individuales
    EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);
    Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);

    // Lista
    List<EmpleadoDTO> empleadosToEmpleadoDTO(List<Empleado> empleados);
}
