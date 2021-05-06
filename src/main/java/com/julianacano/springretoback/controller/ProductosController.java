package com.julianacano.springretoback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.julianacano.springretoback.modelo.*;

@RestController
@RequestMapping("productos")
public class ProductosController {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Factura> facturas = new ArrayList<>();

    @GetMapping
     public String bienvenida() {
        productos = Producto.agregarProducto();
        clientes = Cliente.agregarClientes();
        return "Bienvenid@! al Almacen para pagos en linea";
    }

    @GetMapping("listaProducto")
    public ArrayList<Producto> listaProductos() {
        return productos;
    }

    @GetMapping("listaClientes")
    public ArrayList<Cliente> listaClientes() {
        return clientes;
    }
    @GetMapping("listaFacturas")
    public ArrayList<Factura> listaFacturas() {
        return facturas;
    }

    @PostMapping("agregar")
    public Factura agregarFactura(@RequestBody Factura factura) {
        double total = 0;
        if (factura != null) {
            for (Pedido pedido : factura.getPedidos()) {
                total += (pedido.getProducto().getPrecio() * pedido.getCantidad());
            }
            if (total >= 70000 && total < 100000)
                factura.setDomicilio(10000);
            if (total >= 100000)
                factura.setDomicilio(0);
            factura=new Factura(factura.getCliente(), factura.getPedidos());
            factura.setTotalProduc(total);
            facturas.add(factura);
        }
        return factura;
    }


    

}
