package com.example.labo01.repositories;

import com.example.labo01.domain.model.Materiales;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MaterialRepository {

    private final List<Materiales> database;

    public MaterialRepository() {

        this.database = List.of(
                Materiales.builder()
                        .nombre("Ámbar Rojo")
                        .categoria("Mineral")
                        .efecto("Ninguno")
                        .precioRupias(30.0)
                        .ubicacionPrincipal("Montaña de la Muerte")
                        .gradoRareza("Común")
                        .build(),
                Materiales.builder()
                        .nombre("Ala de Keese")
                        .categoria("Parte de Monstruo")
                        .efecto("Ninguno")
                        .precioRupias(15.0)
                        .ubicacionPrincipal("Llanura de Hyrule")
                        .gradoRareza("Común")
                        .build(),
                Materiales.builder()
                        .nombre("Pimienta Ardiente")
                        .categoria("Planta")
                        .efecto("Resistencia al frío")
                        .precioRupias(10.0)
                        .ubicacionPrincipal("Meseta de los Albores")
                        .gradoRareza("Poco Común")
                        .build(),
                Materiales.builder()
                        .nombre("Cuerno de Centaleón Plateado")
                        .categoria("Parte de Monstruo")
                        .efecto("Ataque")
                        .precioRupias(500.0)
                        .ubicacionPrincipal("Cordillera de Hebra")
                        .gradoRareza("Legendario")
                        .build(),
                Materiales.builder()
                        .nombre("Diamante")
                        .categoria("Mineral")
                        .efecto("Ninguno")
                        .precioRupias(500.0)
                        .ubicacionPrincipal("Volcán de Eldin")
                        .gradoRareza("Legendario")
                        .build()
        );
    }

    public List<Materiales> findAll() {
        return this.database;
    }
}
