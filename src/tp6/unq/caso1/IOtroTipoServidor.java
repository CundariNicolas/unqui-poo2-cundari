package tp6.unq.caso1;

public interface IOtroTipoServidor extends IServidor {
	public float tasaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();
}
