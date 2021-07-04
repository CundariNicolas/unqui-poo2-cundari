package tpObserver.unq.ejercicios.concursoPreguntas;

import java.util.ArrayList;
import java.util.HashMap;

public class Finalizado extends EstadoJuego {
	
	public Finalizado(Juego juego, HashMap<IJugador, Integer> participantes, ArrayList<Pregunta> preguntas) {
		this.juego = juego;
		this.participantes = participantes;
		this.preguntas = preguntas;
	}

	@Override
	protected void solicitarParticipacion(IJugador jugador) {
		System.out.println("Ya finalizo el juego");

	}

	@Override
	protected void notificarYenviarPreguntas() {

	}

	@Override
	protected void responderPregunta(String respuesta, Pregunta pregunta, IJugador jugador) {
		System.out.println("Ya termino el juego");

	}

}
