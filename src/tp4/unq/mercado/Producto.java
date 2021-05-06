package tp4.unq.mercado;

public abstract class Producto {
	protected int stock;
	protected float precio;
	
	public Producto(int stock, float precio) {
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
	
	public abstract float precio();
	

}
