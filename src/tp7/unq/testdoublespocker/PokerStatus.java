package tp7.unq.testdoublespocker;

import java.util.ArrayList;

public class PokerStatus {
	
	public PokerStatus() {
		
	}

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		String jugada = "Nada";
		
		if(this.buscarMismoPalo(carta1, carta2, carta3, carta4, carta5) == 5) {
			jugada = "Color";
		}
		else if(this.buscarMismosValores(carta1, carta2, carta3, carta4, carta5) == 3) {
			jugada = "Trio";
		}
		else if(this.buscarMismosValores(carta1, carta2, carta3, carta4, carta5) >= 4) {
			jugada = "Poker";
		}
		
		
		
		
		return jugada;
	}
	
	public int buscarMismoPalo(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		int resultado = 0;
		int cantActual = 0;
		ArrayList <Carta> cartas = new ArrayList<Carta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		ArrayList<String> valores = new ArrayList<String>();
		
		for(Carta carta : cartas) {
			
			valores.add(carta.getPalo());
		}
			
		for(int i = 0; i < valores.size() ; i++) {
			for(int j = 0; j < valores.size(); j++) {
				if (valores.get(i).equals(valores.get(j))) {
					cantActual++;
				}
			}
			resultado = Math.max(cantActual, resultado);
			cantActual = 0;
		}
			
		
		
		return resultado;
	}
		
	


	public int buscarMismosValores(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		int resultado = 0;
		int cantActual = 0;
		ArrayList <Carta> cartas = new ArrayList<Carta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		for(Carta carta : cartas) {
			valores.add(carta.getValor());
		}
	
			
		for(int i = 0; i < valores.size() ; i++) {
			for(int j = 0; j < valores.size(); j++) {
				if (valores.get(i).equals(valores.get(j))) {
					cantActual++;
				}
			}
			resultado = Math.max(cantActual, resultado);
			cantActual = 0;
		}
			
		
		
		
	
		return resultado;
	
}

	public boolean esMayorQue(Carta carta1, Carta carta5) {
		
		return carta1.getValor() > carta5.getValor();
	}

	public boolean esMismoPalo(Carta carta1, Carta carta2) {
		
		return carta1.getPalo().equals(carta2.getPalo());
	}


	
}
