package tp6.unq.bancoyprestamos;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	Inmueble inmueble;
	public SolicitudDeCreditoHipotecario(Cliente cliente,int suma,int plazo, Inmueble inmueble) {
		this.cliente = cliente;
		this.suma = suma;
		this.plazo = plazo;
		this.inmueble = inmueble;
		
	}

	public boolean esAceptable() {
		return (this.cuotaMensual() <= cliente.getSueldoNetoMensual() && suma <= inmueble.valor()*0.7 && plazo <= (65 - cliente.edad()) * 12);
	};
	

}
