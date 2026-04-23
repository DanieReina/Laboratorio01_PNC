package com.example.prueba.common;

import com.example.prueba.domain.model.Producto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaProductos {
    private final List<Producto> products;

    public ListaProductos() {
        this.products = new ArrayList<>();

        this.products.add(Producto.builder()
                .id(1)
                .nombre("Laptop")
                .precio(850.50)
                .build());

        this.products.add(Producto.builder()
                .id(2)
                .nombre("Mouse")
                .precio(19.99)
                .build());

        this.products.add(Producto.builder()
                .id(3)
                .nombre("Teclado")
                .precio(45.00)
                .build());

        this.products.add(Producto.builder()
                .id(4)
                .nombre("Monitor")
                .precio(199.90)
                .build());
    }

    public List<Producto> getProducts() {
        return products;
    }
}
