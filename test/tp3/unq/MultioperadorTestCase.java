package tp3.unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	ArrayList<Integer> arregloEnteros = new ArrayList<Integer>();
	ArrayList<Integer> arregloEnteros2 = new ArrayList<Integer>();
	ArrayList<Integer> arregloEnteros3 = new ArrayList<Integer>();
	Multioperador operador = new Multioperador();
	@BeforeEach
	void setUp() throws Exception {
		
		
		arregloEnteros.add(3);
		arregloEnteros.add(5);
		arregloEnteros.add(2);
		
		
		
		arregloEnteros2.add(-2);
		arregloEnteros2.add(-5);
		arregloEnteros2.add(-5);
		
		
		
		arregloEnteros3.add(-4);
		arregloEnteros3.add(10);
		arregloEnteros3.add(-1);
		
	}

	@Test
	void testOperadoresSumar() {
		
		
		assertEquals(10, operador.sumar(arregloEnteros));
		assertEquals(-12, operador.sumar(arregloEnteros2));
		assertEquals(5, operador.sumar(arregloEnteros3));
		
		
		
	}
	
	@Test
	void testOperadoresResta() {
		assertEquals(-10, operador.restar(arregloEnteros));
		assertEquals(12 ,operador.restar(arregloEnteros2));
		assertEquals(-5, operador.restar(arregloEnteros3));
	}
	@Test
	void testOperadoresMult() {
		assertEquals(30, operador.multiplicar(arregloEnteros));
		assertEquals(-50, operador.multiplicar(arregloEnteros2));
		assertEquals(40, operador.multiplicar(arregloEnteros3));
	}

}
