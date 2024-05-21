package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Clientes;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
    // Metodo para guardar/actualizar una editorial
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los clientes existentes en orden ascendente
    List<Clientes> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un cliente
    @Transactional
    @Modifying
    @Query ("update Clientes c set c.estado = false where c.id = :id")
    public void eliminarCliente(@Param("id") Integer id);
}
