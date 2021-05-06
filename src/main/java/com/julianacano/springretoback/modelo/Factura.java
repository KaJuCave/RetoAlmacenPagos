package com.julianacano.springretoback.modelo;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Factura {
    private String id;
    private LocalDateTime fecha;
    private double iva;
    private double domicilio;
    private double totalProduc;
    private Cliente cliente;
    private ArrayList<Pedido> pedidos;

    public Factura (Cliente cliente, ArrayList<Pedido> pedidos){
        this.cliente=cliente;
        this.pedidos=pedidos;
        this.fecha = LocalDateTime.now();
        this.id=UUID.randomUUID().toString();
        this.totalProduc=0;
        this.domicilio=10000;
        this.iva= 0.19;
    }
    public double getIva() {
        return iva;
    }

    public double getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(double domicilio) {
        this.domicilio=domicilio;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public double getTotalProduc() {
        return totalProduc;
    }
    
    public String getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void generearFactura(){
        this.fecha = LocalDateTime.now();
        this.id=UUID.randomUUID().toString();
    }

    public void setTotalProduc(double totalProduc){
        this.totalProduc=totalProduc;
        this.totalProduc+=(this.totalProduc*this.iva)+this.domicilio;

    }

}
