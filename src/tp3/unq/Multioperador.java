package tp3.unq;

import java.util.ArrayList;

public class Multioperador {
	public Integer sumar(ArrayList<Integer> s) {
		
		Integer result = 0;
		
		for(Integer number : s) { result = result + number;}
		
		return result;
		
	}
	public Integer restar(ArrayList<Integer> s) {
		
		Integer result = 0;
		
		for(Integer number : s) {
			result = result - number;
			}
		/* Duda */
		
		
		return result;
	}
	public Integer multiplicar(ArrayList<Integer> s) {
		Integer result = 1;
		
		for(Integer number : s) { result = result * number;}
		
		return result;
	}
	
	

}
