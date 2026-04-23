package com.example.labo01.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Materiales {
    private String nombre;
    private String categoria;
    private String efecto;
    private double precioRupias;
    private String ubicacionPrincipal;
    private String gradoRareza;
}