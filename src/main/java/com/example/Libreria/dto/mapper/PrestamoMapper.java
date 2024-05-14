package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.PrestamoDTO;
import com.example.Libreria.modelo.Prestamo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PrestamoMapper {
    PrestamoDTO prestamoToPrestamoDTO(Prestamo prestamo);
    Prestamo prestamoDTOToPrestamo(PrestamoDTO prestamoDTO);
}
