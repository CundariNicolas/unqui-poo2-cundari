package tp3.unq;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public void addNumber(Integer i) {
		numbers.add(i);		
		
		
	}

	public int getEvenOcurrences() {
		int cant = 0;
		for(Integer i : numbers) {
			if(i%2 == 0) {
				cant++;
			}
			
		}
		return cant;
		}

}
