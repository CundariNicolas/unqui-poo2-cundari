package tpTemplateAdapter.elementosSimilares;


import java.util.List;
import java.util.stream.Collectors;

public abstract class Filtro {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		return wikipedia.stream().filter(p -> this.cumpleLogica(page, p)).collect(Collectors.toList());
	}

	protected abstract boolean cumpleLogica(WikipediaPage page, WikipediaPage p);
}
