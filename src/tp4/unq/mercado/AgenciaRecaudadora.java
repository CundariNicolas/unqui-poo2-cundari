package tp4.unq.mercado;

import java.util.ArrayList;

public class AgenciaRecaudadora implements Agencia{
	private ArrayList<Factura> facturasPagas;
	
	
	public AgenciaRecaudadora() {
		facturasPagas = new ArrayList<Factura>();
	}
	public void registrarPago(Factura x) {
		facturasPagas.add(x);	
		
	}
	
	public ArrayList<Factura> getFacturasPagas() {
		return facturasPagas;
	}

}
