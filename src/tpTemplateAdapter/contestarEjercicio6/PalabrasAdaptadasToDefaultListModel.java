package tpTemplateAdapter.contestarEjercicio6;

import javax.swing.DefaultListModel;

public class PalabrasAdaptadasToDefaultListModel {
	DefaultListModel<String> list = new DefaultListModel<String>();
	
	public DefaultListModel<String> AdaptarPalabrasADefaultListModel(ListaDePalabrasOrdenada palabras){
		for(int i = 0; i < palabras.cantidadDePalabras(); i++) {
			list.addElement(palabras.getPalabraDePosicion(i));
		}
	}
	
}
