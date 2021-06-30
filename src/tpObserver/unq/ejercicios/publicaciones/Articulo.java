package tpObserver.unq.ejercicios.publicaciones;

import java.util.ArrayList;

public class Articulo {
	private String titulo;
	private ArrayList<String> autores;
	private String filiacion;
	private String tipoDeArticulo;
	private String publicadoEn;
	private ArrayList<String> palabrasClave;
	
	public Articulo(String titulo, ArrayList<String> autores, String filiacion, String tipoDeArticulo, String publicadoEn, ArrayList<String> palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.tipoDeArticulo = tipoDeArticulo;
		this.publicadoEn = publicadoEn;
		this.palabrasClave = palabrasClave;
	}
	
	
	public String getFiliacion() {
		
		return filiacion;
	}


	public String getTitulo() {
		return titulo;
	}


	public ArrayList<String> getAutores() {
		return autores;
	}


	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}


	public String getPublicadoEn() {
		return publicadoEn;
	}


	public ArrayList<String> getPalabrasClave() {
		return palabrasClave;
	}

}
