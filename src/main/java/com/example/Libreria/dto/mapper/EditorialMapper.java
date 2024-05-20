package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.EditorialDTO;
import com.example.Libreria.modelo.Editorial;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EditorialMapper {
    // Individuales
    EditorialDTO editorialToEditorialDTO(Editorial editorial);
    Editorial editorialDTOToEditorial(EditorialDTO editorialDTO);

    // Lista
    List<EditorialDTO> editorialsToEditorialDTOs(List<Editorial> editorials);
}
