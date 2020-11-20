package models;

import java.time.LocalDate;

import enums.RazaPerro;

public class Perro extends Animal {

	private RazaPerro raza;
	private String microchip;
	
	public Perro(String nombre, LocalDate fechaNac, double peso, RazaPerro raza, String microchip) {
		super(nombre, fechaNac, peso);
		this.raza = raza;
		this.microchip = microchip;
	}


	public RazaPerro getRaza() {
		return raza;
	}

	public void setRaza(RazaPerro raza) {
		this.raza = raza;
	}

	public String getMicrochip() {
		return microchip;
	}

	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	}
	
	@Override
	public String toString() {
		String ficha = "Ficha del perro\n"
				+ "---------------\n"
				+ "Nombre: " + this.getNombre() + "\n"
				+ "Raza: " + this.getRaza() + "\n"
				+ "Fecha de nacimiento: "+ this.getFechaNac() + "\n" 
				+ "Peso: " + this.getPeso() + "kg \n"
				+ "Microchip: " + this.getMicrochip() + "\n"
				+ "Comentarios: " + this.getComentarios() + "\n";
				;				
		return ficha;
	}
	

	
}
