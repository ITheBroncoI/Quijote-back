package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Editorial;
import com.example.Libreria.repositorios.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService {
    EditorialRepository editorialRepository;

    @Autowired
    public EditorialService(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    // Metodo para guardar/actualizar una editorial
    public int guardarEditorial(Editorial editorial) {
        return editorialRepository.save(editorial).getId();
    }

    // Metodo para obtener las editoriales existentes
    public List<Editorial> obtenerEditoriales() {
        return editorialRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para borrar una editorial
    public void eliminarEditorial(Integer id) {
        editorialRepository.eliminarEditorial(id);
    }
}
