package tp4.unq.mercado;

public class ProductoCooperativa extends Producto {
	public ProductoCooperativa(int stock, double precio) {
		super(stock,precio);
	}
	
	public double precio() {
		double result = precio - (precio * 0.10);
		result = Math.round(result * 100) / 100d;
		return result;
	}

}
