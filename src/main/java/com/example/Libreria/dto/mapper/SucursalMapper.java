package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.SucursalDTO;
import com.example.Libreria.modelo.Sucursal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SucursalMapper {
    SucursalDTO sucursalToSucursalDTO(Sucursal sucursal);
    Sucursal sucursalDTOToSucursal(SucursalDTO sucursalDTO);
}
