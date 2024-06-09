package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    // Metodos para guardar/actualizar un empleado
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los empleados existentes en forma ascendente
    List<Empleado> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un empleado
    @Transactional
    @Modifying
    @Query ("update Empleado set estado = false where id = :id")
    void eliminarEmpleado(@Param("id") Integer id);
}
