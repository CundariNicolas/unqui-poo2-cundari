package tpTemplateAdapter.sueldosRecargados;

public class Pasante extends Empleados{

	public Pasante(int horas, int cantHijos, boolean casado) {
		super(horas, cantHijos, casado);
		
	}

	@Override
	protected int sueldoPorHijoOCasado() {
		
		return 0;
	}

	@Override
	protected int sueldoPorHora() {
		
		return 40 * this.getHoras();
	}

	@Override
	protected int sueldoBasico() {
		
		return 0;
	}

}
