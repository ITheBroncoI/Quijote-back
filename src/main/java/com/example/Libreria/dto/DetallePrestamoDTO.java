package com.example.Libreria.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
public class DetallePrestamoDTO {
    private int id;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_libro;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int idPrestamo;
    @NotNull
    private int cantidad;
    @NotNull
    private Date fecha;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
    // Saluda Roberto
    //Hola Ochoa
}
