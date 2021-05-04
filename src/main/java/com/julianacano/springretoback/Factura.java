package com.julianacano.springretoback;

public class Factura extends Producto {
     private double cantidad;
     private double iva= 0.19;
     private int domicilio= 10000;

    
    public Factura(int codigo , String nombre , double precio, int existencia, Float cantidad) {
        super(codigo, nombre, precio, existencia);
        this.cantidad = cantidad;
    }

    public void aumentarCantidad() {
        this.cantidad++;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getsubTotal() {
        return this.getPrecio() * this.cantidad;
    }

    public double getFactura(){
        
        if (getsubTotal()>70000) 
              return getsubTotal()+(getsubTotal()*iva)+domicilio;
        else if (getsubTotal()>100000) 
              return getsubTotal()+(getsubTotal()*iva);
        else
        return getsubTotal();
    }
}
