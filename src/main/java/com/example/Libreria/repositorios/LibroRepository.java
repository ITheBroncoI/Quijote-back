package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
    // Metodo para guardar/actualizar un libro
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los libros existentes
    List<Libro> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un libro
    @Transactional
    @Modifying
    @Query ("update Libro set estado = false where id = :id")
    void eliminarLibro(@Param("id") Integer id);

    // Metodo para comprobar existencia de inventario de un libro
    @Query("SELECT CASE WHEN l.cantidad > 0 THEN true ELSE false END FROM Libro l WHERE l.id = :id")
    boolean verificarInventario(@Param("id") int id);

    // Metodo para restar libros del inventario - DetallePrestamo
    @Transactional
    @Modifying
    @Query("UPDATE Libro l SET l.cantidad = l.cantidad - :cantidad WHERE l.id = :id")
    void restarCantidad(@Param("id") int id, @Param("cantidad") int cantidad);

    @Modifying
    @Transactional
    // Metodo para retornar libros al inventario - DetallePrestamo
    @Query("UPDATE Libro l SET l.cantidad = l.cantidad + :cantidad WHERE l.id = :id")
    void agregarCantidad(@Param("id") int id, @Param("cantidad") int cantidad);
}
