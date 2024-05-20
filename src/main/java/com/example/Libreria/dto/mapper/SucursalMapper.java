package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.SucursalDTO;
import com.example.Libreria.modelo.Sucursal;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SucursalMapper {
    // Individuales
    SucursalDTO sucursalToSucursalDTO(Sucursal sucursal);
    Sucursal sucursalDTOToSucursal(SucursalDTO sucursalDTO);

    // Lista
    List<SucursalDTO> sucursalesToSucursalDTOs(List<Sucursal> sucursales);
}
