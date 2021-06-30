package tpObserver.unq.ejercicios.publicaciones;

import java.util.ArrayList;

public class Suscriptor {
	private String tituloDeseado;
	private ArrayList<String> autoresDeseado;
	private String filiacionDeseada;
	private String tipoDeseado;
	private String lugarDeseado;
	private ArrayList<String> palabrasDeseadas;
	private Correo correo;
	
	public Suscriptor(String tituloDeseado, ArrayList<String> autoresDeseados, String filiacionDeseada,
			String tipoDeseado, String lugarDeseado, ArrayList<String> palabrasDeseadas, Correo correo) {
		
		this.tituloDeseado = tituloDeseado;
		this.autoresDeseado = autoresDeseados;
		this.filiacionDeseada = filiacionDeseada;
		this.tipoDeseado = tipoDeseado;
		this.lugarDeseado = lugarDeseado;
		this.palabrasDeseadas = palabrasDeseadas;
		this.correo = correo;
	}
	
	
	
	public void notificar(String titulo, ArrayList<String> autores, String filiacion,
			String tipo, String lugar, ArrayList<String> palabras) {
		if(this.cumpleConLosRequisitos(titulo, autores, filiacion, tipo, lugar, palabras)) {
			this.enviarCorreo(this.correo);
		}
		
	}



	private boolean cumpleConLosRequisitos(String titulo, ArrayList<String> autores, String filiacion,
			String tipo, String lugar, ArrayList<String> palabras) {
		
		return this.cumpleTitulo(titulo) && this.cumpleAutores(autores) && this.cumpleFiliacion(filiacion) &&
				this.cumpleTipo(tipo) && this.cumpleLugarPublicado(lugar) && this.cumplePalabras(palabras);
	}



	private boolean cumplePalabras(ArrayList<String> palabras) {
		
		return this.palabrasDeseadas.isEmpty() || palabras.containsAll(this.palabrasDeseadas);
	}



	private boolean cumpleFiliacion(String filiacion) {
		
		return (this.filiacionDeseada == null) || this.filiacionDeseada.equals(filiacion);
	}



	private boolean cumpleLugarPublicado(String lugar) {
		
		return (this.lugarDeseado == null) || this.lugarDeseado.equals(lugar);
	}



	private boolean cumpleTipo(String tipo) {
		
		return (this.tipoDeseado == null) || this.tipoDeseado.equals(tipo);
	}



	private boolean cumpleAutores(ArrayList<String> autores) {
		
		return this.autoresDeseado.isEmpty() || autores.containsAll(this.autoresDeseado);
	}



	private boolean cumpleTitulo(String titulo) {
		return (this.tituloDeseado == null) || this.tituloDeseado.equals(titulo);
	}



	public void enviarCorreo(Correo correo) {
		correo.notificar("Nuevo articulo");
	}
}
