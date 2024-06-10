package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.DetallePrestamoDTO;
import com.example.Libreria.modelo.DetallePrestamo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetallePrestamoMapper {
    // Individuales
    DetallePrestamoDTO detallePrestamoToDetallePrestamoDTO(DetallePrestamo detalle_prestamo);
    DetallePrestamo detallePrestamoDTOToDetallePrestamo(DetallePrestamoDTO detalle_prestamoDTO);
    // Lista
    List<DetallePrestamoDTO> detallesToDetallePrestamoDTO(List<DetallePrestamo> detalle_prestamo);
}
