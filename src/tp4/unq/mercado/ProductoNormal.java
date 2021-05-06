package tp4.unq.mercado;

public class ProductoNormal extends Producto{
	public ProductoNormal(int stock, double precio) {
		super(stock,precio);
	}
	
	public double precio() {
		return precio;
	}

}
