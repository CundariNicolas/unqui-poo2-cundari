package tp6.unq.bancoyprestamos;

public class Propiedad implements Inmueble {
	private int valorFiscal;
	private String descripcion;
	private String direccion;

	
	public Propiedad(String descripcion, int valorFiscal, String direccion) {
		this.descripcion = descripcion;
		this.valorFiscal = valorFiscal;
		this.direccion = direccion;
	}
	
	public int valor() {
		return valorFiscal;
	}

}
