package tp3.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTestCase {
	Punto punto1;
	Punto punto2;
	Punto punto3;
	Punto punto4;
	Punto punto5;
	Punto puntoSumado;
	
	@BeforeEach
	void setUp() throws Exception {
		punto1 = new Punto();
		punto2 = new Punto(3,6);
		punto3 = new Punto(-3,6);
		punto4 = new Punto(5,-5);
		punto5= new Punto(-6,-1);
		puntoSumado = punto2.sumarPunto(punto3);
	}

	@Test
	void testPuntoEnCero() {
		assertEquals(0, punto1.getX());
		assertEquals(0, punto1.getY());
		
	}
	@Test
	void testPunto() {
		assertEquals(3, punto2.getX());
		assertEquals(6, punto2.getY());
	}
	
	@Test
	void testSumaDePuntos() {
		assertEquals(0, puntoSumado.getX());
		assertEquals(12, puntoSumado.getY());
	}

}
