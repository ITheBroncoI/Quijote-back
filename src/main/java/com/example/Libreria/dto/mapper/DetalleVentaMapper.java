package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.Detalle_ventaDTO;
import com.example.Libreria.modelo.Detalle_venta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DetalleVentaMapper {
    Detalle_ventaDTO detalleVentaToDetalleVentaDTO(Detalle_venta detalle_venta);
    Detalle_venta detalleVentaDTOToDetalleVenta(Detalle_ventaDTO detalle_ventaDTO);
}
