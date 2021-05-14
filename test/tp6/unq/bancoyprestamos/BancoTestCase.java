package tp6.unq.bancoyprestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	Banco banco;
	ClienteNormal cliente1;
	ClienteNormal cliente2;
	ClienteNormal cliente3;
	ClienteNormal cliente4;
	SolicitudDeCreditoPersonal solicitud1;
	SolicitudDeCreditoHipotecario solicitud2;
	Propiedad casa = new Propiedad("Blanca y roja", 1000000, "Calle 453");
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco();
		cliente1 = new ClienteNormal("Nicolas", "Cundari", 26, "Calle 123", 1000); 
		cliente2 = new ClienteNormal("Marcela", "Denegri", 33, "Calle 123", 30000);
		cliente3 = new ClienteNormal("Nala", "Altair", 66, "Calle 432", 10000);
		cliente4 = new ClienteNormal("Pepe", "Ravioles", 66, "Calle 4322", 10000);
		solicitud1 = new SolicitudDeCreditoPersonal(cliente1, 2000, 4);// no pasa la solicitud bajo ingreso anual
		solicitud2= new SolicitudDeCreditoHipotecario(cliente2, 200000,20, casa); // pasa la solicitud hipotecaria
	}

	@Test
	void testAgregarCliente() {
		banco.addCliente(cliente1);
		banco.addCliente(cliente2);
		banco.addCliente(cliente3);
		assertEquals(3, banco.getClientes().size());
	}
	
	@Test
	void testAgregarSolicitud() {
		banco.agregarSolicitud(solicitud1);
		banco.agregarSolicitud(solicitud2);
		assertEquals(2, banco.getSolicitudes().size());
			
	}
	
	@Test
	void testClientePideSolicitud() {
		cliente1.solicitarCreditoPersonal(2000, 4, banco);
		cliente2.solicitarCreditoHipotecario(200000, 20, casa, banco);
		assertEquals(2, banco.getSolicitudes().size());
	}
	
	@Test
	void testSolicitudAceptadas() {
		banco.agregarSolicitud(solicitud1);
		banco.agregarSolicitud(solicitud2);
		banco.evaluarSolicitudes();
		assertEquals(1, banco.getSolicitudesAceptadas().size());
		assertEquals(1, banco.getSolicitudesRechazadas().size());
		
	}
	@Test
	void testDesembolsar() {
		banco.agregarSolicitud(solicitud2);
		banco.evaluarSolicitudes();
		assertEquals(200000, banco.cantidadADesembolsar());
		
	}

}
