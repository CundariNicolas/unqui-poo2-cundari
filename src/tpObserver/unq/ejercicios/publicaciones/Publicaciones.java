package tpObserver.unq.ejercicios.publicaciones;

import java.util.ArrayList;

public class Publicaciones {
	private ArrayList<Articulo> articulo;
	private ArrayList<Suscriptor> listeners;
	
	public Publicaciones() {
		this.articulo = new ArrayList<Articulo>();
		this.listeners = new ArrayList<Suscriptor>();
	}
	
	public void cargarArticulo(Articulo articulo) {
		this.articulo.add(articulo);
		this.listeners.forEach(sus -> sus.notificar(articulo.getTitulo(), articulo.getAutores(), articulo.getFiliacion(), articulo.getTipoDeArticulo(), articulo.getPublicadoEn(), articulo.getPalabrasClave()));
		
	}
	
	public void addListener(Suscriptor listener) {
		this.listeners.add(listener);
	}
	
	
	
	

}
