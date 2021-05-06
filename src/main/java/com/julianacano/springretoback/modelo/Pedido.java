package com.julianacano.springretoback.modelo;



import java.util.UUID;

public class Pedido   {
     private String idP;
     private double cantidad;
    private Producto productos;

    
    public Pedido(double cantidad, Producto productos) {
        this.cantidad = cantidad;
        this.productos = productos;
        this.idP= UUID.randomUUID().toString();
       
    }

    public void aumentarCantidad() {
        this.cantidad++;
    }

    public double getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return productos;
    }

    public String getIdP() {
        return idP;
    }
    

}
