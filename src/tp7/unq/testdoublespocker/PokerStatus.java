package tp7.unq.testdoublespocker;

import java.util.ArrayList;

public class PokerStatus {
	
	public PokerStatus() {
		
	}

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		// TODO Auto-generated method stub
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
	
	public int buscarMismoPalo(String carta1, String carta2, String carta3, String carta4, String carta5) {
		int resultado = 0;
		int cantActual = 0;
		ArrayList <String> cartas = new ArrayList<String>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		ArrayList<String> valores = new ArrayList<String>();
		
		for(String carta : cartas) {
			if(carta.length()>2) {
			valores.add(carta.substring(2));
			}
			else {
				valores.add(carta.substring(1));
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
			
		
		
		
	}
		return resultado;
	}


	public int buscarMismosValores(String carta1, String carta2, String carta3, String carta4, String carta5) {
		int resultado = 0;
		int cantActual = 0;
		ArrayList <String> cartas = new ArrayList<String>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		ArrayList<String> valores = new ArrayList<String>();
		
		for(String carta : cartas) {
			if(carta.length()>2) {
			valores.add(carta.substring(0, 2));
			}
			else {
				valores.add(carta.substring(0, 1));
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
			
		
		
		
	}
		return resultado;
	
}
	
}
