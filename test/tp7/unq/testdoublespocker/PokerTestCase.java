package tp7.unq.testdoublespocker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerTestCase {
	//SETUP
	PokerStatus poker;

	@BeforeEach
	void setUp() throws Exception {
		poker = new PokerStatus();
		
	}

	@Test
	void testPoker() {
		//EXERCISE Y VERIFY
		assertEquals("Poker", poker.verificar("10D","10D","10P","10P","10D"));
		assertEquals("Poker", poker.verificar("10P", "2D", "10P", "10P", "10P"));
		assertEquals("Poker", poker.verificar("1P", "1D", "10D", "1T", "1A"));
		
	}
	@Test
	void testTrio() {
		//EXERCISE Y VERIFY
		assertEquals("Trio", poker.verificar("3D", "3P", "10D", "3T", "1P"));
		assertEquals("Trio", poker.verificar("3D", "10T", "10D", "3T", "10P"));
		assertEquals("Trio", poker.verificar("2T", "2P", "10D", "3T", "2D"));
	}
	
	@Test
	void testNada() {
		//EXERCISE Y VERIFY
		assertEquals("Nada", poker.verificar("3P", "10P", "4T", "5P", "10P"));
	}
	
	@Test
	void testColor() {
		//EXERCISE Y VERIFY
		assertEquals("Color", poker.verificar("9D", "10D", "3D", "2D", "QD"));
		assertEquals("Color", poker.verificar("10D", "10D", "10D", "10D", "10D"));
	}
	
	
	@Test
	void testBuscarMismosValores() {
		//EXERCISE Y VERIFY
		assertEquals(5, poker.buscarMismosValores("4D", "4P", "4D", "4T", "4P"));
	}
	

}
