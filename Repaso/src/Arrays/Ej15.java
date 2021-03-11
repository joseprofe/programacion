package Arrays;

import java.util.Scanner;

public class Ej15 {
	public static void main(String[] args) {
		// Declaración de variables
		final int N_MESAS = 4;
		final int MAX_COMENSALES = 4;
		int[] mesas = new int[N_MESAS];
		// int[] mesas = {4,3,2,1};
		Scanner sc = new Scanner(System.in);
		int nPersonas = 0;
		boolean estanSentados = false;

		// Inicializo todas las mesas a 0 comensales
		for (int i = 0; i < mesas.length; i++) {
			mesas[i] = 0;
		}
		// Arrays.fill(mesas, 0); //Es lo mismo que el for de arriba
		do {
			do {
				imprimirEstadoMesas(mesas);
				System.out.println();
				System.out.print("¿Cuántas personas se van a sentar hoy? (-1 para cerrar programa): ");
				nPersonas = Integer.parseInt(sc.nextLine());

				if (nPersonas == -1) {
					System.out.println("Venga, nos vemos beibi");
					sc.close();
					System.exit(0);
				}

				if (nPersonas < 1 || nPersonas > 4) {
					System.out.println(
							"ERROR: No se puede sentar ese número hoy, por favor introduzca un número de personas entre 1 y 4.");
				}
				System.out.println("\n");
			} while (nPersonas < 1 || nPersonas > 4);

			// De momento el grupo no se ha sentado
			estanSentados = false;

			// Intentar sentar en una mesa vacía
			for (int i = 0; i < mesas.length; i++) {
				if (mesas[i] == 0) {
					mesas[i] = nPersonas;
					estanSentados = true;
					break;
				}
			}

			// Si no se ha sentado, sentar si cabe en alguna mesa
			if (!estanSentados) {
				for (int i = 0; i < mesas.length; i++) {
					if (mesas[i] + nPersonas <= MAX_COMENSALES) {
						mesas[i] = mesas[i] + nPersonas;
						estanSentados = true;
						break;
					}
				}
			}

			if (!estanSentados) {
				System.out.println("Ahora mismo no tenemos mesas disponibles, vuelve a intentarlo después.");
			}
		} while (true);

	}

	public static void imprimirEstadoMesas(int[] mesas) {
		// Imprimir estado de las mesas
		System.out.print("Mesas nº:\t");
		for (int i = 0; i < mesas.length; i++) {
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		System.out.print("Comensales:\t");
		for (int i = 0; i < mesas.length; i++) {
			System.out.print(mesas[i] + " ");
		}
	}
}
