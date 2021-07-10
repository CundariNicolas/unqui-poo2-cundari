package tpComposite.ejercicioUML;

import java.util.List;

public class CarroDeCompras {
	private List<Product> setElements;
	
	public List<Product> getElements() {
		return setElements;
	}
	
	public int totalRounded() {
		return Math.round(this.total());
		
	}
	public float total() {
		
		return this.setElements.stream().map(pr -> pr.getPrice()).reduce((a, b) -> a + b ).get();
	}
}
