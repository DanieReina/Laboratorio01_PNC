package com.example.labo01.service;

import com.example.labo01.domain.model.Materiales;
import com.example.labo01.repositories.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;


    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }


    public List<Materiales> obtenerCatalogoOrdenadoPorPrecioDesc() {
        return materialRepository.findAll().stream()
                .sorted(Comparator.comparing(Materiales::getPrecioRupias).reversed())
                .collect(Collectors.toList());
    }

//No se usa porque no se muestra
    public Materiales obtenerMaterialMasCaro() {
        return materialRepository.findAll().stream()
                .max(Comparator.comparing(Materiales::getPrecioRupias))
                .orElse(null);
    }


    public List<Materiales> obtenerMaterialesLegendarios() {
        return materialRepository.findAll().stream()
                .filter(m -> "Legendario".equalsIgnoreCase(m.getGradoRareza()))
                .collect(Collectors.toList());
    }


    public List<String> obtenerUbicacionesUnicas() {
        return materialRepository.findAll().stream()
                .map(Materiales::getUbicacionPrincipal)
                .distinct()
                .collect(Collectors.toList());
    }
}
