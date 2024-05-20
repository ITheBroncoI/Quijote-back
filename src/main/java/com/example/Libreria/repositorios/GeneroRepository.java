package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Genero;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GeneroRepository extends JpaRepository<Genero, Integer> {

    // Metodo para guardar/actualizar un genero
    // Metodo proporcionado por JpaRepository

    // Método para obtener todos los editoriales en donde estado es true y ordenarlos por id de forma ascendente
    List<Genero> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un genero
    @Transactional
    @Modifying
    @Query ("update Genero g set g.estado = false where g.id = :id")
    public void eliminarGenero(@Param("id") Integer id);
}
