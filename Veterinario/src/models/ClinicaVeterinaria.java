package models;

import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {
	private List<Animal> listaAnimales;
	
	public ClinicaVeterinaria() {
		this.listaAnimales = new ArrayList<Animal>();
	}
	
	public void insertaAnimal(Animal a) {
		this.listaAnimales.add(a);
	}
	
	public Animal buscaAnimal(String nombre) {
		//Auxiliar para devolver
		Animal a = null;
		
		for (Animal elquemedelaganaChorizard : listaAnimales) {
			if(elquemedelaganaChorizard.getNombre().equals(nombre)) {
				a = elquemedelaganaChorizard;
			}
		}
		
		return a;
	}
	
	public void cambiarComentario(String nombre, String comentario) {
		Animal a = buscaAnimal(nombre);
		a.setComentarios(comentario);
	}
	
	@Override
	public String toString() {
		String s = "Listado de animales:\n";
		for (Animal animal : listaAnimales) {
			s += animal;
		}
		return s;
	}
}
