package tpObserver.unq.ejercicios.concursoPreguntas;

import java.util.ArrayList;

public class Juego {
	private EstadoJuego estado;
	
	
	public Juego(ArrayList<Pregunta> preguntas) {
		this.estado = new Inicial(this, preguntas);
		
		
	}
	void cambiarEstado(EstadoJuego estado) {
		this.estado = estado;
	}
	

	
	public void soliticarParticipacion(IJugador jugador) {
		this.estado.solicitarParticipacion(jugador);
	}
	
	public void responderPregunta(String respuesta, Pregunta pregunta, IJugador jugador) {
		this.estado.responderPregunta(respuesta, pregunta, jugador);
	}
	
	public EstadoJuego getState() {
		return estado;
	}

}
