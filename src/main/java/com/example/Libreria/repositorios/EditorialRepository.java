package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Editorial;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

    // Metodo para guardar/actualizar una editorial
    // Metodo proporcionado por JpaRepository

    // Método para obtener todos los editoriales en donde estado es true y ordenarlos por id de forma ascendente
    List<Editorial> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica una editorial
    @Transactional
    @Modifying
    @Query ("update Editorial e set e.estado = false where e.id = :id")
    public void eliminarEditorial(@Param("id") Integer id);
}