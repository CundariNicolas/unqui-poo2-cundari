package tpTemplateAdapter.elementosSimilares;

public class LinkEnComun extends Filtro{

	@Override
	protected boolean cumpleLogica(WikipediaPage page, WikipediaPage wikipedia) {
		
		return page.getLinks().stream().anyMatch(link -> wikipedia.getLinks().contains(link));
	}

}
