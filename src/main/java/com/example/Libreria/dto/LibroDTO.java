package com.example.Libreria.dto;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Builder
public class LibroDTO {
    private int id;
    @NotBlank
    private String sucursal;
    @NotBlank
    private String genero;
    @NotBlank
    private String editorial;
    @NotBlank
    private String nombre;
    @NotNull
    private Date fecha;
    @NotNull
    private float precio;
    private int cantidad;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
}

// Email
//@Pattern(regexp = "^[a-z0-9!#$%&''+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&''+/=?^_`{|}~-]+)@(?:[a-z0-9](?:[a-z0-9-][a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$")
