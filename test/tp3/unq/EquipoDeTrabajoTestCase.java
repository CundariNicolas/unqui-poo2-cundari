package tp3.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	EquipoDeTrabajo equipo1;
	Persona persona1;
	Persona persona2;
	Persona persona3;
	Persona persona4;
	Persona persona5;
	

	@BeforeEach
	void setUp() throws Exception {
		equipo1 = new EquipoDeTrabajo("EquipoUno");
		persona1 = new Persona("Nico", 1994, 8, 4);
		persona2 = new Persona("Jose", 1994, 8, 4);
		persona3 = new Persona("Juan", 1994, 8, 4);
		persona4 = new Persona("Fede", 1994, 8, 4);
		persona5 = new Persona("Mar", 1994, 8, 4);
		
		equipo1.agregarIntegrante(persona1);
		equipo1.agregarIntegrante(persona2);
		equipo1.agregarIntegrante(persona3);
		equipo1.agregarIntegrante(persona4);
		equipo1.agregarIntegrante(persona5);
	}

	@Test
	void test() {
		assertEquals("EquipoUno", equipo1.getNombre());
		assertEquals(26, equipo1.promedioEdades());
	}

}
