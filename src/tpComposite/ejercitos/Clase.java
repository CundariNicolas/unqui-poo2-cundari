package tpComposite.ejercitos;

public abstract class Clase {
	private int posicionX;
	private int posicionY;
	
	public abstract void avanzarHacia(Posicion posicion);
	public abstract void addClase(Clase clase);
	public abstract void removeClase(Clase clase);
	

}
