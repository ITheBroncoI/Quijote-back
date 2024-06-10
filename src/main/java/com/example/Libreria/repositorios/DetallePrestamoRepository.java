package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.DetallePrestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface DetallePrestamoRepository extends JpaRepository<DetallePrestamo, Integer> {
    // Metodo para guardar/actualizar un registro en el prestamo
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los registros pertenecientes a un prestamo
    List<DetallePrestamo> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un libro del detalle de prestamo
    @Transactional
    @Modifying
    @Query ("UPDATE DetallePrestamo SET estado = FALSE WHERE id = :id")
    void eliminarDetalle(@Param("id") Integer id);

    // Metodo para obtener toos los detalles de un prestamo especifico mediante el id
    List<DetallePrestamo> findAllByIdPrestamo(int idPrestamo);
}
