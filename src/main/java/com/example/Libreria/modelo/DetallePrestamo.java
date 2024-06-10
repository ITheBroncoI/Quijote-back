package com.example.Libreria.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "detalles_prestamos")
public class DetallePrestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_libro;
    @Column(name = "id_prestamo")
    private int idPrestamo;
    private int cantidad;
    private Date fecha;
    @CreationTimestamp
    private LocalDateTime createOn;
    @UpdateTimestamp
    private LocalDateTime updateOn;
    private boolean estado;
}
