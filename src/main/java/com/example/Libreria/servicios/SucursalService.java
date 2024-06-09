package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Sucursal;
import com.example.Libreria.repositorios.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService {
    SucursalRepository sucursalRepository;

    @Autowired
    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    // Metodo para guardar/actualizar una sucursal
    public int guardarSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal).getId();
    }

    // Metodo para obtener las sucursales existentes
    public List<Sucursal> obtenerSucursales() {
        return sucursalRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para borrar una sucursal
    @Transactional
    public void eliminarSucursal(int id) {
        sucursalRepository.eliminarSucursal(id);
    }
}
