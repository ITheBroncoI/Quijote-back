package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.GeneroDTO;
import com.example.Libreria.modelo.Genero;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GeneroMapper {
    GeneroDTO generoToGeneroDTO(Genero genero);
    Genero generoDTOToGenero(GeneroDTO generoDTO);
}
