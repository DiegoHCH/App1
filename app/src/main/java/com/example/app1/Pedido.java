package com.example.app1;

import java.util.List;

public class Pedido {

    List<Plato> listplatos;
    Empleado empleado;
    String idFactura;

    public Pedido(List<Plato> listplatos, Empleado empleado, String idFactura) {
        this.listplatos = listplatos;
        this.empleado = empleado;
        this.idFactura = idFactura;
    }

    public List<Plato> getListplatos() {
        return listplatos;
    }

    public void setListplatos(List<Plato> listplatos) {
        this.listplatos = listplatos;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }
}
