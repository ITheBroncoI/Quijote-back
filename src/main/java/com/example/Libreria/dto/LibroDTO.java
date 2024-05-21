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
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_sucursal;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_genero;
    @NotNull
    @Min(value = 1, message = "Valor minimo 1")
    private int id_editorial;
    @NotBlank
    // Email
    //@Pattern(regexp = "^[a-z0-9!#$%&''+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&''+/=?^_`{|}~-]+)@(?:[a-z0-9](?:[a-z0-9-][a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$")
    private String nombre;
    @NotNull
    private Date fecha_publicacion;
    @NotNull
    private float precio;
    private int cantidad;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
}
