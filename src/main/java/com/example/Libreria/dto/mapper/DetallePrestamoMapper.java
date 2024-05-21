package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.Detalle_prestamoDTO;
import com.example.Libreria.modelo.Detalle_prestamo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetallePrestamoMapper {
    // Individuales
    Detalle_prestamoDTO detallePrestamoToDetallePrestamoDTO(Detalle_prestamo detalle_prestamo);
    Detalle_prestamo detallePrestamoDTOToDetallePrestamo(Detalle_prestamoDTO detalle_prestamoDTO);
    // Lista
    List<Detalle_prestamoDTO> detallesToDetallePrestamoDTO(List<Detalle_prestamo> detalle_prestamo);
}
