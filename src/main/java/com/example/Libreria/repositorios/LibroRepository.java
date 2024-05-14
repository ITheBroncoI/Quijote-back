package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Libro;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

    //public Libro save(Libro libro);
    //public List<Libro> findAll(String nombre);
    public Libro findByNombre(String nombre);

    @Transactional
    @Modifying
    @Query ("update Libro l set l.estado = false where l.id = :id")
    public Integer updateEstado(@Param("id") Integer id);
}
