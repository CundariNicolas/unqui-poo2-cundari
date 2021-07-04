package tpComposite.cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivosTestCase {
	Campos campo1;
	
	
	Mixto mixto1;
	
	Soja soja1;
	Soja soja2;
	Soja soja3;
	
	Trigo trigo1;
	Trigo trigo2;
	Trigo trigo3;
	
	@BeforeEach
	void setUp() throws Exception {
		trigo1 = new Trigo(); //300
		trigo2 = new Trigo(); // 300/4 = 75
		trigo3 = new Trigo(); // 300/4 = 75
		
		soja1 = new Soja(); // 500
		soja2 = new Soja(); // 500/4 = 125
		soja3 = new Soja(); // 500/4 = 125
		
		// TOTAL =  1200 
		
		mixto1 = new Mixto();
		mixto1.agregarCultivo(soja2);
		mixto1.agregarCultivo(soja3);
		mixto1.agregarCultivo(trigo2);
		mixto1.agregarCultivo(trigo3);
		
		
		campo1 = new Campos();
		campo1.agregarCultivo(mixto1);
		campo1.agregarCultivo(soja1);
		campo1.agregarCultivo(trigo1);
	}

	@Test
	void test() {
		assertEquals(1200, campo1.gananciaTotalAnual());
	}

}
