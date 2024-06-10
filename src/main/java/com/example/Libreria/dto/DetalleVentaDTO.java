package com.example.Libreria.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class DetalleVentaDTO {
    private int id;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_venta;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_libro;
    @NotNull
    private int cantidad;
    @NotNull
    private float precio;
    @NotNull
    private float subtotal;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
}
