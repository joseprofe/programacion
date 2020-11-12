package es.iespablopicasso.winnie.models;

import java.util.ArrayList;

public class Profesor {

	private String nombre;
	private String apellido;
	private int edad;
	private double estatura;
	private ArrayList<Alumno> alumnos;	

	public Profesor(String nombre, String apellido, int edad, double estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.alumnos = new ArrayList<Alumno>();
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estatura=" + estatura
				+ "]";
	}
	
	public void anyadirAlumno(Alumno a) {
		this.alumnos.add(a);
	}
	
	public void pasarLista() {		
		for(Alumno a : this.alumnos) {
			a.saludar();
		}
	}
	
	public Alumno dameAlumno(int indice) {
		return this.alumnos.get(indice);
	}
	
	public int getTotalAlumnos() {
		return this.alumnos.size();
	}

}
