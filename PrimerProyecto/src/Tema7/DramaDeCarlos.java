package Tema7;

import java.util.Arrays;
import java.util.Scanner;

public class DramaDeCarlos {

	public static void main(String[] args) {
//		Crea un programa en Java que represente una clase de 30 puestos/pupitres. Este programa permitirá ir sentando a alumnos dejando siempre un hueco/puesto/pupitre entre alumno y alumno. Además, entre filas también habrá un hueco quedando una disposición tal que:
//
//			ALUMNO HUECO ALUMNO HUECO ALUMNO
//			HUECO ALUMNO  HUECO   ALUMNO HUECO
//			ALUMNO HUECO ALUMNO HUECO ALUMNO
//			HUECO ALUMNO  HUECO   ALUMNO HUECO
//			ALUMNO HUECO ALUMNO HUECO ALUMNO
//			HUECO ALUMNO  HUECO   ALUMNO HUECO
//
//			Esto se puede representar como una matriz de String, donde en cada celda pondremos el nombre del alumno correspondiente. 
//
//			Los alumnos se representan como un array de Strings de 30 alumnos (e.g.: "de la Torre López, José" sería un alumno dentro de ese array).
//			Este array se puede inicializar en el programa (no hay que meter los nombres por teclado durante ejecución). 
//
//			El programa deberá ORDENAR alfabéticamente la lista de alumnos y ubicar a los alumnos de la siguiente forma:
//
//			- Turno 1: la mitad de los alumnos (primera mitad del array) se sentarán por orden alfabético en las posiciones ALUMNO del siguiente diagrama empezando de arriba-izquierda y rellenando primero la fila antes de pasar a la siguiente fila:
//
//			ALUMNO1 HUECO ALUMNO2 HUECO ALUMNO3
//			HUECO ALUMNO4  HUECO   ALUMNO5 HUECO
//			ALUMNO6 HUECO ALUMNO7 HUECO ALUMNO8
//			HUECO ALUMNO9  HUECO   ALUMNO10 HUECO
//			ALUMNO11 HUECO ALUMNO12 HUECO ALUMNO13
//			HUECO ALUMNO14  HUECO   ALUMNO15 HUECO
//
//			-Turno 2: la otra mitad de los alumnos se sentará siguiendo la misma lógica pero en los puestos que hayan dejado libres los compañeros del turno anterior:
//
//			HUECO ALUMNO16  HUECO   ALUMNO17 HUECO
//			ALUMNO18 HUECO ALUMNO19 HUECO ALUMNO20
//			HUECO ALUMNO21  HUECO   ALUMNO22 HUECO
//			ALUMNO23 HUECO ALUMNO24 HUECO ALUMNO25
//			HUECO ALUMNO26  HUECO   ALUMNO27 HUECO
//			ALUMNO28 HUECO ALUMNO29 HUECO ALUMNO30
//
//			Al comenzar el programa, se mostrará la lista de los 30 alumnos ordenados alfabéticamente, posteriormente se preguntará al usuario qué turno desea ver: Turno 1 o Turno 2.
//			Al elegir una opción válida mostrará de manera gráfica dónde se sienta cada alumno en la clase. El programa volverá a preguntar si desea ver algún turno y ofrecerá una opción de salir en dicho menú.

		//Inicialización de variables.
		Scanner sc = new Scanner(System.in);
		int fil = 6;
		int col = 5;
		String[] alumnos = new String[30];
		String[][] huecos = new String[fil][col];
		int ialumno = 0;
//		int i = 0;
		
		//Relleno la clase
		alumnos[0] = " Mei ";
		alumnos[1] = " Reaper ";
		alumnos[2] = " McRee ";
		alumnos[3] = " Phara ";
		alumnos[4] = " Juan Rata ";
		alumnos[5] = " Reinhardt ";
		alumnos[6] = " Soldier76 ";
		alumnos[7] = " Keanu Reeves ";
		alumnos[8] = " Aanu ";
		alumnos[9] = " Ianu ";
		alumnos[10] = " Linlin ";
		alumnos[11] = " Tanu ";
		alumnos[12] = " Hanu ";
		alumnos[13] = " Wanu ";
		alumnos[14] = " Yanu ";
		alumnos[15] = " Sanu ";
		alumnos[16] = " Banu ";
		alumnos[17] = " Canu ";
		alumnos[18] = " Danu ";
		alumnos[19] = " Eanu ";
		alumnos[20] = " Janu ";
		alumnos[21] = " Fanu ";
		alumnos[22] = " Oanu ";
		alumnos[23] = " Zanu ";
		alumnos[24] = " Xanu ";
		alumnos[25] = " Orisha ";
		alumnos[26] = " Ranu ";
		alumnos[27] = " Ganu ";
		alumnos[28] = " Panu ";
		alumnos[29] = " Lanu ";

		Arrays.sort(alumnos);

		// Imprimo la clase (el vector de alumnos)
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}

		System.out.println();

		// Relleno e imprimo con HUECO
		for (int j = 0; j < fil; j++) {
			for (int j2 = 0; j2 < col; j2++) {
				huecos[j][j2] = " HUECO ";
				System.out.print(huecos[j][j2]);
			}
			System.out.println();
		}

		// TURNO 1 - Recorre la clase entera
//		for (int fila = 0; fila < fil; fila++) {
//			for (int columna = 0; columna < col; columna++) {
//				// Si el puesto es del turno 1 y es par fila y columna
//				if (ialumno >= 0 && ialumno < 15 && fila % 2 == 0 && columna % 2 == 0) { // Los siento en las posiciones
//																							// pares.
//					huecos[fila][columna] = alumnos[ialumno];
//					ialumno++;
//				}
//				// Si el puesto es del turno 1 y es IMpar fila y columna
//				else if (fila % 2 == 1 && columna % 2 == 1) {// Los siento en las posiciones impares.
//					huecos[fila][columna] = alumnos[ialumno];
//					ialumno++;
//				}
//			}
//		}

		// TURNO 2 - Recorre la clase entera
		ialumno=15;
		for (int fila = 0; fila < fil; fila++) {
			for (int columna = 0; columna < col; columna++) {
				// Si el puesto es del turno 2, fila es par y columna impar
				if (fila % 2 == 0 && columna % 2 == 1) { // Los siento en las posiciones																		// pares.
					huecos[fila][columna] = alumnos[ialumno];
					ialumno++;
				}
				// Si el puesto es del turno 2, fila impar y columna par
				else if (fila % 2 == 1 && columna % 2 == 0) {// Los siento en las posiciones impares.
					huecos[fila][columna] = alumnos[ialumno];
					ialumno++;
				}
			}
		}

		//Separador gráfico
		System.out.println("*****************");

		// Imprimir la clase
		for (int j = 0; j < fil; j++) {
			for (int j2 = 0; j2 < col; j2++) {
				System.out.print(huecos[j][j2]);
			}
			System.out.println();
		}
	}

}