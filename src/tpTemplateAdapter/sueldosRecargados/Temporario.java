package tpTemplateAdapter.sueldosRecargados;

public class Temporario extends Empleados {

	public Temporario(int horas, int cantHijos, boolean casado) {
		super(horas, cantHijos,casado );
	}

	@Override
	protected int sueldoPorHijoOCasado() {
		if(this.getCasado() || this.getCantHijos() > 0) {
			return 100;
		}
		else {
			return 0;
		}
	}

	@Override
	protected int sueldoPorHora() {
		// TODO Auto-generated method stub
		return 5 * this.getHoras();
	}

	@Override
	protected int sueldoBasico() {
		// TODO Auto-generated method stub
		return 1000;
	}



}
