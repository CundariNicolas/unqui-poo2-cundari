package tp3.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	Rectangulo rectanguloVertical;
	Rectangulo rectanguloHorizontal;
	

	@BeforeEach
	void setUp() throws Exception {
		rectanguloVertical = new Rectangulo(2, 3, 20, 30);
		rectanguloHorizontal = new Rectangulo (1, 1, 30, -20);
	}

	@Test
	void testPosicionRectangulo() {
		assertEquals(2, rectanguloVertical.getPosicionX());
		assertEquals(3, rectanguloVertical.getPosicionY());
		
	}
	@Test
	void testBaseAltura() {
		assertEquals(20, rectanguloVertical.getBase());
		assertEquals(30, rectanguloVertical.getAltura());
		assertEquals(20, rectanguloHorizontal.getAltura());
	}
	@Test
	void testAreaPerimetro() {
		assertEquals(600,rectanguloVertical.getArea());
		assertEquals(100, rectanguloVertical.getPerimetro());
	}
	@Test
	void testHorizontalVertical() {
		assertTrue(rectanguloVertical.esVertical());
		assertTrue(rectanguloHorizontal.esHorizontal());
		assertFalse(rectanguloVertical.esHorizontal());
		assertFalse(rectanguloHorizontal.esVertical());
		}

}
