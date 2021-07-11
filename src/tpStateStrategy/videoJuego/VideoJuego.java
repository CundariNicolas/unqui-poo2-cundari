package tpStateStrategy.videoJuego;

public class VideoJuego {
	private EstadoJuego estado;
	private Pantalla pantalla;
	
	public VideoJuego(Pantalla pantalla) {
		this.estado = new Inicial();
		this.pantalla = pantalla;
	}
	
	public void iniciar() {
		this.estado.iniciar(this);
	}
	
	public void ingresarFicha() {
		this.estado.ingresarFicha(this);
	}
	
	public void perder() {
		this.estado.perder(this);
	}
	
	public void setState(EstadoJuego state) {
		this.estado = state;
	}
	public EstadoJuego getState() {
		return this.estado;
	}
	
	public Pantalla getPantalla() {
		return this.pantalla;
	}
	
	
	

}
