package tp7.unq.testdoublespocker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerTestCase {
	//SETUP
	PokerStatus poker;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	Carta carta6;
	Carta carta7;
	Carta carta8;
	Carta carta9;
	Carta carta10;

	@BeforeEach
	void setUp() throws Exception {
		poker = new PokerStatus();
		
		carta1= new Carta("10", "D");
		carta2= new Carta("10", "T");
		carta3= new Carta("10", "P");
		carta4= new Carta("10", "C");
		carta5= new Carta("9", "C");
		carta6= new Carta("9", "D");
		carta7= new Carta("9", "P");
		carta8= new Carta("7", "C");
		carta9= new Carta("Q", "C");
		carta10= new Carta("3", "C");
		
		
	}

	@Test
	void testPoker() {
		//EXERCISE Y VERIFY
		assertEquals("Poker", poker.verificar(carta1 , carta2, carta3, carta4, carta5));
		
	}
	@Test
	void testTrio() {
		//EXERCISE Y VERIFY
		
		assertEquals("Trio", poker.verificar(carta5,carta6, carta7, carta1, carta4));
		
	}
	
	@Test
	void testNada() {
		//EXERCISE Y VERIFY
		assertEquals("Nada", poker.verificar(carta2, carta5, carta1, carta7, carta8));
	}
	
	@Test
	void testColor() {
		//EXERCISE Y VERIFY
		assertEquals("Color", poker.verificar(carta4, carta5, carta8, carta9, carta10));
	}
	
	
	@Test
	void testBuscarMismosValores() {
		//EXERCISE Y VERIFY
		assertEquals(4, poker.buscarMismosValores(carta1, carta2, carta3, carta4, carta10));
	}
	
	@Test
	void testCartaMayor() {
		assertTrue(poker.esMayorQue(carta9, carta4));
		assertFalse(poker.esMayorQue(carta4, carta9));
	}
	
	@Test
	void testEsMismoPalo() {
		assertFalse(poker.esMismoPalo(carta1, carta2));
		assertTrue(poker.esMismoPalo(carta1, carta6));
	}
	

}
