package tpTemplateAdapter.sueldosRecargados;

public abstract class Empleados {
	private int horas;
	private int cantHijos;
	private boolean casado;
	
	public Empleados(int horas, int cantHijos, boolean casado) {
		this.horas = horas;
		this.cantHijos = cantHijos;
		this.casado = casado;
	}
	
	public final double sueldo() {
		return (this.sueldoTotal() - (this.sueldoTotal() * 0.13));
	}
	public final int sueldoTotal() {
		return this.sueldoBasico() + this.sueldoPorHora() + this.sueldoPorHijoOCasado();
	}

	protected abstract int sueldoPorHijoOCasado();

	protected abstract int sueldoPorHora();

	protected abstract int sueldoBasico();

	public int getCantHijos() {
		return this.cantHijos;
	}

	public int getHoras() {
		return this.horas;
	}
	
	public boolean getCasado() {
		return this.casado;
	}

}
