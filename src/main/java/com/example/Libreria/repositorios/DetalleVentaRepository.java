package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    //Metodo para guardar/actualizar un registro en la venta
    //Metodo proporcionado por JpaRepository

    //Metodo para obtener todos los registros o pertenencias a una venta
    List<DetalleVenta> findAllByEstadoTrueOrderByIdAsc();

    //Metodo para borrar de forma fisica un libro del detalle de venta
    @Transactional
    @Modifying
    @Query ("UPDATE DetalleVenta SET estado = FALSE WHERE id = :id")
    void eliminarDetalleVenta(@Param("id") Integer id);

    // Metodo para obtener todos los detalles de una venta especifica mendate el id
    List<DetalleVenta> findAllByIdVenta(int idVenta);
}
