package tp3.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	Persona person1;
	Persona person2;
	@BeforeEach
	void setUp() throws Exception {
		person1 = new Persona("Pepe", 1994, 5 , 3);
		person2 = new Persona("Joel", 1996, 5 , 2);
	}

	@Test
	void test() {
		
		assertTrue(person2.menorQue(person1));
	}

}
