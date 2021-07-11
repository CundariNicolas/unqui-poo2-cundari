package tpStateStrategy.reproductorMP3;

public class Reproduciendo implements EstadoReproductor {

	@Override
	public void play(Song cancion, ReproductorMP3 re) {
		re.lanzarError("No esta en modo seleccion de canciones");
		
	}

	@Override
	public void pause(Song cancion, ReproductorMP3 re) {
		cancion.pause(re);
		re.setState(new EnPausa());
		
	}

	@Override
	public void stop(Song cancion, ReproductorMP3 re) {
		cancion.stop(re);
		re.setState(new SeleccionCanciones());
		
	}

}
