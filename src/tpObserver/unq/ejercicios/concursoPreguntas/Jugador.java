package tpObserver.unq.ejercicios.concursoPreguntas;

import java.util.ArrayList;

public class Jugador implements IJugador {
	
	private ArrayList<Pregunta> preguntas;
	private String nombre;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.preguntas = new ArrayList<Pregunta>();
	}

	@Override
	public void notificarAceptacion(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void notificarRespuesta(String correcta, String enunciado) {
		
		
	}

	@Override
	public void respondidaCorrectamente(Pregunta pregunta) {
		this.preguntas.remove(pregunta);
		
	}

	@Override
	public void notificarGanador(String string) {
		// TODO Auto-generated method stub
		
	}

}
