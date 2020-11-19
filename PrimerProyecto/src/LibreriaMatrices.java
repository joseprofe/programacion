
public class LibreriaMatrices {

	public static int[] getFila(int[][] m, int indice) {

		int[] fila = new int[m[0].length];

		for (int i = 0; i < m[0].length; i++) {
			fila[i] = m[indice][i];
		}

		return fila;
	}

	public static int[] columnaDeArray2D(int array2d[][], int columna) {

		int[] col = new int[array2d.length];

		for (int i = 0; i < array2d.length; i++) {
			col[i] = array2d[i][columna];
		}

		return col;
	}
}
