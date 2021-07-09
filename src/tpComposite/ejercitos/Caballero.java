package tpComposite.ejercitos;

public class Caballero extends Clase {
	
	public Caballero(int posicionx, int posiciony, Mapa mapa) {
		this.setPosicionX(posicionx);
		this.setPosicionY(posiciony);
		this.setMapa(mapa);	
	}

	@Override
	public void avanzarHacia(Posicion posicion) {
		// Se mueve en en zigzag a traves de las posiciones
		
while(!(posicion.getPosicionX() == this.getPosicionX()) && !(posicion.getPosicionY() == this.getPosicionY())) {
			
			// MOVER EN X
			if(!(posicion.getPosicionX() == this.getPosicionX())) {
				if(posicion.getPosicionX() > this.getPosicionX()) {
					this.setPosicionX(this.getPosicionX() + 1);
					//ZIGAG
					this.setPosicionY(this.getPosicionY() + 1);
					this.setPosicionY(this.getPosicionY() - 1);
					
				
				}
				else {
					this.setPosicionX(this.getPosicionX() - 1);
					//ZIGZAG
					this.setPosicionY(this.getPosicionY() + 1);
					this.setPosicionY(this.getPosicionY() - 1);
				}
				
			}
			
			// mover en Y
			
			if(!(posicion.getPosicionY() == this.getPosicionY())) {
				if(posicion.getPosicionX() > this.getPosicionY()) {
					this.setPosicionY(this.getPosicionY() + 1);
					
					//ZIGZAG EN Y
					this.setPosicionX(this.getPosicionX() + 1);
					this.setPosicionX(this.getPosicionX() - 1);
					
				}
				else {
					this.setPosicionX(this.getPosicionX() - 1);
					//ZIGZAG EN Y
					this.setPosicionX(this.getPosicionX() + 1);
					this.setPosicionX(this.getPosicionX() - 1);
					
				}
				
			}
			
		}
		
	}


	
	

}
