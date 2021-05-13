package tp6.unq.caso1;

public class Usuario {
	private String nombreUsuario;
	private String passUsuario;
	
	public Usuario(String usuario, String pass) {
		this.nombreUsuario = usuario;
		this.passUsuario = pass;
	}
	public String getUsuario() {
		return nombreUsuario;
	}
	public String getPass() {
		return passUsuario;
	}

}
