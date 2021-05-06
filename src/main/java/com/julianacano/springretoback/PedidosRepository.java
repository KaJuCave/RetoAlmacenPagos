package com.julianacano.springretoback;

import com.julianacano.springretoback.modelo.Pedido;

import org.springframework.data.repository.CrudRepository;

public interface PedidosRepository extends CrudRepository<Pedido, Integer> {
}
