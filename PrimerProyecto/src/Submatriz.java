//#public static int[][] submatriz(int[][] m, int[] numerosFilasElegidas, int[] numerosColumnasElegidas); -> Dados.:
//
//m = (1 2 3 4)
//    (5 6 7 8)
//    (9 0 1 2)
//
//numerosFilasElegidas = [0,2]
//numerosColumnasElegidas = [1,3]
//
//Comprobará que lo solicitado es viable (índices dentro de rango), y si puede proceder, devolverá la submatriz compuesta por los elementos elegidos:
//
//resultado = (2 4)
//            (0 2)
public class Submatriz {

	public static void main(String[] args) {
		int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		int[] numerosFilasElegidas = {0,1,2};
		int[] numerosColumnasElegidas = {1,3};

		MatrixHelper.imprimir(submatriz(matriz, numerosFilasElegidas, numerosColumnasElegidas));
	}
	
	public static int[][] submatriz(int[][] m, int[] numerosFilasElegidas, int[] numerosColumnasElegidas){
		int[][] submatriz = new int[numerosFilasElegidas.length][numerosColumnasElegidas.length];
		
		for (int i = 0; i < submatriz.length; i++) {
			for (int j = 0; j < submatriz[i].length; j++) {
				submatriz[i][j] = m[numerosFilasElegidas[i]][numerosColumnasElegidas[j]];
			}
		}
		
		return submatriz;
	}

}
