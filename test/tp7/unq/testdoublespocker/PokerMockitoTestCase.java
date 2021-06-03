package tp7.unq.testdoublespocker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Respuestas MOCKITO */


/*
 * 2) Para especificar que el objeto mock debe recibir una secuencia de mensajes se usa la clase InOrder, instanciandolá pasandolé como parámetro
 * el objeto que queremos verificar en el orden en que se deben recibir los mensajes. Para verificarlo agregamos el orden luego. Ejemplo:
 * 
 * Mascota mascota1 = mock(Mascota.class)
 * Mascota mascota2 = mock(Mascota.class)
 * 
 * List <Mascota> spyMascotasPublicadas = spy(new ArrayList<Mascota>());
 * 
 * PaginaDeMascotas pagina = new PaginaDeMascotas(spyMascotas);
 * 
 * pagina.publicarNombrePagina(mascota1);
 * pagina.publicaNombreEnPagina(mascota2);
 * 
 * Publica las mascotas (las adhiere al array spyMascotasPublicadas)
 * 
 * InOrder orden = inOrder(spyMascotasPublicadas)
 * orden.verify(spyMascotasPublicadas).add(mascota1)
 * orden.verify(spyMascotasPublicadas).add(mascota2)
 * 
 * 
 * 3) Es posible con las funciones para setear valores en el objeto mock. Cuando se pregunta por un mensaje se puede setear el valor que necesites recibir.
 * 
 * 4) Es posible anidar mensajes de esta manera
 *	when(mockedList.contains(argThat(isValid()))).thenReturn(true);
 *
 *
 * 5) Puede verificar que a un objeto mock le fue envíado un mensaje, a esta función se le puede agregar
 * 	   un modo de verificación para ser más exactos en la verificación.
 *    Se puede verificar que no tuvo interacción, 
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  */

class PokerMockitoTestCase {
	/* SUT */
	PokerStatus poker = new PokerStatus();
	/* DOC */
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
			
	@BeforeEach
	void setUp() throws Exception {
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}

	@Test
	void testPoker() {
		
		
		when(carta1.getValor()).thenReturn(5);
		when(carta2.getValor()).thenReturn(5);
		when(carta3.getValor()).thenReturn(5);
		when(carta4.getValor()).thenReturn(5);
		when(carta5.getValor()).thenReturn(10);
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("D");
		
		assertEquals("Poker", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test void testTrio() {
		when(carta1.getValor()).thenReturn(3);
		when(carta2.getValor()).thenReturn(3);
		when(carta3.getValor()).thenReturn(3);
		when(carta4.getValor()).thenReturn(5);
		when(carta5.getValor()).thenReturn(10);
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("D");
		
		assertEquals("Trio", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test 
	void testNada() {
		when(carta1.getValor()).thenReturn(3);
		when(carta2.getValor()).thenReturn(4);
		when(carta3.getValor()).thenReturn(5);
		when(carta4.getValor()).thenReturn(6);
		when(carta5.getValor()).thenReturn(10);
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("P");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("D");
		
		assertEquals("Nada", poker.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void testColor() {
		when(carta1.getValor()).thenReturn(3);
		when(carta2.getValor()).thenReturn(4);
		when(carta3.getValor()).thenReturn(5);
		when(carta4.getValor()).thenReturn(6);
		when(carta5.getValor()).thenReturn(10);
		when(carta1.getPalo()).thenReturn("T");
		when(carta2.getPalo()).thenReturn("T");
		when(carta3.getPalo()).thenReturn("T");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("T");
		
		assertEquals("Color", poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	void testCartaMayor() {
		when(carta1.getValor()).thenReturn(5);
		when(carta2.getValor()).thenReturn(4);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(6);
		
		assertTrue(poker.esMayorQue(carta1, carta2));
		assertFalse(poker.esMayorQue(carta3, carta4));
	}
	
	@Test
	void testEsMismoPalo() {
		when(carta1.getPalo()).thenReturn("T");
		when(carta2.getPalo()).thenReturn("D");
		when(carta3.getPalo()).thenReturn("D");
		
		
		
		assertFalse(poker.esMismoPalo(carta1, carta2));
		assertTrue(poker.esMismoPalo(carta2, carta3));
	}
	
	@Test
	void testBuscarMismosValores() {
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(1);
		when(carta5.getValor()).thenReturn(10);
		when(carta1.getPalo()).thenReturn("T");
		when(carta2.getPalo()).thenReturn("T");
		when(carta3.getPalo()).thenReturn("T");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("T");
		//EXERCISE Y VERIFY
		assertEquals(4, poker.buscarMismosValores(carta1, carta2, carta3, carta4, carta5));
	}

}
