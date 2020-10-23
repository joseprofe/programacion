package Tema7;

import java.util.Arrays;

public class Repasito {

	public static void main(String[] args) {
		final int FIL = 6, COL = 5;
		String[] alumnos = { "b", "a", "g", "d", "e", "f", "c", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "za", "zb", "zc", "zd" };
		int indiceAlumnos = 0;
		// Ordenamos alfabéticamente los alumnos
		Arrays.parallelSort(alumnos);

//		for (int i = 0; i < alumnos.length; i++) {
//			System.out.println(alumnos[i]);
//		}

		// Es lo mismo que lo anterior
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}

		String[][] clase = new String[FIL][COL];

		// Llenamos la clase con HUECO.
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				clase[i][j] = "HUECO";
			}
		}
		
		//ES LO MISMO QUE LO DE ARRIBA
//		for (int i = 0; i < FIL; i++) {
//			Arrays.fill(clase[i], "HUECO");
//		}
		

		imprimirClase(clase);

		// Llenamos la clase con GRUPO 1.
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				if (i % 2 == 0 && j % 2 == 0) { // i (la fila) es par y la columna también
					clase[i][j] = alumnos[indiceAlumnos];
					indiceAlumnos++;
				} else if(i % 2 != 0 && j % 2 != 0) { //filas y columnas impares
					clase[i][j] = alumnos[indiceAlumnos];
					indiceAlumnos++;
				}
			}
		}
		
		imprimirClase(clase);
		
		
	}

	public static void imprimirClase(String[][] clase) {
		for (int i = 0; i < clase.length; i++) {
			for (int j = 0; j < clase[i].length; j++) {
				System.out.print(" " + clase[i][j] + " ");
			}
			System.out.println(); // Cambio de fila
		}
	}
}
