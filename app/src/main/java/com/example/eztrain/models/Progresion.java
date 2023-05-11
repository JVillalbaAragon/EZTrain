package com.example.eztrain.models;

public class Progresion {
    private int id;
    private String nombre;
    private boolean completado;
    private String ejercicioAvanzado;


    public Progresion() {}

    public Progresion(String nombre, boolean completado, String ejercicioAvanzado) {
        this.nombre = nombre;
        this.completado = completado;
        this.ejercicioAvanzado = ejercicioAvanzado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public String getEjercicioAvanzado() {
        return ejercicioAvanzado;
    }

    public void setEjercicioAvanzado(String ejercicioAvanzado) {
        this.ejercicioAvanzado = ejercicioAvanzado;
    }

    @Override
    public String toString() {
        return "Progresion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", completado=" + completado +
                ", ejercicioAvanzado=" + ejercicioAvanzado +
                '}';
    }
}

