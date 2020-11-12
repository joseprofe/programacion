package Tema8;

import java.util.Scanner;

public class ConsolaHelper {

	static Scanner sc = new Scanner(System.in);

	public static void imprimirMenu() {
		System.out.println("1. Suma\n2. Resta");
	}

	public static int leerOpcionMenu() {
		int n;
		do {
			System.out.print("Introduce la opción deseada: ");
			n = Integer.parseInt(sc.nextLine());
			
			if(!opcionMenuValida(n)) {
				System.out.println("Error, valor fuera del rango permitido.");
			}
		} while (!opcionMenuValida(n));
		return n;
	}

	public static String leerNombre() {
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		return nombre;
	}

	public static boolean opcionMenuValida(int opcion) {
		if (opcion > 0 && opcion < 3)
			return true;
		else
			return false;
	}

}
