package tp4.unq.mercado;

import java.util.ArrayList;

public class Caja {
	private ArrayList<Producto> productos;
	private double totalAPagar;
	
	public Caja() {
		productos = new ArrayList<Producto>();
		totalAPagar = 0;
	}
	
	public void registrarProducto(Producto x) {
		if(x.getStock()>0) {
		totalAPagar = totalAPagar + x.precio();
		productos.add(x);
		x.decrementarStock();
		}
		else {
			throw new ArithmeticException("No hay stock");
		}
	}
	
	public double totalAPagar() {
		return Math.round(totalAPagar * 100) / 100d;
	}
	public void cobrarTotal() {
		productos.clear();
		totalAPagar = 0;
		
	}
	public void pagarFactura(Factura x, Agencia agencia) {
		totalAPagar = totalAPagar + x.montoAPagar();
		agencia.registrarPago(x);
		
	}
	

}
