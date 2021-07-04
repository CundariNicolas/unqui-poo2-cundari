package tpObserver.unq.ejercicios.concursoPreguntas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConcursoPreguntas {
	
	Pregunta pregunta1;
	Pregunta pregunta2;
	Pregunta pregunta3;
	Pregunta pregunta4;
	Pregunta pregunta5;
	
	ArrayList<Pregunta> preguntas;
	
	Jugador jugador1;
	Jugador jugador2;
	Jugador jugador3;
	Jugador jugador4;
	Jugador jugador5;
	
	Juego juego1;

	@BeforeEach
	void setUp() throws Exception {
		
		pregunta1 = new Pregunta("Cual es la capital de Argentina", "Buenos Aires");
		pregunta2 = new Pregunta("Cual es la capital de Peru", "Lima");
		pregunta3 = new Pregunta("Cual es la capital de Colombia", "Bogota");
		pregunta4 = new Pregunta("Cual es la capital de Japon", "Tokyo");
		pregunta5 = new Pregunta("Cual es la capital de Francia", "Paris");
		preguntas = new ArrayList<Pregunta>();
		preguntas.add(pregunta1);
		preguntas.add(pregunta2);
		preguntas.add(pregunta3);
		preguntas.add(pregunta4);
		preguntas.add(pregunta5);
		
		juego1 = new Juego(preguntas);
		
		jugador1 = new Jugador("Nicolas");
		jugador2 = new Jugador("Pepe");
		jugador3 = new Jugador("Roberto");
		jugador4 = new Jugador("Juana");
		jugador5 = mock(Jugador.class);
	}

	@Test
	void testJuego() {
		juego1.soliticarParticipacion(jugador1);
		juego1.soliticarParticipacion(jugador2);
		juego1.soliticarParticipacion(jugador3);
		juego1.soliticarParticipacion(jugador4);
		juego1.soliticarParticipacion(jugador5);
		
	
		
		juego1.responderPregunta("Berlin", pregunta1, jugador5);
		verify(jugador5, times(1)).notificarRespuesta("Tu respuesta es incorrecta", pregunta1.getPregunta());
		
	}

}
