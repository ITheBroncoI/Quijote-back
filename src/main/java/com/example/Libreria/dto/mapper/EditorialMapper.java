package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.EditorialDTO;
import com.example.Libreria.modelo.Editorial;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EditorialMapper {
    EditorialDTO editorialToEditorialDTO(Editorial editorial);
    Editorial editorialDTOToEditorial(EditorialDTO editorialDTO);
}
