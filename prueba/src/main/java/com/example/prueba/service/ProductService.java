package com.example.prueba.service;

import com.example.prueba.domain.model.Producto;
import com.example.prueba.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }
}
