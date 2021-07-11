package tpStateStrategy.videoJuego;

public class EnJuego implements EstadoJuego {

	@Override
	public void iniciar(VideoJuego videoJuego) {
		videoJuego.getPantalla().mostrarEnPantalla("Estas en juego");

	}

	@Override
	public void ingresarFicha(VideoJuego videoJuego) {
		videoJuego.getPantalla().mostrarEnPantalla("Estas en juego");

	}

	@Override
	public void perder(VideoJuego videoJuego) {
		videoJuego.setState(new Inicial());

	}

}
