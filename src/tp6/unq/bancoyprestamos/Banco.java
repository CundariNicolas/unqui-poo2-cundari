package tp6.unq.bancoyprestamos;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudesCreditos;
	private ArrayList<SolicitudDeCredito> solicitudesAceptadas;
	private ArrayList<SolicitudDeCredito> solicitudesRechazadas;
	
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
		solicitudesCreditos = new ArrayList<SolicitudDeCredito>();
		solicitudesAceptadas = new ArrayList<SolicitudDeCredito>();
		solicitudesRechazadas = new ArrayList<SolicitudDeCredito>();
	}
	
	
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}
	public void addCliente(Cliente cliente1) {
		
		this.clientes.add(cliente1);
		
	}


	public void agregarSolicitud(SolicitudDeCredito solicitud1) {
		this.solicitudesCreditos.add(solicitud1);
		
	}


	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		
		return solicitudesCreditos;
	}


	public void evaluarSolicitudes() {
		for(SolicitudDeCredito solicitud : solicitudesCreditos) {
			if(solicitud.esAceptable()) {
				solicitudesAceptadas.add(solicitud);
			}
			else {
				solicitudesRechazadas.add(solicitud);
			}
			
		}
	}


	public ArrayList<SolicitudDeCredito> getSolicitudesAceptadas() {
		return solicitudesAceptadas;
		
	}
	public ArrayList<SolicitudDeCredito> getSolicitudesRechazadas() {
		return solicitudesRechazadas;
		
	}
	
	public int cantidadADesembolsar() {
		int resultado = 0;
		ArrayList<SolicitudDeCredito> solicitudes = this.solicitudesAceptadas;
		if(!solicitudesAceptadas.isEmpty()) {
			for(SolicitudDeCredito solicitud : solicitudes) {
				resultado = resultado + solicitud.getSuma();
			}
		}
		return resultado;
	}
	

}
