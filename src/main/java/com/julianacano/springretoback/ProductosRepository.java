package com.julianacano.springretoback;
import com.julianacano.springretoback.modelo.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

    Producto findFirstByCodigo(String codigo);
}
