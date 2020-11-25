package es.iespablopicasso.winnie;

import java.util.ArrayList;

import es.iespablopicasso.winnie.models.Persona;
import es.iespablopicasso.winnie.models.Punto;

public class Programa {

	public void main(String[] args) {

		ArrayList<Persona> lista = new ArrayList<Persona>();

//		for (Persona persona : lista) {
//			if (persona instanceof Alumno) {
//				((Alumno) persona).despedirse();
//			} else if (persona instanceof Profesor) {
//				((Profesor) persona).pasarLista();
//			}
//		}
		
//		Persona p = new Alumno(nombre, apellido, edad, estatura, nota);
//		
//		for (Persona persona : lista) {
//			persona.comer();
//		}
		
		Punto p = new Punto(1,2);
		Punto p2 = new Punto(4,1);
		
		p.suma(p2);
		p.dobla();
	}
}
