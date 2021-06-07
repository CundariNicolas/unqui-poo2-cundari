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
	Carta carta6;
	Carta carta7;
	Carta carta8;
	Carta carta9;
	Carta carta10;
	Jugada jugada1;
	Jugada jugada2;
			
	@BeforeEach
	void setUp() throws Exception {
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		carta6 = mock(Carta.class);
		carta7 = mock(Carta.class);
		carta8 = mock(Carta.class);
		carta9 = mock(Carta.class);
		carta10 = mock(Carta.class);
		jugada1 = new Jugada(carta1, carta2, carta3, carta4, carta5);
		jugada2 = new Jugada(carta6, carta7, carta8, carta9, carta10);
		
	}

	@Test
	void testNada() {
		when(carta1.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta2.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta3.getValor()).thenReturn(ValorCarta.TRES);
		when(carta4.getValor()).thenReturn(ValorCarta.DOS);
		when(carta5.getValor()).thenReturn(ValorCarta.DOS);
		when(carta1.getPalo()).thenReturn(PaloCarta.D);
		when(carta4.getPalo()).thenReturn(PaloCarta.P);
		
	assertEquals(TipoJugada.NADA, poker.verificar(jugada1));	
	}
	
	@Test void testTrio() {
	when(carta1.getValor()).thenReturn(ValorCarta.DIEZ);
	when(carta2.getValor()).thenReturn(ValorCarta.DIEZ);
	when(carta3.getValor()).thenReturn(ValorCarta.DIEZ);
	when(carta4.getValor()).thenReturn(ValorCarta.DOS);
	when(carta5.getValor()).thenReturn(ValorCarta.DOS);
	when(carta1.getPalo()).thenReturn(PaloCarta.T);
	when(carta2.getPalo()).thenReturn(PaloCarta.D);
	assertEquals(TipoJugada.TRIO, poker.verificar(jugada1));
		
		
	}
	
	@Test 
	void testPoker() {
		when(carta1.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta2.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta3.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta4.getValor()).thenReturn(ValorCarta.DOS);
		when(carta5.getValor()).thenReturn(ValorCarta.DIEZ);
		assertEquals(TipoJugada.POKER, poker.verificar(jugada1));
	}
	
	@Test
	void testColor() {
		when(carta1.getPalo()).thenReturn(PaloCarta.D);
		when(carta2.getPalo()).thenReturn(PaloCarta.D);
		when(carta3.getPalo()).thenReturn(PaloCarta.D);
		when(carta4.getPalo()).thenReturn(PaloCarta.D);
		when(carta5.getPalo()).thenReturn(PaloCarta.D);
		assertEquals(TipoJugada.COLOR, poker.verificar(jugada1));
		
	}
	
	@Test
	void testCartaMayor() {
		when(carta1.getValor()).thenReturn(ValorCarta.A);
		when(carta2.getValor()).thenReturn(ValorCarta.Q);
		assertTrue(poker.cartaEsMayorQue(carta1, carta2));
	}
	
	@Test
	void testEsMismoPalo() {
		when(carta1.getPalo()).thenReturn(PaloCarta.D);
		when(carta2.getPalo()).thenReturn(PaloCarta.D);
		assertTrue(poker.sonMismoPalo(carta1, carta2));
	}
	
	
	@Test
	void testJugadaGanadora() {
		when(carta1.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta2.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta3.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta4.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta5.getValor()).thenReturn(ValorCarta.DOS);
		when(carta1.getPalo()).thenReturn(PaloCarta.T);
		when(carta2.getPalo()).thenReturn(PaloCarta.D);
		
		
		when(carta6.getPalo()).thenReturn(PaloCarta.D);
		when(carta7.getPalo()).thenReturn(PaloCarta.D);
		when(carta8.getPalo()).thenReturn(PaloCarta.D);
		when(carta9.getPalo()).thenReturn(PaloCarta.D);
		when(carta10.getPalo()).thenReturn(PaloCarta.D);
		when(carta10.getValor()).thenReturn(ValorCarta.DIEZ);
		when(carta9.getValor()).thenReturn(ValorCarta.DOS);
		when(carta7.getValor()).thenReturn(ValorCarta.TRES);
		when(carta8.getValor()).thenReturn(ValorCarta.OCHO);
		
		assertEquals(jugada1, poker.jugadaGanadoraEntre(jugada1, jugada2));
	}


@Test
void testJugadaGanadoraDeMismaJugada() {
	when(carta1.getValor()).thenReturn(ValorCarta.A);
	when(carta2.getValor()).thenReturn(ValorCarta.A);
	when(carta3.getValor()).thenReturn(ValorCarta.A);
	when(carta4.getValor()).thenReturn(ValorCarta.A);
	when(carta5.getValor()).thenReturn(ValorCarta.DOS);
	when(carta1.getPalo()).thenReturn(PaloCarta.T);
	when(carta2.getPalo()).thenReturn(PaloCarta.D);
	
	when(carta6.getValor()).thenReturn(ValorCarta.J);
	when(carta7.getValor()).thenReturn(ValorCarta.J);
	when(carta8.getValor()).thenReturn(ValorCarta.J);
	when(carta9.getValor()).thenReturn(ValorCarta.J);
	when(carta10.getValor()).thenReturn(ValorCarta.DOS);
	when(carta6.getPalo()).thenReturn(PaloCarta.T);
	when(carta7.getPalo()).thenReturn(PaloCarta.D);
	
	
	
	
	assertEquals(jugada1, poker.jugadaGanadoraEntre(jugada1, jugada2));
}
}
