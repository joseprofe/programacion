package Tema7;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		final int NMESAS = 4;
		final int MAXCAPACIDAD = 4;
		 int[] mesas = new int[NMESAS];
		//int[] mesas = { 1, 0, 0, 2 };
		int nPersonas;
		Scanner sc = new Scanner(System.in);

		System.out.println("BIENVENIDO A SU RESTAURANTE");
		imprimirEstadoMesas(mesas);
		do {
			do {
				System.out.println("¿Cuántas personas son (introduzca -1 para salir)? ");
				nPersonas = Integer.parseInt(sc.nextLine());
				if (nPersonas > MAXCAPACIDAD) {
					System.out.println("Lo siento, no admitimos grupos de " + nPersonas
							+ ", haga grupos de 4 personas como máximo e intente de nuevo");
				} else if (nPersonas == -1) {
					System.out.println("Saliendo del programa.");
				}
			} while (nPersonas > MAXCAPACIDAD);

			if (nPersonas != -1) { // Si no ha elegido salir

				boolean seHanSentado = false;

				// 1. Sentar en vacía (si se puede)
				for (int i = 0; i < mesas.length && !seHanSentado; i++) {
					if (mesas[i] == 0) {
						System.out.println("Siéntese en la mesa " + i);
						mesas[i] = nPersonas;
						seHanSentado = true;
					}
				}
				//2. Si no hemos conseguido sentarlos en una mesa vacía, probamos en una con gente.
				if(!seHanSentado) {
					for (int i = 0; i < mesas.length && !seHanSentado; i++) {
						//Si hay sitio en la mesa Y la suma de los que hay sentados 
						//más los que nos queremos sentar es menor o igual a la capacidad máxima
						//de la mesa.
						if(mesas[i] < MAXCAPACIDAD && mesas[i]+nPersonas <= MAXCAPACIDAD) {
							System.out.println("Siéntese en la mesa " + i);
							mesas[i] = mesas[i]+nPersonas; //Los sentamos!!!
							seHanSentado = true;
						}
					}
				}

				if (!seHanSentado) {
					System.out.println("Lo siento, en estos momentos no queda sitio.");
				}

				// Al final, imprimo estado de las mesas
				imprimirEstadoMesas(mesas);
			}
		} while (nPersonas != -1);

		System.out.println("BYE!");
		sc.close();
	}

	public static void imprimirEstadoMesas(int[] arrayMesas) {
		for (int i = 0; i < arrayMesas.length; i++) {
			System.out.println("Mesa: " + i + " - Ocupación: " + arrayMesas[i] + " personas.");
		}
	}
}
