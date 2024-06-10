package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Prestamo;
import com.example.Libreria.repositorios.PrestamoRepository;
import com.example.Libreria.servicios.helper.PrestamoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrestamoService {
    private final PrestamoHelper prestamoHelper;
    private final PrestamoRepository prestamoRepository;

    @Autowired
    public PrestamoService(PrestamoHelper prestamoHelper, PrestamoRepository prestamoRepository) {
        this.prestamoHelper = prestamoHelper;
        this.prestamoRepository = prestamoRepository;
    }

    // Metodo para guardar un prestamo
    public int guardarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo).getId();
    }

    // Metodo para obtener los prestamos vigentes
    public List<Prestamo> obtenerPrestamos() {
        return prestamoRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para entregar un prestamo
    @Transactional
    public void entregarPrestamo(int id) {
        System.out.println("---PASA 2---");
        prestamoHelper.retornarLibrosDePrestamo(id);
        System.out.println("---PASA 3---");
        prestamoRepository.entregarPrestamo(id);
    }
}
