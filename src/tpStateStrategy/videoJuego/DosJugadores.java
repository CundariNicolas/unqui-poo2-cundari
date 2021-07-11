package tpStateStrategy.videoJuego;

public class DosJugadores implements EstadoJuego {

	@Override
	public void iniciar(VideoJuego videoJuego) {
		videoJuego.setState(new EnJuego());

	}

	@Override
	public void ingresarFicha(VideoJuego videoJuego) {
		videoJuego.getPantalla().mostrarEnPantalla("No se puede ingresar mas fichas");

	}

	@Override
	public void perder(VideoJuego videoJuego) {
		videoJuego.getPantalla().mostrarEnPantalla("No comenzo el juego");

	}

}
