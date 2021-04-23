package tp3.unq;

public class ExaminandoStrings {

	

	public static void main(String[] args) {
		 String a = "abc";
		 String s = a;
		 String t;
		 
		System.out.println(s.length()); 
		// Retorna 3
		
		
		// System.out.println(t.length()); La variable no fue inicializada
		
		
		
		 System.out.println(1+a); 
		 // retorna "1abc"
		 
		 System.out.println(a.toUpperCase()); 
		 // retorna "ABC
		 
		 System.out.println("Libertad".indexOf("r"));
		 // Retorna 4
		 System.out.println("Universidad".lastIndexOf("i"));
		 //Retorna 7
		 System.out.println("Quilmes".substring(2,4));
		 // Retorna "il"
		 System.out.println((a.length()+ a).startsWith("a"));
		 // Retorna false
		 System.out.println(s==a);
		 // Retorna true
		 System.out.println(a.substring(1,3).equals("bc"));
		 // Retorna true
		

	}

}
