package tpObserver.unq.ejercicios.concursoPreguntas;

import java.util.ArrayList;
import java.util.HashMap;

public class EnJuego extends EstadoJuego {

	public EnJuego(Juego juego, HashMap<IJugador, Integer> participantes, ArrayList<Pregunta> preguntas) {
		this.juego = juego;
		this.participantes = participantes;
		this.preguntas = preguntas;
	}

	@Override
	public void solicitarParticipacion(IJugador jugador) {
		System.out.println("La partida ya esta en curso");
		
	}

	@Override
	protected void notificarYenviarPreguntas() {
		this.participantes.forEach((k, v) -> k.notificarAceptacion(this.preguntas));
		
	}

	@Override
	public void responderPregunta(String respuesta, Pregunta pregunta, IJugador jugador) {
		if(this.participantes.containsKey(jugador)) {
			if(pregunta.esCorrecta(respuesta) ) {
				
				this.participantes.forEach((k, v) -> k.notificarRespuesta(jugador.getNombre() + " respondio correctamente " , pregunta.getPregunta()));
				jugador.notificarRespuesta("Tu respuesta es correcta", pregunta.getPregunta());
				this.participantes.put(jugador, this.participantes.get(jugador) + 1);
				jugador.respondidaCorrectamente(pregunta);
				this.verificarSiEsGanador(jugador);
			}
			else {
				jugador.notificarRespuesta("Tu respuesta es incorrecta", pregunta.getPregunta());
			}
		}
		else {
		jugador.notificarRespuesta("No estas participando en el juego", "");
		System.out.println("No estas participando en el juego actual");
		}
		
	}

	private void verificarSiEsGanador(IJugador jugador) {
		if(this.participantes.get(jugador).equals(this.preguntas.size())) {
			
			this.participantes.forEach((k, v) -> k.notificarGanador("El ganador es " + jugador.getNombre()));
			EstadoJuego finalizado = new Finalizado(this.juego, this.participantes, this.preguntas);
			this.juego.cambiarEstado(finalizado);
			
		}
		
	}


}
