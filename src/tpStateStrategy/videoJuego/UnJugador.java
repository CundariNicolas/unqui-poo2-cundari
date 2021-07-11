package tpStateStrategy.videoJuego;

public class UnJugador implements EstadoJuego {

	@Override
	public void iniciar(VideoJuego maquina) {
		maquina.setState(new EnJuego());
	}

	@Override
	public void ingresarFicha(VideoJuego videoJuego) {
		videoJuego.setState(new DosJugadores());
		
	}

	@Override
	public void perder(VideoJuego videoJuego) {
		videoJuego.getPantalla().mostrarEnPantalla("No comenzo el juego");

	}

}
