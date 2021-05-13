package tp6.unq.caso1;

import java.util.List;

public interface IServidor {
	
	public List<Correo> recibirNuevos(Usuario usuario);

	public void conectar(Usuario usuario);

	public void enviar(Correo correo);
	


}
