package tp6.unq.caso1;

import java.util.ArrayList;

public class Casilla {
	
	ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public Casilla() {
		inbox = new ArrayList<Correo>();
		borrados = new ArrayList<Correo>();
		
		
	}
	
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	

	
	

}
