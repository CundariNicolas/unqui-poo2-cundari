package tpObserver.unq.ejercicios.encuentrosDeportivos;

import java.util.ArrayList;

public class Encuentro {
	private String resultado;
	private ArrayList<String> contrincantes;
	private String deporte;
	
	public Encuentro(String resultado, ArrayList<String> contrincantes, String deporte) {
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}
	
	public String getResultado() {
		return resultado;
	}

	public ArrayList<String> getContrincantes() {
		return contrincantes;
	}

	public String getDeporte() {
		return deporte;
	}

}
