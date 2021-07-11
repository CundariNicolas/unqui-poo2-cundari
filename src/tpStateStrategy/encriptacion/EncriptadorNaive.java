package tpStateStrategy.encriptacion;

public class EncriptadorNaive {
	private StrategyEncriptacion estrategiaEncriptacion;
	
	public String encriptar(String oracion) {
		return this.estrategiaEncriptacion.encriptar(oracion);
	}
	
	public String desencriptar(String oracion) {
		return this.estrategiaEncriptacion.desencriptar(oracion);
	}
	
	public void setStrategy(StrategyEncriptacion estrategia) {
		this.estrategiaEncriptacion = estrategia;
	}

}
