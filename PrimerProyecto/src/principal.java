

public class principal {

	public static void main(String[] args) {

		int numeros[][] = new int[3][3];

		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 6;
		numeros[1][0] = 4;
		numeros[1][1] = 5;
		numeros[1][2] = 6;
		numeros[2][0] = 6;
		numeros[2][1] = 8;
		numeros[2][2] = 9;

		int[] array = LibreriaMatrices.columnaDeArray2D(numeros, 1);
		System.out.println("columna 1: " );
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("fila 2: " + LibreriaMatrices.getFila(numeros, 0));

	}
}
