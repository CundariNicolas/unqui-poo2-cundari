package tp4.unq.mercado;

public class ProductoNormal extends Producto{
	public ProductoNormal(int stock, float precio) {
		super(stock,precio);
	}
	
	public float precio() {
		return precio;
	}

}
