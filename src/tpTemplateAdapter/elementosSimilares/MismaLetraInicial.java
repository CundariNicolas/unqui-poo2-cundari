package tpTemplateAdapter.elementosSimilares;

public class MismaLetraInicial extends Filtro{
	
	
	@Override
	protected boolean cumpleLogica(WikipediaPage page, WikipediaPage p) {
		return page.getTitle().charAt(0) == p.getTitle().charAt(0);
	}

}
