package com.example.Libreria.servicios;

import com.example.Libreria.modelo.Empleado;
import com.example.Libreria.repositorios.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    // Metodo para guardar/actualizar un empleado
    public int guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado).getId();
    }

    // Metodo para obtener los empleados existentes
    public List<Empleado> obtenerEmpleados(List<Empleado> empleados) {
        return empleadoRepository.findAllByEstadoTrueOrderByIdAsc();
    }

    // Metodo para borrar un empleado
    public void eliminarEmpleado(Integer id) {
        empleadoRepository.eliminarEmpleado(id);
    }
}
