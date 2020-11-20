package es.iespablopicasso.winnie;

import java.util.ArrayList;

import es.iespablopicasso.winnie.models.Persona;

public class Programa {

	public static void main(String[] args) {

		ArrayList<Persona> lista = new ArrayList<Persona>();

//		for (Persona persona : lista) {
//			if (persona instanceof Alumno) {
//				((Alumno) persona).despedirse();
//			} else if (persona instanceof Profesor) {
//				((Profesor) persona).pasarLista();
//			}
//		}
		
		for (Persona persona : lista) {
			persona.comer();
		}

	}
}
