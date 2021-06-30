package tpObserver.unq.ejercicios.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicacionTestCase {
	
	//SUT
	Aplicacion aplicacion1;
	
	//DOC
	PaginaPrueba pagina1;
	PaginaPrueba pagina2;
	PaginaPrueba pagina3;
	
	Encuentro encuentro1;
	Encuentro encuentro2;
	
	ArrayList<String> contrincantes1;
	ArrayList<String> contrincantes2;
	
	String equipo1;
	String equipo2;
	
	String contrincanteTenis1;
	String contrincanteTenis2;
	
	ArrayList<String> interes1;
	ArrayList<String> interes2;
	ArrayList<String> interes3;
	

	@BeforeEach
	void setUp() throws Exception {
		aplicacion1 = new Aplicacion();
		
		equipo1 = "River";
		equipo2 = "Boca";
		
		contrincanteTenis1 = "Federer";
		contrincanteTenis2 = "Nadal";
		
		contrincantes1 = new ArrayList<String>();
		contrincantes1.add(equipo1);
		contrincantes1.add(equipo2);
		
		contrincantes2 = new ArrayList<String>();
		contrincantes2.add(contrincanteTenis1);
		contrincantes2.add(contrincanteTenis2);
		
		
		interes1 = new ArrayList<String>();
		interes2 = new ArrayList<String>();
		interes3 = new ArrayList<String>();
		
		interes1.add(equipo1);
		
		interes2.add("Futbol");
		
		interes3.add(contrincanteTenis1);
		interes3.add("Futbol");
		
		pagina1 = mock(PaginaPrueba.class);
		pagina2 = mock(PaginaPrueba.class);
		pagina3 = mock(PaginaPrueba.class);
		
		
		encuentro1 = new Encuentro("Gano River", contrincantes1, "Futbol");
		encuentro2 = new Encuentro("Gano Federer", contrincantes2, "Tenis");
		
		
		
		aplicacion1.suscripcion(pagina1, interes1);
		aplicacion1.suscripcion(pagina2, interes2);
		aplicacion1.suscripcion(pagina3, interes3);
		
	}

	@Test
	void testNotificarCasoInteresEnRiver() {
		aplicacion1.recibirEncuentro(encuentro1);
		verify(pagina1, times(1)).notificar(encuentro1);
		
	}
	
	@Test
	void testNotificarCasoNoEsDeInteres() {
		aplicacion1.recibirEncuentro(encuentro2);
		verify(pagina2, times(0)).notificar(encuentro2);
	}
	@Test
	void testNotificarInteresAmbosIntereses() {
		aplicacion1.recibirEncuentro(encuentro1);
		verify(pagina3, times(1)).notificar(encuentro1);
		aplicacion1.recibirEncuentro(encuentro2);
		verify(pagina3, times(1)).notificar(encuentro2);
		
	}
	

}
