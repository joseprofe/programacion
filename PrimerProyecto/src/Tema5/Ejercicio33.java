package Tema5;

import java.util.Scanner;

public class Ejercicio33 {
	public static void main(String[] args) {

		int altura = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Dime la altura: ");
			altura = Integer.parseInt(sc.nextLine());
		} while (altura < 3);

		// Ya sabemos altura, hacemos algoritmo de la la U

		for (int linea = 0; linea < altura; linea++) { // Por cada línea
			if (linea != altura - 1) { //cualquier linea menos la última
				for (int caracter = 0; caracter < altura; caracter++) { // Por cada caracter o columna
					if (caracter == 0 || caracter == altura - 1) { // primero o último
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			} else { //última línea
				for (int caracter = 0; caracter < altura; caracter++) { // Por cada caracter o columna
					if (caracter == 0 || caracter == altura - 1) { // primero o último
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				}
			}
			System.out.println(); //intro después de cada línea
		}//fin del for

		sc.close();
	}
}
