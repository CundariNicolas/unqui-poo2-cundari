package tp3.unq;

public class Punto {
	private Integer x;
	private Integer y;
	
	public Integer getX() {
		return this.x;
	}
	public Integer getY() {
		return this.y;
	}
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	public Punto(Integer x, Integer y) {
		this.x = x;
		this.y = y;
		
	}
	
	public void correrPunto(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto sumarPunto(Punto punto) {
		Punto result = new Punto(this.x + punto.getX(), this.y + punto.getY());
		return result;
	}

}
