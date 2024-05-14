package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.VentaDTO;
import com.example.Libreria.modelo.Venta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    VentaDTO ventaToVentaDTO(Venta venta);
    Venta ventaDTOToVenta(VentaDTO ventaDTO);
}
