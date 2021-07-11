package tpTemplateAdapter.contestarEjercicio6;

import javax.swing.DefaultListModel;

public class PalabrasAdaptadasToDefaultListModel {
	
	
	public DefaultListModel<String> AdaptarPalabrasADefaultListModel(ListaDePalabrasOrdenada palabras){
		DefaultListModel<String> list = new DefaultListModel<String>();
		for(int i = 0; i < palabras.cantidadDePalabras(); i++) {
			list.addElement(palabras.getPalabraDePosicion(i));
		}
		return list;
	}
	
}
