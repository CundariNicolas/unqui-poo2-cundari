package tpComposite.cultivos;

import java.util.ArrayList;

public class Campos {
	
	ArrayList<Cultivo> campos;
	
	public Campos(){
		this.campos = new ArrayList<Cultivo>();
		}
	
	
	public void agregarCultivo(Cultivo cultivos) {
		this.campos.add(cultivos);
	}
	public Integer gananciaTotalAnual() {
		
		Integer res = 0;
		
		if(!this.campos.isEmpty()) {
			for(int i = 0; i < this.campos.size(); i++) {
				res = res + this.campos.get(i).gananciaAnual();
			};
			}
		return res; 
	}
	
	
}
