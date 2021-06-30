package tpObserver.unq.ejercicios.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aplicacion {
	private HashMap<SuscriptorListener, ArrayList<String>> suscriptor;
	
	public Aplicacion() {
		suscriptor = new HashMap<SuscriptorListener, ArrayList<String>>();
		
		
	}
	
	public void suscripcion(SuscriptorListener listener, ArrayList<String> palabrasclave) {
		this.suscriptor.put(listener, palabrasclave);
	}
	
	
	
	public void recibirEncuentro(Encuentro encuentro) {
		this.marcarSuscriptorYNotificar(encuentro);
	}
	
	private void marcarSuscriptorYNotificar(Encuentro encuentro) {
		this.suscriptor.forEach((k, v) -> this.notificarCorrespondiente(encuentro, k, v));
		
	}
	
	/**Garantiza que se notifique una sola vez por el encuentro si el deporte y los contrincantes son de su interes.
	 * Funciona para ambos tipos de suscriptores. Puede cumplirse una o la otra y garantizar que sean notificados
	 * solo por sus intereses
	 * 
	 * @param encuentro
	 * @param k
	 * @param v
	 */
	private void notificarCorrespondiente(Encuentro encuentro, SuscriptorListener k, ArrayList<String> v) {
		
		if(encuentro.getContrincantes().stream().anyMatch( contrincante -> v.stream().anyMatch(interes -> interes.equals(contrincante))) || v.contains(encuentro.getDeporte())) {
			k.notificar(encuentro);
		}
	}

}
