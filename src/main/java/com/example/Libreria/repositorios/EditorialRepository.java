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

    // Metodo para obtener todos los editoriales en una lista
    // Utilizando el Id como parametro para ordenar la lista en forma ascendete
    public List<Editorial> findAllByOrderByIdAsc();

    // Metodo para borrar de forma logica una editorial
    @Transactional
    @Modifying
    @Query ("update Editorial e set e.estado = false where e.id = :id")
    public void updateEstado(@Param("id") Integer id);
}
