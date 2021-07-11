package tpStateStrategy.videoJuego;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideoJuegoTestCase {
	VideoJuego videojuego;
	Pantalla pantalla;
	
	@BeforeEach
	void setUp() throws Exception {
	pantalla = mock(Pantalla.class);
	videojuego = new VideoJuego(pantalla);
	}

	@Test
	void testState() {
		videojuego.perder();
		verify(pantalla, times(1)).mostrarEnPantalla("No comenzo el juego");
		videojuego.ingresarFicha();
		videojuego.perder();
		verify(pantalla, times(2)).mostrarEnPantalla("No comenzo el juego");
		videojuego.iniciar();
		videojuego.ingresarFicha();
		verify(pantalla, times(1)).mostrarEnPantalla("Estas en juego");
		videojuego.perder(); // cambio a inicial
		videojuego.perder();
		verify(pantalla, times(3)).mostrarEnPantalla("No comenzo el juego");
		
	}

}
