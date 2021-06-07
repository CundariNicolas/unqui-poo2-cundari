package tp7.unq.testdoublespocker;

public class PokerStatus {



	public TipoJugada verificar(Jugada jugada1) {
		
		return jugada1.getTipoJugada(jugada1);
	}

	public boolean cartaEsMayorQue(Carta carta1, Carta carta2) {
		return carta1.getValor().ordinal() > carta2.getValor().ordinal();
		
	}

	public boolean sonMismoPalo(Carta carta1, Carta carta2) {
		
		return carta1.getPalo() == carta2.getPalo();
	}

	public Jugada jugadaGanadoraEntre(Jugada jugada1, Jugada jugada2) {
		if(this.verificar(jugada1).ordinal() == this.verificar(jugada2).ordinal()) {
			
			return this.traerGanadorPorCartaMasAlta(jugada1, jugada2);
			
		} else {
			
		if(this.verificar(jugada1).ordinal() > this.verificar(jugada2).ordinal()) {
			return jugada1;}
		else { return jugada2; }
		
	}
	}

	private Jugada traerGanadorPorCartaMasAlta(Jugada jugada1, Jugada jugada2) {
		if(this.verificar(jugada1) == TipoJugada.COLOR) {
		 return this.ganadorDeJugadaPorPalo(jugada1, jugada2);
		}
		else {
		return this.ganadorDeJugadaPorValor(jugada1,jugada2);
		}
		
	}

	private Jugada ganadorDeJugadaPorValor(Jugada jugada1, Jugada jugada2) {
		if (jugada1.valorDeCartasDeJugadaMismoValor().ordinal() > jugada2.valorDeCartasDeJugadaMismoValor().ordinal()) {
			return jugada1;
		}
		else {
			return jugada2;
		}
	}

	private Jugada ganadorDeJugadaPorPalo(Jugada jugada1, Jugada jugada2) {
		if (jugada1.valorDeCartaJugadaMismoPalo().ordinal() > jugada2.valorDeCartaJugadaMismoPalo().ordinal()) {
			return jugada1;
		}
		else {
			return jugada2;
		}
		
	}

}
