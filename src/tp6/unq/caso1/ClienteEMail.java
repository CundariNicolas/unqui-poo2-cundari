package tp6.unq.caso1;

public class ClienteEMail {
	
	 IServidor servidor;
	 Usuario usuario;
	 Casilla casilla;

	
	public ClienteEMail(IServidor servidor, Usuario usuario){
		this.servidor=servidor;
		this.usuario = usuario;
		this.casilla = new Casilla();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(usuario);
	}
	
	public void recibirNuevos(){
		this.casilla.inbox.addAll(this.servidor.recibirNuevos(usuario));
	}
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
