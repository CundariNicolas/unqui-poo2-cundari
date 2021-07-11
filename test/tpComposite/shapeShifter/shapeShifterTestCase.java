package tpComposite.shapeShifter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class shapeShifterTestCase {
	
	Leaf hojaA;
	Leaf hojaB;
	Leaf hojaC;
	IShapeShifter compuesto1;
	IShapeShifter compuesto2;

	@BeforeEach
	void setUp() throws Exception {
		hojaA = new Leaf(1);
		hojaB = new Leaf(2);
		hojaC = new Leaf(3);
		
	
	}

	@Test
	void testCompose() {
		compuesto1 = hojaA.compose(hojaB);
		assertEquals(1, compuesto1.deepest());
		compuesto2 = compuesto1.compose(hojaC);
		System.out.println(compuesto2.values());
		
	}

}
