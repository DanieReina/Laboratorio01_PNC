package com.example.prueba;

import com.example.prueba.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ProductService productService) {

        return args -> {

            System.out.println("=== INICIANDO APP ===");
            productService.getAllProducts().forEach(p ->
                    System.out.println(p.getNombre() + " - $" + p.getPrecio())
            );
        };
    }

}
