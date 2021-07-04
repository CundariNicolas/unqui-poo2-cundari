package tpObserver.unq.ejercicios.concursoPreguntas;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class EstadoJuego {
	HashMap<IJugador, Integer> participantes;
	ArrayList<Pregunta> preguntas;
	Juego juego;

	protected abstract void solicitarParticipacion(IJugador jugador);
	protected abstract void notificarYenviarPreguntas();
	protected abstract void responderPregunta(String respuesta, Pregunta pregunta, IJugador jugador);
	
}
