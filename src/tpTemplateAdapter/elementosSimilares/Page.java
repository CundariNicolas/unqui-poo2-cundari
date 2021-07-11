package tpTemplateAdapter.elementosSimilares;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Page implements WikipediaPage{
	String titulo;
	ArrayList<WikipediaPage> linkedPages;
	Map<String, WikipediaPage> info;
	
	
	public Page(String titulo, ArrayList<WikipediaPage> linkedPages, Map<String, WikipediaPage> info) {
		this.titulo = titulo;
		this.linkedPages = linkedPages;
		this.info = info;
		
	}

	@Override
	public String getTitle() {
		return titulo;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		
		return linkedPages;
	}

	@Override
	public Map<String, WikipediaPage> getInfoBox() {
		
		return info;
	}

}
