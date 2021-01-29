package Tema4;

import java.util.Scanner;

public class MayorEdad {
	public static void main(String[] args) {
		int edad = 30;
		String nombre;
		Scanner sc = new Scanner(System.in);

		if (edad != 18) {
			System.out.println("Eres mayor de edad");
		} else if (edad < 0) {
			System.out.println("Aún no has nasido beibi");
		} else {
			System.out.println("Eres menor de edad");
		}

		System.out.print("Introduce tu nombre: ");
		nombre = sc.nextLine();

		if (nombre.equalsIgnoreCase("Jose")) {
			System.out.println("Eres un crack");
		} else {
			System.out.println("Buhhhh");
		}

		if (!(nombre.length() > 10) && !nombre.contains("Oswaldo")) {
			System.out.println("Eres un crack!!!!!!!");
		}

		if (!nombre.contains(" ")) {
			System.out.println("No tienes un nombre compuesto");
		}

		System.out.println("FIN");
		sc.close();
	}
}
