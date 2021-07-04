package tpObserver.unq.ejercicios.concursoPreguntas;

public class Pregunta {
	private String pregunta;
	private String respuesta;
	
	public Pregunta(String pregunta, String respuesta) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		
	}

	public boolean esCorrecta(String respuesta) {
		// TODO Auto-generated method stub
		return this.respuesta.equals(respuesta) ;
	}
	
	public String getPregunta() {
		return pregunta;
	}

}
