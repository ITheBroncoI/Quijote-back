package com.example.Libreria.Controladores;

import com.example.Libreria.dto.EditorialDTO;
import com.example.Libreria.dto.mapper.EditorialMapperImpl;
import com.example.Libreria.servicios.EditorialService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    // Metodo para actualizar una editorial
    @PutMapping("/actualizar")
    public int actualizarEditorial(@RequestBody @Valid EditorialDTO editorialDTO) {
        return editorialService.guardarEditorial(editorialMapper.editorialDTOToEditorial(editorialDTO));
    }

    // Metodo para obtener las editoriales existenctes
    @GetMapping("/obtener")
    public List<EditorialDTO> obtenerEditoriales() {
        return editorialMapper.editorialsToEditorialDTOs(editorialService.obtenerEditoriales());
    }

    // Metodo para borrar una editorial segun su Id
    @DeleteMapping("/borrar/{id}")
    public void borrarEditorial(@PathVariable Integer id) {
        editorialService.eliminarEditorial(id);
    }
}
