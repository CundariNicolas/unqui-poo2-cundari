package tpComposite.ejercitos;

import java.util.ArrayList;

public class Mapa {
	ArrayList<Posicion> mapa;
	
	public Mapa(ArrayList<Posicion> mapa) {
		this.mapa = mapa;
	}
	
	public ArrayList<Posicion> getMapa(){
		return mapa;
	}

}
