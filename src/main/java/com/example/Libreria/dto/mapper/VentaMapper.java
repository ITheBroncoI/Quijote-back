package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.VentaDTO;
import com.example.Libreria.modelo.Venta;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    // Individuales
    VentaDTO ventaToVentaDTO(Venta venta);
    Venta ventaDTOToVenta(VentaDTO ventaDTO);

    // Lista
    List<VentaDTO> ventasToVentasDTO(List<Venta> ventas);
}
