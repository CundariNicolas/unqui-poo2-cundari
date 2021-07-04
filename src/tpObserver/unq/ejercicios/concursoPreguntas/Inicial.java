package tpObserver.unq.ejercicios.concursoPreguntas;

import java.util.ArrayList;
import java.util.HashMap;

public class Inicial extends EstadoJuego {
	
	public Inicial(Juego juego, ArrayList<Pregunta> preguntas) {
		this.juego = juego;
		this.participantes = new HashMap<IJugador, Integer>();
		
		this.preguntas = preguntas;
		
	}

	@Override
	public void solicitarParticipacion(IJugador jugador) {
	this.participantes.put(jugador, 0);
	this.pasarSiguienteSiEsCinco(this.participantes.size());

	}

	private void pasarSiguienteSiEsCinco(int size) {
		if(size == 5) {
			EnJuego enjuego = new EnJuego(this.juego, this.participantes, this.preguntas);
			this.juego.cambiarEstado(enjuego);
			this.juego.getState().notificarYenviarPreguntas();
		}
		
	}

	@Override
	protected void notificarYenviarPreguntas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void responderPregunta(String respuesta, Pregunta pregunta, IJugador jugador) {
		System.out.println("Todavia no inicio el juego");

	}

}
