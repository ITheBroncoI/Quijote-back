package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Clientes;
import com.example.Libreria.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Metodo para guardar/actualizar un cliente
    public int guardarCliente(Clientes cliente) {
        return clienteRepository.save(cliente).getId();
    }

    // Metodo para obtener los clientes existentes
    public List<Clientes> obtenerClientes(List<Clientes> clientes) {
        return clienteRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para borrar un cliente
    public void eliminarCliente(Integer id) {
        clienteRepository.eliminarCliente(id);
    }
}
