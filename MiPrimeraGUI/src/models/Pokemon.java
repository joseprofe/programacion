package models;

import java.util.ArrayList;

public class Pokemon {

	private int numero;
	private String nombre;
	private String descripcion;
	private ArrayList<Tipo> tipos;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(ArrayList<Tipo> tipos) {
		this.tipos = tipos;
	}

}
