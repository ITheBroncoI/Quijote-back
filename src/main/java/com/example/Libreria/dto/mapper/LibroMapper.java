package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.LibroDTO;
import com.example.Libreria.modelo.Libro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LibroMapper {
    LibroDTO libroToLibroDTO(Libro libro);
    Libro libroDTOToLibro(LibroDTO libroDTO);
}
