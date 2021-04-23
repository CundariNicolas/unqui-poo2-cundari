package tp3.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	void setUp() throws Exception {
		 
		//Se crea el contador
	   	 counter = new Counter();
	   	 
	   	 //Se agregan los numeros. Un solo par y nueve impares
	   	 counter.addNumber(1);
	   	 counter.addNumber(3);
	   	 counter.addNumber(5);
	   	 counter.addNumber(7);
	   	 counter.addNumber(9);
	   	 counter.addNumber(1);
	   	 counter.addNumber(1);
	   	 counter.addNumber(1);
	   	 counter.addNumber(1);
	   	 counter.addNumber(4);
	}

	@Test
	void testEvenNumbers() {
		
		int amount = counter.getEvenOcurrences();
		assertEquals(amount, 1);
	}

}
