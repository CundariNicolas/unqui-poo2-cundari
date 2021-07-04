package tpObserver.unq.ejercicios.concursoPreguntas;

import java.util.ArrayList;

public interface IJugador {

	void notificarAceptacion(ArrayList<Pregunta> preguntas);

	String getNombre();

	void notificarRespuesta(String correcta, String enunciado);

	void respondidaCorrectamente(Pregunta pregunta);

	void notificarGanador(String string);

}
