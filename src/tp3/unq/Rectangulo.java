package tp3.unq;

public class Rectangulo {
	
	private Punto posicion;
	private Integer base;
	private Integer altura;
	public Rectangulo(Integer i, Integer j, Integer base, Integer altura) {
		this.posicion = new Punto(i, j);
		this.base = Math.abs(base);
		this.altura = Math.abs(altura);	
	}
	
	public Integer getArea() {
		return base*altura;
	}
	public Integer getPerimetro() {
		return (base*2)+(altura*2);
	}
	
	public boolean esVertical() {
		return (altura > base);
	}
	public boolean esHorizontal() {
		return (base > altura);
	}

	public Integer getPosicionX() {
		
		return posicion.getX();
	}
	public Integer getPosicionY() {
		return posicion.getY();
	}

	public Integer getBase() {
		// TODO Auto-generated method stub
		return base;
	}
	public Integer getAltura() {
		return altura;
	}

}
