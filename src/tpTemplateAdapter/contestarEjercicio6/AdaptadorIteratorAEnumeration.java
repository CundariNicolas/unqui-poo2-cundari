package tpTemplateAdapter.contestarEjercicio6;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class AdaptadorIteratorAEnumeration<E> {
	public Enumeration<E> adaptarIterator(Iterator<E> iterador) {
		Vector<E> vector = new Vector<E>();
		iterador.forEachRemaining(e -> vector.add(e));
		
		return vector.elements();
		
	}
}
