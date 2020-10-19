package Tema7;

import java.util.Scanner;

//Escribe un programa que rellene un array de 100 elementos 
//con números enteros aleatorios comprendidos entre 0 y 500 
//(ambos incluidos). A continuación el programa mostrará el array 
//y preguntará si el usuario quiere destacar el máximo o el mínimo. 
//Seguidamente se volverá a mostrar el array 
//escribiendo el número destacado entre dobles asteriscos.
public class Ejercicio13 {

	public static void main(String[] args) {
		final int TAM = 10;
		final int LIMITE = 20;
		int vector[] = new int[TAM];
		int indiceMinimo = 0;
		int indiceMaximo = vector.length-1;
		Scanner sc = new Scanner(System.in);
		int opcion;

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * LIMITE);
		}

		for (int i = 0; i < vector.length; i++) {
			if (vector[indiceMinimo] > vector[i]) {
				indiceMinimo = i;
			}
			if (vector[indiceMaximo] < vector[i]) {
				indiceMaximo = i;
			}
		}
		
		//Imprimo el array una vez
		for (int i = 0; i < vector.length; i++) {
			if(i != vector.length - 1) { //Si no es el último le pongo coma
				System.out.print(vector[i] + ",");
			} else{
				System.out.print(vector[i]);
			}
			
//			System.out.print(vector[i] + ((i != vector.length - 1) ? "," : ""));
		}
		
		System.out.println();
		//pregunto por el destacado
		do {
			System.out.println("¿Quieres destacar el máximo (0) o el mínimo (1)?");
			opcion = Integer.parseInt(sc.nextLine());
		} while (opcion < 0 && opcion > 1);

		if (opcion == 1) { //Si quiere ver el destacado minimo
			for (int i = 0; i < vector.length; i++) {
				if (i == indiceMinimo) {
					System.out.print("**" + vector[i] + "**,");
				} else {
					System.out.print(vector[i] + ",");
				}

			}
		} else if (opcion == 0) {//Si quiere ver el destacado maximo
			for (int i = 0; i < vector.length; i++) {
				if (i == indiceMaximo) {
					System.out.print("**" + vector[i] + "**,");
				} else {
					System.out.print(vector[i] + ",");
				}

			}
		}

//		System.out.println();
//		System.out.println("Max: " + maximo);
//		System.out.println("Min: " + minimo);
		sc.close();
	}
}
