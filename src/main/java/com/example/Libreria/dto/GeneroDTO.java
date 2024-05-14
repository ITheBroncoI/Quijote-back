package com.example.Libreria.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class GeneroDTO {
    private int id;
    @NotBlank
    private String nombre;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private boolean estado;
}
