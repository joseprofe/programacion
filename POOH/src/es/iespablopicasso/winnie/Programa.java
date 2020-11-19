package es.iespablopicasso.winnie;

import es.iespablopicasso.winnie.models.Alumno;
import es.iespablopicasso.winnie.models.Profesor;

public class Programa {

	public static void main(String[] args) {
		Profesor joze = new Profesor("Jose","de la Torre", 30, 1.72);
		Alumno p = new Alumno("Pep","Guardiola",40,1.75,joze);
		Alumno cr7 = new Alumno("Cris","Ronaldo",36,1.87,joze);
	
		System.out.println(joze);
		
		joze.anyadirAlumno(cr7);
		joze.anyadirAlumno(p);
		joze.anyadirAlumno(new Alumno("Lili","Peres",18,1.7,joze));
	
		joze.pasarLista();
		
		Alumno a = joze.dameAlumno(2);
		Alumno b = joze.dameAlumno(1);
		
		int total = joze.getTotalAlumnos();
		
		System.out.println("El total de alumnos ahora es: " + total);
	}

}
