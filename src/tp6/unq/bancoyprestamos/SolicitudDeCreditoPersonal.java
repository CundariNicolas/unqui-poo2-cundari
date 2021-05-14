package tp6.unq.bancoyprestamos;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(Cliente cliente1, int suma, int plazo) {
		this.cliente = cliente1;
		this.suma = suma;
		this.plazo = plazo;
	}

	@Override
	public boolean esAceptable() {
		return ((cliente.getSueldoNetoMensual() * 12) >= 15000) && this.cuotaMensual() <= cliente.getSueldoNetoMensual() * 0.7 ;
	}

}
