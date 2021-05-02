package tp3.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	Cuadrado cuadrado1;
	@BeforeEach
	void setUp() throws Exception {
		cuadrado1 = new Cuadrado(2, 3, 20);
		
	}

	@Test
	void test() {
		assertEquals(2, cuadrado1.getPosicionX());
		assertEquals(3, cuadrado1.getPosicionY());
	}
	@Test
	void testBaseAltura() {
		assertEquals(20, cuadrado1.getBase());
		assertEquals(20, cuadrado1.getAltura());
		
	}
	@Test
	void testAreaPerimetro() {
		assertEquals(400,cuadrado1.getArea());
		assertEquals(80, cuadrado1.getPerimetro());
	}

}
