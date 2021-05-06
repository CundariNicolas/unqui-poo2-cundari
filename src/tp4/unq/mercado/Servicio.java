package tp4.unq.mercado;

public class Servicio implements Factura {
	private double costoPorUnidad;
	private int unidadesConsumidas;
	public double montoAPagar() {
		return costoPorUnidad * unidadesConsumidas;
	}
	public Servicio(double costoPorUnidad, int unidadesConsumidas) {
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas= unidadesConsumidas;
	}
}
