package com.example.Libreria.repositorios;

import com.example.Libreria.modelo.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
    // Metodo para guardar/actualizar una editorial
    // Metodo proporcionado por JpaRepository

    // Metodo para obtener todos los clientes existentes en orden ascendente
    List<Clientes> findAllByEstadoTrueOrderByIdAsc();

    // Metodo para borrar de forma logica un cliente
    @Transactional
    @Modifying
    @Query ("update Clientes set estado = false where id = :id")
    public void eliminarCliente(@Param("id") Integer id);
}
