package tp4.unq.mercado;

public class Impuesto implements Factura{
	private double tasaDelServicio;
	
	public Impuesto(double tasa) {
		this.tasaDelServicio = tasa;
	}
	public double montoAPagar() {
		
		return tasaDelServicio;
	}

}
