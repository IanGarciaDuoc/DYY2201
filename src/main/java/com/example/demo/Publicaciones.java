package com.example.demo;

import java.util.List;

public class Publicaciones {
    private int id;
    private String titulo;
    private String contenido;
    private List<String> comentarios;
    private List<Double> calificaciones;

    public double calcularPromedioCalificaciones() {
        return calificaciones.stream()
                             .mapToDouble(val -> val)
                             .average()
                             .orElse(0.0);
    }
    
}

    

