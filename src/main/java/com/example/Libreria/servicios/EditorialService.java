package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Editorial;
import com.example.Libreria.repositorios.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {
    EditorialRepository editorialRepository;

    @Autowired
    public EditorialService(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    // Metodo para guardar editorial
    public int guardarEditorial(Editorial editorial) {
        return editorialRepository.save(editorial).getId();
    }
}
