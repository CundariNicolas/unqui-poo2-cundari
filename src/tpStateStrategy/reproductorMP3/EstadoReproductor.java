package tpStateStrategy.reproductorMP3;

public interface EstadoReproductor {
	public void play(Song cancion, ReproductorMP3 re);
	public void pause(Song cancion, ReproductorMP3 re);
	public void stop(Song cancion, ReproductorMP3 re);
	

}
