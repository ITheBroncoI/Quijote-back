package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.LibroDTO;
import com.example.Libreria.modelo.Libro;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LibroMapper {
    // individuales
    LibroDTO libroToLibroDTO(Libro libro);
    Libro libroDTOToLibro(LibroDTO libroDTO);
    // listas
    List<LibroDTO> librosToLibroDTOs(List<Libro> libros);
}
