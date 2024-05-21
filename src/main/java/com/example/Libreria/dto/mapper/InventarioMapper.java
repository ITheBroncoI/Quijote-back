package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.InventarioDTO;
import com.example.Libreria.modelo.Inventario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InventarioMapper {
    // individuales
    InventarioDTO inventarioToInventarioDTO(Inventario inventario);
    Inventario inventarioDTOToInventario(InventarioDTO inventarioDTO);
    // lista
    List<InventarioDTO> inventarioToInventarioDTO(List<Inventario> inventario);
}
