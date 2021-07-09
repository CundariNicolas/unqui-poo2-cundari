package tpComposite.ejercitos;

public class Ingeniero extends Clase {
	private int alajas;
	
	public Ingeniero(int posicionx, int posiciony, int alaja, Mapa mapa) {
		this.setPosicionX(posicionx);
		this.setPosicionY(posiciony);
		this.setMapa(mapa);
		this.alajas = alaja;
	}
	

	@Override
	public void avanzarHacia(Posicion posicion) {
		// avanza hacia la posicion de forma directa y poniendo una alaja si no habia una antes
		while(!(posicion.getPosicionX() == this.getPosicionX()) && !(posicion.getPosicionY() == this.getPosicionY())) {
			
			// MOVER EN X
			if(!(posicion.getPosicionX() == this.getPosicionX())) {
				if(posicion.getPosicionX() > this.getPosicionX()) {
					this.setPosicionX(this.getPosicionX() + 1);
					this.ponerAlajaSiNoHay();
				}
				else {
					this.setPosicionX(this.getPosicionX() - 1);
					this.ponerAlajaSiNoHay();
				}
				
			}
			
			// mover en Y
			
			if(!(posicion.getPosicionY() == this.getPosicionY())) {
				if(posicion.getPosicionX() > this.getPosicionY()) {
					this.setPosicionY(this.getPosicionY() + 1);
					this.ponerAlajaSiNoHay();
				}
				else {
					this.setPosicionX(this.getPosicionX() - 1);
					this.ponerAlajaSiNoHay();
				}
				
			}
			
		}
	}

	public void ponerAlajaSiNoHay() {
		
		
	}

	public int getAlajas() {
		return alajas;
	}

}
