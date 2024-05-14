package com.example.Libreria.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SucursalDTO {
    private int id;
    @NotBlank
    private String nombre_sucursal;
    @NotBlank
    private String direccion;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
}
