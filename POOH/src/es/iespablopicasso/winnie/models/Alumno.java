package es.iespablopicasso.winnie.models;

public class Alumno extends Persona {

	private double nota;

	// Constructores
	public Alumno(String nombre, String apellido, int edad, double estatura, double nota) {
		super(nombre, apellido, edad, estatura);
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	// Métodos
	public void saludar() {
		System.out.println("Buenos días proezoh, soy " + getNombre());
	}

	public void despedirse() {
		System.out.println("Me largo!");
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void comer() {
		System.out.println("ÑAM ÑAM ÑAM");
	}
}
