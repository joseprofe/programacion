package Tema5;

import java.util.Scanner;

public class Ej21 {

//	Realiza un programa que vaya pidiendo números hasta que se introduzca 
//	un numero negativo y nos diga cuantos números se han introducido, 
//	la media de los impares y el mayor de los pares. El número negativo 
//	sólo se utiliza para indicar el final 	de la introducción de datos pero 
//	no se incluye en el cómputo.
	public static void main(String[] args) {

		int a = 0;
		int contador = 0;
		int sumaImpares = 0;
		int contadorImpares = 0;
		int mayorPar = 0;
		Scanner sc = new Scanner(System.in);

		while (a >= 0) {
			System.out.print("Introduse un número, beibi: ");
			a = Integer.parseInt(sc.nextLine());

			// CóMPUTO
			if (a >= 0) {
				contador++;

				if (a % 2 == 0) { // Si es par
					// Quedarme con el mayor de los pares
					if (mayorPar < a) {
						mayorPar = a;
					}
				} else { // si es impar
					sumaImpares += a;
					contadorImpares++;
				}
			}
		}

		if (contador == 0) {
			System.out.println("Nene, no hay números...");
		} else{
			System.out.println("Hay " + contador + " numeros");
			System.out.println("El mayor de los pares es: " + mayorPar);
			System.out.println("La media de los impares es: " + sumaImpares / contadorImpares);
		}

		sc.close();

	}

}
