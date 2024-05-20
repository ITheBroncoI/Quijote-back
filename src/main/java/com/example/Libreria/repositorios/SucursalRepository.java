package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Sucursal;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
    // Metodo para guardar/actualizar una sucursal
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todas las sucursales en donde su estado es true y ordenarlos por id de forma ascendente
    List<Sucursal> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica una sucursal
    @Transactional
    @Modifying
    @Query ("update Sucursal s set s.estado = false where s.id = :id")
    public void eliminarSucursal(@Param("id") Integer id);
}


