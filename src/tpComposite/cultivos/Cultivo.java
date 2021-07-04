package tpComposite.cultivos;

public abstract class Cultivo {
	public abstract void agregarCultivo(Cultivo cultivo);
	public abstract void removerCultivo(Cultivo cultivo);
	public abstract Integer gananciaAnual();
}
