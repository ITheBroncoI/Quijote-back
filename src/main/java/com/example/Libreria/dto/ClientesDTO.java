package com.example.Libreria.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class ClientesDTO {
    private int id;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_registro;
    @NotBlank
    private String nombre;
    @NotBlank
    private String direccion;
    @NotNull
    private int numero_telefono;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
}
