package tp3.unq;

import java.util.Date;

public class Persona {
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(String nombre, int anio, int mes, int dia) {
		this.nombre = nombre;
		this.fechaNacimiento = new Date((anio-1900), (mes - 1), dia);
	
		
	}
	
	public String nombre() {
		return nombre;
	}
	public Date fechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int edad() {
		int result;
		Date actual = new Date();
		result = actual.getYear() - fechaNacimiento.getYear() ;
		if(actual.getMonth() < fechaNacimiento.getMonth()) {
			result--;
		}
		else if(actual.getMonth() == fechaNacimiento.getMonth()) {
				if(actual.getDate() < fechaNacimiento.getDate()) {
					result--;
				}
		}
		return result;
	}
	
	public boolean menorQue(Persona otraPersona) {
		return this.edad() < otraPersona.edad(); 
	}
	
	
	public static void main(String[] args) {
		Persona person1 = new Persona("Nicolas Cundari", 1994, 5 , 3);
		
	}


	


}
