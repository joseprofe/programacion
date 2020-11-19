package Tema5;

import java.util.Scanner;

//Realiza un programa que calcule el máximo, el mínimo y 
//la media de una serie de números enteros positivos 
//introducidos por teclado. El programa terminará cuando 
//el usuario introduzca un número primo. Este último número 
//no se tendrá en cuenta en los cálculos. El programa debe indicar 
//también cuántos números ha introducido el usuario (sin contar el 
//primo que sirve para salir).
public class Ejercicio49 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, cuenta = 0, num;
		double media = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Dime un número: ");
			num = Integer.parseInt(sc.nextLine());
			if (!esPrimo(num)) {
				if (max < num) {
					max = num;
				}
				media += num;
				cuenta++;
				if (min > num) {
					min = num;
				}
			}
		} while (!esPrimo(num));

		System.out.println("Se han introducido " + cuenta + " numeros");
		System.out.println("El mayor es: " + max);
		System.out.println("El menor es: " + min);
		System.out.println("La media es: " + media / cuenta);

		sc.close(); // siempre al final del main
	}

	public static boolean esPrimo(int elNumeraso) {
		for (int j = 2; j < elNumeraso; j++) { // Compruebo desde 2 hasta elNumeraso
			if (elNumeraso % j == 0) {
				return false;
			}
		}
		return true;
	}
}
