package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.InventarioDTO;
import com.example.Libreria.modelo.Inventario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventarioMapper {
    InventarioDTO inventarioToInventarioDTO(Inventario inventario);
    Inventario inventarioDTOToInventario(InventarioDTO inventarioDTO);
}
