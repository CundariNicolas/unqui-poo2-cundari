package tpTemplateAdapter.sueldosRecargados;

public class Planta extends Empleados{

	public Planta(int horas, int cantHijos, boolean casado) {
		super(horas, cantHijos, casado);
		
	}

	@Override
	protected int sueldoPorHijoOCasado() {
		
		return 150 * this.getCantHijos();
	}

	@Override
	protected int sueldoPorHora() {
		
		return 0;
	}

	@Override
	protected int sueldoBasico() {
		
		return 3000;
	}
	

}
