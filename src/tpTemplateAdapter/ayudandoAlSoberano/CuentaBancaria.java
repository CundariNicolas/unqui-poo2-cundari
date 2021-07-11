package tpTemplateAdapter.ayudandoAlSoberano;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;
	/**
	 * 
	 * Los cambios fueron realizar la extraccion desde la clase padre y solo dejar la responsabilidad
	 * a las subclases de saber si pueden extraer o no. Es la unica diferencia en los metodos que hay
	 * entre las clases hijas. 
	 * esPosibleExtraerMonto es la que se redefine en sus hijas para saber si pueden, y es la clase ahora
	 * primitiva. extraerMonto se volvio un metodo concreto de la clase padre
	 * 
	 */
	
	
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void agregarMovimientos(String movimiento) {
		this.movimientos.add(movimiento);
	}
	
	public void extraer(int monto) {
		if(this.esPosibleExtraerMonto(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extraccion");
		}
	}

	private void setSaldo(int i) {
		this.saldo = i;
		}

	protected abstract boolean esPosibleExtraerMonto(int monto);

}
