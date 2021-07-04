package tpComposite.cultivos;

import java.util.ArrayList;

public class Mixto extends Cultivo {
	ArrayList<Cultivo> campos;
	public Mixto() {
		this.campos = new ArrayList<Cultivo>();
	}
	
	@Override
	public Integer gananciaAnual() {
		Integer res = 0;
		if(!this.campos.isEmpty()) {
		for(int i = 0; i < this.campos.size(); i++) {
			res = res + this.campos.get(i).gananciaAnual() / this.campos.size();
		};
		}
		return res;
	}

	@Override
	public void agregarCultivo(Cultivo cultivo) {
		this.campos.add(cultivo);
		
	}

	@Override
	public void removerCultivo(Cultivo cultivo) {
		this.campos.remove(cultivo);
		
	}

}
