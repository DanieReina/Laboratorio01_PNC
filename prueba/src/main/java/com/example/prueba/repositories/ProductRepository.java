package com.example.prueba.repositories;

import com.example.prueba.common.ListaProductos;
import com.example.prueba.domain.model.Producto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final ListaProductos listaProductos;

    public List<Producto> findAll() {
        return listaProductos.getProducts();
    }
}
