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

}
