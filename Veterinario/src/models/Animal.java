package models;

import java.time.LocalDate;

public abstract class Animal {

	protected String nombre;
	protected LocalDate fechaNac;
	protected double peso;
	protected String comentarios;

	public Animal(String nombre, LocalDate fechaNac, double peso) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", fechaNac=" + fechaNac + ", peso=" + peso + ", comentarios=" + comentarios
				+ "]";
	}

}
