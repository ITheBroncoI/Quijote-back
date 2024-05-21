package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.ClientesDTO;
import com.example.Libreria.modelo.Clientes;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientesMapper {
    // individuales
    ClientesDTO clientesToClientesDTO(Clientes clientes);
    Clientes clientesDTOToClientes(ClientesDTO clientesDTO);

    // lista
    List<ClientesDTO> clientesToClientesDTO(List<Clientes> clientes);
}
