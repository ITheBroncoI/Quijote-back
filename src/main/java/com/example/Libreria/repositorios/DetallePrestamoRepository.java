package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Detalle_prestamo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DetallePrestamoRepository extends JpaRepository<Detalle_prestamo, Integer> {
    // Metodo para guardar/actualizar un registro en el prestamo
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los registros pertenecientes a un prestamo
    // Metodo proporcionado por JpaRepository

    // Metodo para borrar de forma fisica un libro del detalle de prestamo
    // Metodo proporcionado por JpaRepository
}
