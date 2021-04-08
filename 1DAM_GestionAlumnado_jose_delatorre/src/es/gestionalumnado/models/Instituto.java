package es.gestionalumnado.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Instituto {

	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private static Scanner sc = new Scanner(System.in);

	public static void mostrarMenu() {
		int opcion;
		do {
			System.out.println("OPCIONES");
			System.out.println("1. Registrar alumno");
			System.out.println("2. Ver alumnos");
			System.out.println("3. Buscar alumno");
			System.out.println("4. Borrar alumno");
			System.out.println("5. Generar boletines");
			System.out.println("6. Salir");
			System.out.print(">");
			opcion = Integer.parseInt(sc.nextLine());

			// Control de errores

			switch (opcion) {
			case 1:
				registrarAlumno();
				break;
			case 2:
				verAlumnos();
				break;
			case 3:
				buscarAlumno();
				break;
			case 4:
				borrarAlumno();
				break;
			case 5:
				boletines();
				break;
			case 6:
				System.out.println("Ok, adiós!");
				break;
			}
		} while (opcion != 6);
	}

	private static void registrarAlumno() {
		String nombre, clase;
		float n1, n2, n3;
		System.out.print("Introduce el nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduce la clase: ");
		clase = sc.nextLine();
		System.out.print("Introduce la nota de 1T: ");
		n1 = Float.parseFloat(sc.nextLine());
		System.out.print("Introduce la nota de 2T: ");
		n2 = Float.parseFloat(sc.nextLine());
		System.out.print("Introduce la nota de 3T: ");
		n3 = Float.parseFloat(sc.nextLine());

		Alumno a = new Alumno(nombre, clase, n1, n2, n3);
		alumnos.add(a);
	}

	private static void verAlumnos() {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	private static void buscarAlumno() {
		System.out.print("Dime el nombre del alumno a buscar: ");
		String nombre = sc.nextLine();
		boolean encontrado = false;

		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equals(nombre)) {
				System.out.println(alumno);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("Ese alumno no está en el sistema.");
		}
	}

	private static void borrarAlumno() {
		System.out.print("Dime el nombre del alumno a buscar: ");
		String nombre = sc.nextLine();
		Alumno alumnoEncontrado = null;

		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equals(nombre)) {
				alumnoEncontrado = alumno;
			}
		}

		if (alumnoEncontrado == null) {
			System.out.println("Ese alumno no está en el sistema.");
		} else {
			alumnos.remove(alumnoEncontrado);
			System.out.println("El alumno se ha BORRADO!");
		}
	}

	private static void boletines() {
		float notaMediaAcumulada = 0;
		for (Alumno alumno : alumnos) {
			notaMediaAcumulada += alumno.calcularMedia();
			System.out.println(alumno.getNombre() + " - " + " Media=" + alumno.calcularMedia());
		}
		System.out.println("Media del instituto=" + notaMediaAcumulada / alumnos.size());
	}
}
