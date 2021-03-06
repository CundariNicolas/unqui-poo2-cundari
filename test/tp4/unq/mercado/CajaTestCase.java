package tp4.unq.mercado;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	Caja caja1;
	ProductoNormal leche ;
	ProductoNormal jabon;
	ProductoNormal agua;
	ProductoCooperativa pan;
	ProductoCooperativa cereal;
	ProductoCooperativa arroz;
	ProductoCooperativa yerba;
	AgenciaRecaudadora agencia1;
	Servicio luz;
	Impuesto barrido;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		caja1 = new Caja();
		leche = new ProductoNormal(2, 44.43);
		jabon = new ProductoNormal(24, 64.22);
		agua = new ProductoNormal(45, 120.20);
		pan = new ProductoCooperativa(20, 90.00);
		cereal = new ProductoCooperativa(20, 43.00);
		arroz = new ProductoCooperativa(23, 25.00);
		yerba = new ProductoCooperativa(24, 24.00);
		/* ---------- Test para agencia --------------- */
		
		agencia1 = new AgenciaRecaudadora();
		luz = new Servicio(20, 200);
		barrido = new Impuesto(250);
		
		
	}

	@Test
	void testRegistroProducto() {
		caja1.registrarProducto(agua);
		caja1.registrarProducto(leche);
		assertEquals(164.63 ,caja1.totalAPagar());
		caja1.registrarProducto(cereal);
		assertEquals(203.33 ,caja1.totalAPagar());
		caja1.registrarProducto(arroz);
		assertEquals(225.83, caja1.totalAPagar());
		
	}
	@Test
	void testCobrar() {
		caja1.registrarProducto(agua);
		caja1.registrarProducto(leche);
		caja1.registrarProducto(cereal);
		assertEquals(203.33 ,caja1.totalAPagar());
		caja1.cobrarTotal();
		assertEquals(0, caja1.totalAPagar());
		
		
	}
	@Test
	void testFaltaStock() {
		caja1.registrarProducto(leche);
		caja1.registrarProducto(leche);
		ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> caja1.registrarProducto(leche),
				"No se puede registrar un producto mas");
		assertTrue(thrown.getMessage().contains("No hay stock"));
		
	}
	@Test
	void testCobrarServicioEImpuesto() {
		caja1.pagarFactura(barrido, agencia1);
		assertEquals(barrido, agencia1.getFacturasPagas().get(0));
		caja1.pagarFactura(luz, agencia1);
		assertEquals(luz, agencia1.getFacturasPagas().get(1));
		
	}
	
	@Test
	void testMonto() {
		caja1.pagarFactura(barrido, agencia1);
		caja1.pagarFactura(luz, agencia1);
		assertEquals(4250, caja1.totalAPagar());
		
		
	}

}
