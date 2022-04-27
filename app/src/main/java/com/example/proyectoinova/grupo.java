package com.example.proyectoinova;

public class grupo {
    private String nombre,genero;
    private int imggruo;

    public grupo() {
    }

    public grupo(String nombre, String genero, int imggruo) {
        this.nombre = nombre;
        this.genero = genero;
        this.imggruo = imggruo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getImggruo() {
        return imggruo;
    }

    public void setImggruo(int imggruo) {
        this.imggruo = imggruo;
    }
}
