package models;

import java.time.LocalDate;

import enums.EspeciePajaro;

public class Pajaro extends Animal {

	private EspeciePajaro especie;
	private boolean cantor;

	public Pajaro(String nombre, LocalDate fechaNac, double peso, EspeciePajaro especie, boolean cantor) {
		super(nombre, fechaNac, peso);
		this.especie = especie;
		this.cantor = cantor;
	}

	public EspeciePajaro getEspecie() {
		return especie;
	}

	public void setEspecie(EspeciePajaro especie) {
		this.especie = especie;
	}

	public boolean isCantor() {
		return cantor;
	}

	public void setCantor(boolean cantor) {
		this.cantor = cantor;
	}

	@Override
	public String toString() {
		String ficha = "Ficha del pájaro\n"
				+ "---------------\n"
				+ "Nombre: " + this.getNombre() + "\n"
				+ "Especie: " + this.getEspecie() + "\n"
				+ "Fecha de nacimiento: "+ this.getFechaNac() + "\n" 
				+ "Peso: " + this.getPeso() + "kg \n"
				+ "Cantor: " + (this.isCantor() ? "Sí" : "No") + "\n"
				+ "Comentarios: " + this.getComentarios() + "\n";
				;				
		return ficha;
	}
	
	

}
