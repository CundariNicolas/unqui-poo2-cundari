package tpTemplateAdapter.elementosSimilares;

public class PropiedadEnComun extends Filtro {

	@Override
	protected boolean cumpleLogica(WikipediaPage page, WikipediaPage p) {
		
		return page.getInfoBox().keySet().stream().anyMatch(s -> p.getInfoBox().keySet().contains(s));
	}

}
