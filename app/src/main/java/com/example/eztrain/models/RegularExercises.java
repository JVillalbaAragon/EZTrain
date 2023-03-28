package com.example.eztrain.models;

public class RegularExercises {

    String nombre;
    int img;

    public RegularExercises(String nombre, int img) {
        this.nombre = nombre;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
