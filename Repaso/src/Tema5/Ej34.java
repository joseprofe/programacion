package Tema5;

import java.util.Scanner;

//Escribe un programa que pida dos números por teclado y 
//que luego mezcle en dos números diferentes los dígitos 
//pares y los impares. Se van comprobando los dígitos de la 
//siguiente manera: primer dígito del primer número, 
//primer dígito del segundo número, segundo dígito del primer número, 
//segundo dígito del segundo número, tercer dígito del primer número... 
//Para facilitar el ejercicio, podemos suponer que el usuario introducirá 
//dos números de la misma longitud y que siempre habrá al menos un dígito par y uno impar. 
//Usa long en lugar de int donde sea necesario para admitir números largos.

public class Ej34 {

	public static void main(String[] args) {
		String n1, n2;
		String impar = "", par = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("RECUERDA: deben tener la misma longitud o fallará el programa!");
		
		System.out.print("Introduce el primero número: ");
		n1 = sc.nextLine();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextLine();

//		System.out.println(n1);
//		System.out.println(n1.charAt(0));
//		System.out.println(n1.substring(2));
//		System.out.println(par + n1.charAt(0));

		for (int i = 0; i < n1.length(); i++) {
			// Pasar de char a int, restamos 48 porque es el comienzo de números en ASCII
			int digitoden1 = n1.charAt(i) - 48;
			int digitoden2 = n2.charAt(i) - 48;

			if (esPar(digitoden1)) {
				par += digitoden1;
			} else {
				impar += digitoden1;
			}

			if (esPar(digitoden2)) {
				par += digitoden2;
			} else {
				impar += digitoden2;
			}
		}

		System.out.println("Par = " + par);
		System.out.println("Impar = " + impar);

		sc.close();
	}

	public static boolean esPar(int n) {
		return n % 2 == 0;
	}

}
