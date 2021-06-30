package tpObserver.unq.ejercicios.publicaciones;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublicacionesTestCase {
	Publicaciones publicaciones = new Publicaciones();
	ArrayList<String> autores= new ArrayList<String>();
	String autor1;
	String autor2;
	String autor3;
	
	ArrayList<String> palabrasClave = new ArrayList<String>();
	String palabra1;
	String palabra2;
	String palabra3;
	
	
	
	Articulo articulo1;
	Correo correo;
	Correo correoNoRecibir;
	
	Suscriptor suscriptor1;
	
	ArrayList<String> sinAutores;
	ArrayList<String> sinPalabras;
	
	Suscriptor suscriptor2;
	
	ArrayList<String> unaDeLasPalabrasClave;
	
	

	@BeforeEach
	void setUp() throws Exception {
		sinAutores = new ArrayList<String>();
		sinPalabras = new ArrayList<String>();
		unaDeLasPalabrasClave = new ArrayList<String>();
		unaDeLasPalabrasClave.add(palabra2);
		
		correo = mock(Correo.class);
		correoNoRecibir = mock(Correo.class);
		
		suscriptor1 = new Suscriptor("El nombre de los perros", autores , null, null, "New Can", unaDeLasPalabrasClave, correo);
		suscriptor2 = new Suscriptor("Aguante los gatos", sinAutores, null, null, null, sinPalabras, correoNoRecibir);
		
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		
		palabrasClave.add(palabra1);
		palabrasClave.add(palabra2);
		palabrasClave.add(palabra3);
		
		articulo1  = new Articulo("El nombre de los perros", autores, "La liga canina", "Tipo Perro", "New Can", palabrasClave);
		autor1 = "Pedro";
		autor2 = "Juan";
		autor3 = "Jorge";
		
		publicaciones.addListener(suscriptor1);
		publicaciones.addListener(suscriptor2);
	}

	@Test
	void test() { 
		publicaciones.cargarArticulo(articulo1);
		
		verify(correo, times(1)).notificar("Nuevo articulo");
		verify(correoNoRecibir, times(0)).notificar("Nuevo articulo");
	}

}
