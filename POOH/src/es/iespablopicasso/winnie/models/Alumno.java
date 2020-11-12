package es.iespablopicasso.winnie.models;

public class Alumno {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private double estatura;
	private Profesor profesor;
	
	//Constructores
	public Alumno(String nombre, String apellido, int edad, double estatura, Profesor profesor) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estatura=" + estatura
				+ "]";
	}
	
	//Métodos
	public void saludar() {
		System.out.println("Buenos días proezoh, soy " + this.nombre);
	}
	
	public void despedirse() {
		System.out.println("Me largo!");
	}
	
}
