package tpComposite.ejercicioUML;

public class SpecialProduct extends Product {

	public SpecialProduct(float precio, String nombre) {
		super(precio, nombre);
		
	}
	
	@Override
	public float getPrice() {
		return this.price;
	}

}
