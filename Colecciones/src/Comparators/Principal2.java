package Comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		Persona p1 = new Persona("pedro", "perez", "gomez");
		Persona p2 = new Persona("angel", "alvarez", "zamora");
		Persona p3 = new Persona("ana", "perez", "jimenez");
		Persona p4 = new Persona("ana", "sainz", "jimenez");
		Persona p6 = new Persona("ana", "sainz", "perez");
		Persona p5 = new Persona("maria", "alvarez", "alvarez");

		List<Persona> lista = Arrays.asList(p1, p2, p3, p4, p5, p6);

		lista.forEach(System.out::println);

		lista.sort(((pa, pb) -> pa.getNombre().compareTo(pb.getNombre()) == 0
				? (pa.getApellido1().compareTo(pb.getApellido1()) == 0 ? pa.getApellido2().compareTo(pb.getApellido2())
						: pa.getApellido1().compareTo(pb.getApellido1()))
				: pa.getNombre().compareTo(pb.getNombre())));
		System.out.println("---");
		lista.forEach(System.out::println);

	}

}