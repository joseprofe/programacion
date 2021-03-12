package Arrays;

public class Matrices {

	public static void main(String[] args) {
		int[][] mapa = {
					{0,2,0,0},
					{0,1,0,2},
					{0,0,0,0},
					{0,0,0,0}
				};
		
		int[][] mapaOculto = {
				{8,8,8,8},
				{8,8,8,8},
				{8,8,8,8},
				{8,8,8,8}
			};
		
		mapaOculto[1][2] = mapa[1][2];
		
		imprimirMatriz(mapaOculto);
	}

	public static void imprimirMatriz(int[][] m) {
		// m.length es el número de filas.
		for (int fil = 0; fil < m.length; fil++) {
			for (int col = 0; col < m[fil].length; col++) { // m[fil].length es el núm de cols.
				System.out.print(m[fil][col] + "   ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
