package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Venta;
import com.example.Libreria.repositorios.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VentaService {
    private final VentaRepository ventaRepository;

    @Autowired
    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    // Metodo para guardar una venta
    public int guardarVenta(Venta venta) {
        return ventaRepository.save(venta).getId();
    }

    // Metodo para obtener las ventas realizadas
    public List<Venta> obtenerVentas() {
        return ventaRepository.findAll();
    }

    // Metodo para devolver una venta
    @Transactional
    public void devolverVenta(int id) {

    }
}
