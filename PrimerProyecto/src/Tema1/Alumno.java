package Tema1;

public class Alumno {
	int edad;
	String nombre;	

	/**
	 * Constructor de Alumnos
	 * @param edad edad del alumno
	 * @param nombre nombre del alumno
	 */
	public Alumno(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
