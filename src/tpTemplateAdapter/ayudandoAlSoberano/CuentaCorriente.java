package tpTemplateAdapter.ayudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria {
	private int descubierto;
	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;
		
	}

	@Override
	protected boolean esPosibleExtraerMonto(int monto) {
		
		return this.getSaldo() + this.getDescubierto() >= monto;
	}

	private int getDescubierto() {
		
		return descubierto;
	}

}
