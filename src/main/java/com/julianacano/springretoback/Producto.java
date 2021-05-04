package com.julianacano.springretoback;

import java.util.ArrayList;

public class Producto {
    
    private int codigo;
  
    private String nombre;

    private double precio;

    private int existencia;

    private ArrayList<Producto> productos;

    public Producto(int codigo, String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
        productos = new ArrayList<>();
    }

    public Producto() {
    }

    public boolean sinExistencia() {
        return this.existencia <= 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    private ArrayList<Producto> agregarProductos(){

        productos.add(new Producto(001,"Teclado", 45000, 4));
        productos.add(new Producto(020,"Mouse", 25000, 6));
        productos.add(new Producto(003,"Monitor 24'", 550000, 2));
        productos.add(new Producto(004,"Memoria usb 3.0 32 gb", 19500, 10));
        productos.add(new Producto(005,"Audifonos con diadema", 30000, 3));
        productos.add(new Producto(006,"Manos libres 3.5", 14000, 4));
        productos.add(new Producto(007,"Parlantes bluetooth Portatil", 40000, 5));
        productos.add(new Producto(021,"Adaptador para parlantes", 70000, 4));
        productos.add(new Producto(022,"Adaptador para usb 4 puertos", 9000, 4));
        productos.add(new Producto(024,"Cargador universal para baterias", 10500, 4));
        
        return productos;
    }
}
