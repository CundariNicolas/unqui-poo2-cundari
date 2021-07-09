package tpComposite.ejercitos;

import java.util.ArrayList;

public class Ejercito extends Clase{
	
	ArrayList<Clase> ejercitos;
	
	public Ejercito(int posicionx, int posiciony, Mapa mapa) {
		this.ejercitos = new ArrayList<Clase>();
	}
	
	
	@Override
	public void addClase(Clase clase) {
		ejercitos.add(clase);
	}
	
	@Override
	public void removeClase(Clase clase) {
		ejercitos.add(clase);
	}
	@Override
	public void avanzarHacia(Posicion posicion) {
		this.ejercitos.forEach(clase -> clase.avanzarHacia(posicion));
		
	}
	
}
