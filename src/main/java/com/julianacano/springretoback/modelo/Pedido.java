package com.julianacano.springretoback.modelo;



import java.util.UUID;
/**{
	"cliente": {
		"cedula": "12345",
		"direccion": "Carrera 11 # 14-08"
	},
	"pedidos": [
		{
			"productos": {
				"codigo": "100",
				"precio": "45000"
			},
			"cantidad": "2"
		}
		
	]
} */
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

    /*public double getsubTotal() {
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

    public double eliminarFacturaValor(){
        return getsubTotal()*0.10;
        
    }*/
}
