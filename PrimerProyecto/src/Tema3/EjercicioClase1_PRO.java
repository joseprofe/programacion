package Tema3;

import java.util.Scanner;

public class EjercicioClase1_PRO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N_ALUMNOS = 5;
		String[] nombres = new String[N_ALUMNOS];
		double[] notas = new double[N_ALUMNOS];
		double notaBaja = Double.MAX_VALUE;
		double notaAlta = Double.MIN_VALUE;
		double media = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce el nombre del alumno: ");
			nombres[i] = sc.nextLine();

			System.out.print("Introduce la nota de " + nombres[i] + ": ");
			notas[i] = Double.parseDouble(sc.nextLine());

			if (notaBaja > notas[i]) {
				notaBaja = notas[i];
			}
			if (notaAlta < notas[i]) {
				notaAlta = notas[i];
			}
			
			media += notas[i];
		}

		media /= N_ALUMNOS;
		System.out.println("La media de la clase es: " + media);
		System.out.println("La nota más baja es: " + notaBaja);
		System.out.println("La nota más alta es: " + notaAlta);
	}

}
