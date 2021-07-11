package tpStateStrategy.reproductorMP3;

public class ReproductorMP3 {
	private EstadoReproductor estado;
	private Song cancionActual;
	
	public ReproductorMP3() {
		this.estado = new SeleccionCanciones();
	}
	
	public void play() {
		this.estado.play(this.cancionActual, this);
	}
	public void pause() {
		this.estado.pause(this.cancionActual, this);
	}
	public void stop() {
		this.estado.stop(this.cancionActual, this);
	}
	public void setState(EstadoReproductor state) {
		this.estado = state;
	}
	
	public EstadoReproductor getState() {
		return this.estado;
	}

	public void lanzarError(String string) {
		
	}
	
	public void seleccionarCancion(Song cancion) {
		this.cancionActual = cancion;
	}

}
