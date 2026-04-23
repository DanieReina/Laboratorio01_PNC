package com.example.labo01;

import com.example.labo01.service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Labo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Labo01Application.class, args);
    }

    @Bean
    public CommandLineRunner run(MaterialService materialService) {
        return args -> {
            System.out.println("[HYRULE-DB]: ");


            materialService.obtenerCatalogoOrdenadoPorPrecioDesc().forEach(m ->
                    System.out.printf("[HYRULE-DB] Nombre: %s | Categoría: %s | Precio: %.0f Rupias%n ", //| Efecto: %s | Grado de rareza: %s | Ubicación principal: %s%n
                            m.getNombre(),
                            m.getCategoria(),
                            m.getPrecioRupias()
                            // en caso de querer mostrar todas las propiedades, descomente
                            //m.getEfecto(),
                            //m.getGradoRareza(),
                            //m.getUbicacionPrincipal()
                    )
            );

        };
    }

}
