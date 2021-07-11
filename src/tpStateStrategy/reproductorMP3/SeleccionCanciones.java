package tpStateStrategy.reproductorMP3;

public class SeleccionCanciones implements EstadoReproductor {

	@Override
	public void play(Song cancion, ReproductorMP3 re) {
		cancion.play(re);
		re.setState(new Reproduciendo());

	}

	@Override
	public void pause(Song cancion, ReproductorMP3 re) {
		re.lanzarError("Ninguna cancion se esta reproduciendo");

	}

	@Override
	public void stop(Song cancion, ReproductorMP3 re) {
		

	}

}
