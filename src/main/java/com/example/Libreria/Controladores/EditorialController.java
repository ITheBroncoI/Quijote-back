package com.example.Libreria.Controladores;

import com.example.Libreria.dto.EditorialDTO;
import com.example.Libreria.dto.mapper.EditorialMapperImpl;
import com.example.Libreria.servicios.EditorialService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/editorial")
public class EditorialController {
    EditorialService editorialService;
    EditorialMapperImpl editorialMapper;

    @Autowired
    public EditorialController(EditorialService editorialService, EditorialMapperImpl editorialMapper) {
        this.editorialService = editorialService;
        this.editorialMapper = editorialMapper;
    }

    // Metodo para guardar una editorial
    @PostMapping("/guardar")
    public int guardarEditorial(@RequestBody @Valid EditorialDTO editorialDTO) {
        return editorialService.guardarEditorial(editorialMapper.editorialDTOToEditorial(editorialDTO));
    }
}
