package org.bedu.java.jse.basico5.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Tarea {

    private String nombre;

    private LocalDate fechaCreacion;
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private LocalDate fechaExpiracion;
    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    private boolean realizada;
    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
    private LocalDate fechaRealizacion;

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
    }
    {
        fechaCreacion = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return Objects.equals(nombre, tarea.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
