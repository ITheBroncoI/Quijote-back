package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
    // Metodo para guardar/actualizar un prestamo
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los clientes existentes en orden ascendente
    List<Prestamo> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un prestamo
    @Transactional
    @Modifying
    @Query("update Prestamo set estado = false where id = :id")
    void entregarPrestamo(@Param("id") Integer id);
}
