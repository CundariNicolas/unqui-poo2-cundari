package tpTemplateAdapter.elementosSimilares;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroTestCase {
	
	MismaLetraInicial porLetra;
	LinkEnComun porLink;
	PropiedadEnComun porPropiedad;
	
	Page page1;
	Page page2;
	Page page3;
	Page page4;
	Page page5;
	Page page6;
	Page page7;
	
	ArrayList<WikipediaPage> linkeados1;
	ArrayList<WikipediaPage> linkeados2;
	ArrayList<WikipediaPage> linkeados3;
	ArrayList<WikipediaPage> linkeados4;
	ArrayList<WikipediaPage> linkeados5;
	
	Map<String, WikipediaPage> info1;
	Map<String, WikipediaPage> info2;
	
	ArrayList<WikipediaPage> similares;
	ArrayList<WikipediaPage> similares2;
	
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		similares = new ArrayList<WikipediaPage>();
		similares2 = new ArrayList<WikipediaPage>();
		
		porLetra = new MismaLetraInicial();
		porLink = new LinkEnComun();
		porPropiedad = new PropiedadEnComun();
		
		linkeados1 = new ArrayList<WikipediaPage>();
		linkeados2 = new ArrayList<WikipediaPage>();
		linkeados3 = new ArrayList<WikipediaPage>();
		linkeados4 = new ArrayList<WikipediaPage>();
		linkeados5 = new ArrayList<WikipediaPage>();
		
		info1 = new HashMap<String, WikipediaPage>();
		info2 = new HashMap<String, WikipediaPage>();
		
		linkeados1.add(page1);
		linkeados2.add(page2);
		linkeados2.add(page3);
		linkeados2.add(page4);
		linkeados3.add(page5);
		linkeados3.add(page6);
		linkeados4.add(page7);
		linkeados5.add(page1);
		
		
		
		info1.put("birth_place", page1);
		info1.put("birth_place", page2);
		info1.put("birth_place", page3);
		info2.put("starwars", page4);
		info2.put("starwars", page5);
		info2.put("starwars", page6);
		info2.put("starwars", page7);
		
		page1 = new Page("Star Wars", linkeados2, info2);
		page2 = new Page("Sith", linkeados1, info2);
		page3 = new Page("Sala", linkeados2, info1);
		page4 = new Page("Quilmes", linkeados2, info1);
		page5 = new Page("Bernal", linkeados3, info1);
		page6 = new Page("Salmon", linkeados4, info2);
		page7 = new Page("Bernal", linkeados5, info2);
		
		similares.add(page1);
		similares.add(page2);
		similares.add(page3);
		similares2.add(page4);
		similares2.add(page5);
		similares2.add(page6);
		similares2.add(page7);
	}

	@Test
	void testPorLetra() {
		assertEquals(1, porLetra.getSimilarPages(page1, similares2).size());
		assertEquals(3, porLetra.getSimilarPages(page6, similares).size());
		
	}
	
	
	
	@Test
	void testPorPropiedad() {
		assertEquals(2, porPropiedad.getSimilarPages(page1, similares2).size());
	}
	
	@Test
	void testPorLink() {
		// revisar algoritmo en linkencomun
		assertEquals(1, porLink.getSimilarPages(page2, similares2).size());
	}

}
