package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.PrestamoDTO;
import com.example.Libreria.modelo.Prestamo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PrestamoMapper {
    // Individuales
    PrestamoDTO prestamoToPrestamoDTO(Prestamo prestamo);
    Prestamo prestamoDTOToPrestamo(PrestamoDTO prestamoDTO);

    // Lista
    List<PrestamoDTO> prestamosToPrestamoDTO(List<Prestamo> prestamos);
}
