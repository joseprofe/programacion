package es.iespablopicasso.winnie.models;

import java.util.ArrayList;

public class Profesor extends Persona{

	private ArrayList<Alumno> alumnos;	

	public Profesor(String nombre, String apellido, int edad, double estatura) {
		super(nombre, apellido, edad, estatura);
		this.alumnos = new ArrayList<Alumno>();
	}
	
	@Override
	public String toString() {
		return "Profesor [alumnos=" + alumnos + ", toString()=" + super.toString() + "]";
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

	@Override
	public void comer() {
		System.out.println("Mmmm que rico...");
	}

}
