package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    //Metodo para guardar/actualizar un registro en la venta
    //Metodo proporcionado por JpaRepository

    //Metodo para obtener todos los registros o pertenencias a una venta
    List<DetalleVenta> findAllByEstadoTrueOrderByIdAsc();

    //Metodo para borrar de forma fisica un libro del detalle de venta
    //Metodo proporcionado por JpaRepository
}
