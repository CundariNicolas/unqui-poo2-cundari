package tpStateStrategy.videoJuego;

public class Inicial implements EstadoJuego {
	
	@Override
	public void iniciar(VideoJuego maquina) {
		maquina.getPantalla().mostrarEnPantalla("No hay ficha");
	}

	@Override
	public void ingresarFicha(VideoJuego videoJuego) {
		videoJuego.setState(new UnJugador());
		
	}

	@Override
	public void perder(VideoJuego videoJuego) {
		videoJuego.getPantalla().mostrarEnPantalla("No comenzo el juego");
		
	}

}
