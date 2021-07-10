package tpComposite.ejercicioUML;

public class Product {
	protected float price;
	private String name;
	
	public Product(float precio, String nombre) {
		this.price = precio;
		this.name = nombre;
	}
	public float getPrice() {
		return this.price;
	}
	public String getName() {
		return this.name;
	}
	
}
