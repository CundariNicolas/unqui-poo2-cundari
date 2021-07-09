package tpComposite.ejercitos;

public abstract class Clase {
	private int posicionX;
	private int posicionY;
	private Mapa mapaConPosiciones;
	
	
	
	public abstract void avanzarHacia(Posicion posicion);
	public  void addClase(Clase clase) {
		// HOOK METHOD PARA CLASE COMPUESTA
	};
	public  void removeClase(Clase clase) {
		// HOOK METHOD PARA LA CLASE COMPUESTA
	};
	
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	public void setMapa(Mapa mapa) {
		this.mapaConPosiciones = mapa;
	}
	

}
