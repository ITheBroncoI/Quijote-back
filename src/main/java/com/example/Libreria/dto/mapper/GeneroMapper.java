package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.GeneroDTO;
import com.example.Libreria.modelo.Genero;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GeneroMapper {
    // Individuales
    GeneroDTO generoToGeneroDTO(Genero genero);
    Genero generoDTOToGenero(GeneroDTO generoDTO);

    // LIsta
    List<GeneroDTO> generosToGenerosDTO(List<Genero> generos);
}
