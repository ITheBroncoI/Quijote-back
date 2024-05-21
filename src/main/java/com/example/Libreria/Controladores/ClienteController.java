package com.example.Libreria.Controladores;

import com.example.Libreria.dto.ClientesDTO;
import com.example.Libreria.dto.mapper.ClientesMapperImpl;
import com.example.Libreria.modelo.Clientes;
import com.example.Libreria.servicios.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    ClienteService clienteService;
    ClientesMapperImpl clientesMapper;

    @Autowired
    public ClienteController(ClienteService clienteService, ClientesMapperImpl clientesMapper) {
        this.clienteService = clienteService;
        this.clientesMapper = clientesMapper;
    }

    // Metodo para guardar/actualizar un cliente
    @PostMapping("/guardar")
    public int guardarCliente(@RequestBody @Valid ClientesDTO clienteDTO) {
        return clienteService.guardarCliente(clientesMapper.clientesDTOToClientes(clienteDTO));
    }

    // Metodo para obtener la lista de los clientes existentes
    @GetMapping("/obtener")
    public List<ClientesDTO> obtenerClientes(List<Clientes> clientes) {
        return clientesMapper.clientesToClientesDTO(clienteService.obtenerClientes(clientes));
    }

    // Metodo para borrar un cliente segun su Id
    @DeleteMapping("/orrar/{id}")
    public void eliminarCliente(@PathVariable int id) {
        clienteService.eliminarCliente(id);
    }
}
