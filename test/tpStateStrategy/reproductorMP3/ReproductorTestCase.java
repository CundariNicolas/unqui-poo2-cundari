package tpStateStrategy.reproductorMP3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReproductorTestCase {
	ReproductorMP3 reproductor;
	Song cancion1;
	Song cancion2;

	@BeforeEach
	void setUp() throws Exception {
		reproductor = new ReproductorMP3();
		cancion1 = mock(Song.class);
	}
	@Test
	void testReproductor() {
		reproductor.seleccionarCancion(cancion1);
		reproductor.play();
		verify(cancion1, times(1)).play(reproductor);
		reproductor.pause();
		reproductor.stop();
		verify(cancion1, times(1)).stop(reproductor);
	}

}
