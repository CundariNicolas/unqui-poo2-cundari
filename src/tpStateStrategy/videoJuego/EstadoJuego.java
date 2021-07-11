package tpStateStrategy.videoJuego;

public interface EstadoJuego {
	public void iniciar(VideoJuego videoJuego);
	public void ingresarFicha(VideoJuego videoJuego);
	public void perder(VideoJuego videoJuego);
}
