package tp4.unq.mercado;

public abstract class Producto {
	protected int stock;
	protected double precio;
	
	public Producto(int stock, double precio) {
		this.stock = stock;
		this.precio = precio;
		
	}
	
	public int getStock() {
		return this.stock;
	}
	public void decrementarStock() {
		if(stock > 0) {
			stock--;
		}
	}
	public void setStock(int cant) {
		this.stock = cant;
	}
	
	public abstract double precio();
	

}
