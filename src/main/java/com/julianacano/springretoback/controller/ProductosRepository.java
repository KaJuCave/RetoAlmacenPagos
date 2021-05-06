package com.julianacano.springretoback.controller;

import com.julianacano.springretoback.modelo.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductosRepository extends CrudRepository<Producto, String> {

    Producto findFirstByCodigo(String codigo);
}
