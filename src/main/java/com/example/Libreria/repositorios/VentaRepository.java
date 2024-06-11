package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
    // Metodo para guardar una venta
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los clientes existentes en un orden ascedente
    List<Venta> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un prestamo
    @Transactional
    @Modifying
    @Query("UPDATE Venta SET estado = false WHERE id = :id")
    void devolucionVenta(@Param("id") Integer id);
}
