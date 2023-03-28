package com.example.eztrain.models;

import android.widget.ProgressBar;

public class MainExercises {

    private String nombre;
    private int img;
    private int progress;

    public MainExercises(String nombre, int img, int progress) {
        this.nombre = nombre;
        this.img = img;
        this.progress = progress;
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

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
