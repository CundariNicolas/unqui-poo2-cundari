package tp7.unq.testdoublespocker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Jugada {
	private ArrayList<Carta> cartas;
	
	public Jugada(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		cartas = new ArrayList<Carta>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
			
	}
	public TipoJugada getTipoJugada(Jugada jugada1) {
		TipoJugada resultado = TipoJugada.NADA;
		
		if(this.encontrarCartasMismoValor().size() == 3) {
			resultado = TipoJugada.TRIO;
		}
		if(this.encontrarCartasMismoPalo().size() == 5) {
			resultado = TipoJugada.COLOR;
		}
		if(this.encontrarCartasMismoValor().size() == 4) {
			resultado = TipoJugada.POKER;
		}
		
		return resultado;
	}
	
	private ArrayList<Carta> encontrarCartasMismoPalo() {
		ArrayList<Carta> c1 = new ArrayList<Carta>();
		ArrayList<Carta> c2 = new ArrayList<Carta>();
		ArrayList<Carta> c3 = new ArrayList<Carta>();
		ArrayList<Carta> c4 = new ArrayList<Carta>();
		ArrayList<Carta> c5 = new ArrayList<Carta>();
		
		c1 = cartas.stream().filter(carta -> carta.getPalo() == cartas.get(0).getPalo()).collect(Collectors.toCollection(ArrayList::new));
		c2 = cartas.stream().filter(carta -> carta.getPalo() == cartas.get(1).getPalo()).collect(Collectors.toCollection(ArrayList::new));
		c3 = cartas.stream().filter(carta -> carta.getPalo() == cartas.get(2).getPalo()).collect(Collectors.toCollection(ArrayList::new));
		c4 = cartas.stream().filter(carta -> carta.getPalo() == cartas.get(3).getPalo()).collect(Collectors.toCollection(ArrayList::new));
		c5 = cartas.stream().filter(carta -> carta.getPalo() == cartas.get(4).getPalo()).collect(Collectors.toCollection(ArrayList::new));
		
		ArrayList<ArrayList<Carta>> list = new ArrayList<ArrayList<Carta>>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		ArrayList<Carta> resultado = new ArrayList<Carta>();
		
		resultado = list.stream().max(Comparator.comparing(ArrayList::size)).get();
		
		return resultado;
	}
	public ArrayList<Carta> encontrarCartasMismoValor(){
		ArrayList<Carta> c1 = new ArrayList<Carta>();
		ArrayList<Carta> c2 = new ArrayList<Carta>();
		ArrayList<Carta> c3 = new ArrayList<Carta>();
		ArrayList<Carta> c4 = new ArrayList<Carta>();
		ArrayList<Carta> c5 = new ArrayList<Carta>();
		
		c1 = cartas.stream().filter(carta -> carta.getValor() == cartas.get(0).getValor()).collect(Collectors.toCollection(ArrayList::new));
		c2 = cartas.stream().filter(carta -> carta.getValor() == cartas.get(1).getValor()).collect(Collectors.toCollection(ArrayList::new));
		c3 = cartas.stream().filter(carta -> carta.getValor() == cartas.get(2).getValor()).collect(Collectors.toCollection(ArrayList::new));
		c4 = cartas.stream().filter(carta -> carta.getValor() == cartas.get(3).getValor()).collect(Collectors.toCollection(ArrayList::new));
		c5 = cartas.stream().filter(carta -> carta.getValor() == cartas.get(4).getValor()).collect(Collectors.toCollection(ArrayList::new));
		
		ArrayList<ArrayList<Carta>> list = new ArrayList<ArrayList<Carta>>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		ArrayList<Carta> resultado = new ArrayList<Carta>();
		
		resultado = list.stream().max(Comparator.comparing(ArrayList::size)).get();
		
		return resultado;
		
	}
	
	
	
	
	public ValorCarta valorDeCartasDeJugadaMismoValor() {
		return this.encontrarCartasMismoValor().get(0).getValor();
	}
	
	public ValorCarta valorDeCartaJugadaMismoPalo() {
		return this.encontrarCartasMismoPalo().stream().max(Comparator.comparing(Carta::getValor)).get().getValor();
	}

}
