package com.example.app1;

public class Empleado {
    int identificacion;
    String Nombre;

    public Empleado(int identificacion, String nombre) {
        this.identificacion = identificacion;
        Nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
