package tpTemplateAdapter.ayudandoAlSoberano;

public class CajaDeAhorro extends CuentaBancaria {
	private int limite;
	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}
	@Override
	protected boolean esPosibleExtraerMonto(int monto) {
		
		return monto <= this.limite;
	}

}
