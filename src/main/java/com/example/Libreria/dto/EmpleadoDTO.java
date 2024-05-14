package com.example.Libreria.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class EmpleadoDTO {
    private int id;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_sucursal;
    @NotBlank
    private String nombre;
    @NotBlank
    private String direccion;
    @NotNull
    private int telefono;
    @NotBlank
    private String contrasena;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
}
