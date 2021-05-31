package tp7.unq.testdoublespocker;

public class Carta{
	
	private Integer valor;
	private String palo;
	

	public Carta(String valor, String palo) {
		this.setValor(valor);
		this.palo = palo;
	}

	public Integer getValor() {
		
		// TODO Auto-generated method stub
		return valor;
	}

	public String getPalo() {
		// TODO Auto-generated method stub
		return palo;
	}
	
	public void setValor(String valor) {
		if(valor.equals("A")) {
			this.valor = 14;
		}
		else if(valor.equals("K")) {
			this.valor = 13;
		}
		else if(valor.equals("Q")) {
			this.valor = 12;
		}
		else if(valor.equals("J")) {
			this.valor = 11;
		}
		else {
			this.valor = Integer.parseInt(valor);
		}
		
	}



	
	
}
