package tp6.unq.bancoyprestamos;

public abstract class SolicitudDeCredito {
	Cliente cliente;
	int suma;
	int plazo;
	public int cuotaMensual() {
		return suma/plazo;
	}
	public int getSuma() {
		return suma;
	}
	public abstract boolean esAceptable();
	
}
