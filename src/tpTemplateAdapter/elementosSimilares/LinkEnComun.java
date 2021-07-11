package tpTemplateAdapter.elementosSimilares;

public class LinkEnComun extends Filtro{

	@Override
	protected boolean cumpleLogica(WikipediaPage page, WikipediaPage p) {
		
		return p.getLinks().stream().anyMatch(l -> page.getLinks().contains(l));
	}

}
