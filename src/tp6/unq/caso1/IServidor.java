package tp6.unq.caso1;

import java.util.List;

public interface IServidor {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	
	public float tasaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();

}
