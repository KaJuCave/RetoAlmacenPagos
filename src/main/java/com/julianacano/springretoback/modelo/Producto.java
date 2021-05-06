package com.julianacano.springretoback.modelo;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Producto {
    
    private String codigo;
  
    private String nombre;

    private double precio;

    private int existencia;

    private static ArrayList<Producto> productos = new ArrayList<>();

    public Producto(String codigo, String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
        
    }

    public Producto() {
    }

    public boolean sinExistencia() {
        return this.existencia <= 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void restarExistencia(Float existencia) {
        this.existencia -= existencia;
    }

    public static ArrayList<Producto> agregarProducto(){

        productos.add(new Producto("100","Teclado", 45000, 4));
        productos.add(new Producto("101","Mouse", 25000, 6));
        productos.add(new Producto("102","Monitor 24'", 550000, 2));
        productos.add(new Producto("103","Memoria usb 3.0 32 gb", 19500, 10));
        productos.add(new Producto("104","Audifonos con diadema", 30000, 3));
        productos.add(new Producto("105","Manos libres 3.5", 14000, 4));
        productos.add(new Producto("106","Parlantes bluetooth Portatil", 40000, 5));
        productos.add(new Producto("107","Adaptador para parlantes", 70000, 4));
        productos.add(new Producto("108","Adaptador para usb 4 puertos", 9000, 4));
        productos.add(new Producto("109","Cargador universal para baterias", 10500, 4));
        return productos;
    }

}
