package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.EmpleadoDTO;
import com.example.Libreria.modelo.Empleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpleadosMapper {
    EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);
    Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);
}
