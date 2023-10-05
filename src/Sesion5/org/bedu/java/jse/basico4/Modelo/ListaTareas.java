package org.bedu.java.jse.basico4.Modelo;

import java.time.LocalDate;

public class ListaTareas {

    final private String nombre;
    public String getNombre() {
        return nombre;
    }

    final private LocalDate fechaCreacion;

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }


    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTareas(String nombre) {
        this.nombre = nombre;
    }
}