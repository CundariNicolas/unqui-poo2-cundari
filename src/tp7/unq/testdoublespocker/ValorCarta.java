package tp7.unq.testdoublespocker;

public enum ValorCarta {
	 DOS("2"), TRES("3"), CUATRO("4"), CINCO("5"), SEIS("6"), SIETE("7"), OCHO("8"), NUEVE("9"), DIEZ("10"), J("J"), Q("Q"), K("K"), A("A");
	
	private String valor;
	
	private ValorCarta(String valor) {
		this.valor = valor;
	}
	
	public String getValorCarta() {
		return valor;
	}

}
