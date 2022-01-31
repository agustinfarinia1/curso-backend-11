package com.farinia.desafioHeroku.model;

public class Mensajes {
    private String descripcion;

    public Mensajes(){}

    public Mensajes(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "{" +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
