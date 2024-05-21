package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Empleado;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    // Metodos para guardar/actualizar un empleado
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los empleados existentes en forma ascendente
    List<Empleado> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un empleado
    @Transactional
    @Modifying
    @Query ("update Clientes c set c.estado = false where c.id = :id")
    public void eliminarEmpleado(@Param("id") Integer id);
}
