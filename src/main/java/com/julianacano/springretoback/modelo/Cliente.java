package com.julianacano.springretoback.modelo;

import java.util.ArrayList;

public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private static ArrayList<Cliente> clientes= new ArrayList<>();

    public Cliente (String cedula,String nombre,String apellido,String direccion ){
        this.cedula= cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
         
    }

    public Cliente(){

    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion= direccion;
    }

    public static ArrayList<Cliente> agregarClientes(){

        clientes.add(new Cliente("12345", "Carlos", "Vega", "Carrera 11 # 14-08"));
        clientes.add(new Cliente("12233", "Ana Maria", "Gonzales", "Calle 20 # 29-58"));
        clientes.add(new Cliente("11334", "Andrea", "Gomez", "Calle 8 # 02-05"));
        clientes.add(new Cliente("13344", "Juan Jose", "Paipa", "Carrera 6 # 4-18"));
        clientes.add(new Cliente("11345", "Samuel", "Vargas", "Calle 14 # 07-08"));
        clientes.add(new Cliente("12355", "Mireya", "Perez", "Carrera 2 # 28-01"));
        return clientes;
    }

}
