package tp4.unq.mercado;

public class ProductoCooperativa extends Producto {
	public ProductoCooperativa(int stock, float precio) {
		super(stock,precio);
	}
	
	public float precio() {
		return precio - (precio * (10 / 100));
	}

}
