package tp4.unq.mercado;

import java.util.ArrayList;

public class AgenciaRecaudadora implements Agencia{
	ArrayList<Factura> facturasPagas;
	public void registrarPago(Factura x) {
		facturasPagas.add(x);	
		
	}

}
