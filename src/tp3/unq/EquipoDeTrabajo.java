package tp3.unq;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	private String nombre;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void agregarIntegrante(Persona x) {
		this.integrantes.add(x);
	}
	public int promedioEdades() {
		int result = 0;
		int cantPersonas = 0;
		if(!integrantes.isEmpty()) {
			for(Persona x : integrantes) {
				result = result + x.edad();
				cantPersonas++;
			}
			result = result/cantPersonas;
		}
		return result;
	}

}
