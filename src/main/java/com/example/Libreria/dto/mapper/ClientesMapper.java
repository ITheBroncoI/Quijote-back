package com.example.Libreria.dto.mapper;

import com.example.Libreria.dto.ClientesDTO;
import com.example.Libreria.modelo.Clientes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientesMapper {
    ClientesDTO clientesToClientesDTO(Clientes clientes);
    Clientes clientesDTOToClientes(ClientesDTO clientesDTO);
}
