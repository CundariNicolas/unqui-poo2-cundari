package tp4.unq.mercado;

import java.util.ArrayList;

public class Caja {
	private ArrayList<Producto> productos;
	private float totalAPagar;
	
	public Caja() {
		productos = new ArrayList<Producto>();
		totalAPagar = 0;
	}
	
	public void registrarProducto(Producto x) {
		totalAPagar = totalAPagar + x.precio();
		productos.add(x);
	}
	
	public float totalAPagar() {
		return totalAPagar;
	}
	public void cobrarTotal() {
		productos.clear();
		totalAPagar = 0;
	}

}
