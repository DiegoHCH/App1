package com.example.app1;

public class Plato {
     String Id;
     String Nombre;
     Integer Valor;
     String Descripcion;
     int Cantidad;
     int Imagen;

    public Plato(String id, String nombre, Integer valor, String descripcion, int cantidad, int imagen) {
        Id = id;
        Cantidad = cantidad;
        Nombre = nombre;
        Valor = valor;
        Descripcion = descripcion;
        Imagen = imagen;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) { Nombre = nombre; }

    public Integer getValor() {
        return Valor;
    }

    public void setValor(Integer valor) {
        Valor = valor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantidad() { return Cantidad; }

    public void setCantidad(int cantidad) { Cantidad = cantidad; }

    public int getImagen() { return Imagen; }

    public void setImagen(int imagen) { Imagen = imagen; }
}
