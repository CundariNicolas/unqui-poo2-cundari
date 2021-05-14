package tp6.unq.bancoyprestamos;

public class ClienteNormal implements Cliente {

	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private int sueldoNetoMensual;

	public ClienteNormal(String nombre, String apellido, int edad, String direccion, int sueldoNetoMensual) {
		
		this.setNombre(nombre);
		this.apellido = apellido;
		this.setEdad(edad);
		this.direccion = direccion;
		this.setSueldoNetoMensual(sueldoNetoMensual);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int edad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(int sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public void solicitarCreditoPersonal(int monto, int meses, Banco banco) {
		SolicitudDeCreditoPersonal misolicitud = new SolicitudDeCreditoPersonal(this ,monto, meses);
		banco.agregarSolicitud(misolicitud);
		
		
	}

	public void solicitarCreditoHipotecario(int monto, int meses, Inmueble casa, Banco banco) {
		SolicitudDeCreditoHipotecario misolicitud = new SolicitudDeCreditoHipotecario(this, monto, meses, casa);
		banco.agregarSolicitud(misolicitud);
	}

}
