package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.DetalleVentaDTO;
import com.example.Libreria.modelo.DetalleVenta;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetalleVentaMapper {
    DetalleVentaDTO detalleVentaToDetalleVentaDTO(DetalleVenta detalle_venta);
    DetalleVenta detalleVentaDTOToDetalleVenta(DetalleVentaDTO detalle_ventaDTO);

    List<DetalleVentaDTO> detalleVentaToDetalleVentaDTO(List<DetalleVenta> detalle_venta);
}
