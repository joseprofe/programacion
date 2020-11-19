package Tema8;

public class MatrixHelper {

	public static void main(String[] args) {
		int[][] m1 = { { 0, 1, 2 }, { 4, 5, 6 } };
		int[][] m2 = { { 1, 2 }, { 4, 6 } };
		
		imprimir(m1);
		imprimir(rotarIzquierda(m1));
		imprimir(rotarDerecha(m1));
		
	}

	public static int[][] multiplica(int[][] m1, int[][] m2) {
		int[][] res = new int[m1.length][m2[0].length];
		if (m1[0].length == m2.length) {
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[i].length; j++) {
					res[i][j] = multiplica(m1[i], getColumna(m2, j));
				}
			}
		} else {
			System.out.println("Estas matrices no se pueden multiplicar");
			return null;
		}

		return res;
	}

	public static int multiplica(int[] a1, int[] a2) {
		int res = 0;
		for (int i = 0; i < a2.length; i++) {
			res += (a1[i] * a2[i]);
		}
		return res;
	}

	public static int[] getFila(int[][] m, int indice) {
		return m[indice];
	}

	public static int[] getColumna(int[][] m, int indice) {
		int[] col = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			col[i] = m[i][indice];
		}
		return col;
	}

	public static void imprimir(int[] a) {
		if (a != null) {
			System.out.print("[ ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i] + " ");
			}
			System.out.print(" ]");
		} else {
			System.out.println("[null]");
		}
	}

	public static void imprimir(int[][] m) {
		if (m != null) {
			for (int i = 0; i < m.length; i++) {
				System.out.print("[ ");
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(" " + m[i][j] + " ");
				}
				System.out.print(" ]\n");
			}
		} else {
			System.out.println("[null]");
		}
		System.out.println();
	}
	
	public static int[][] rotarDerecha(int[][] m) {
		int[][] res = new int[m[0].length][m.length];
		int indiceReemplazo = m.length - 1;
		for (int i = 0; i < m.length ; i++) { //por cada fila
			var fila = getFila(m, i);
			reemplazarColumnaConArray(res,fila,indiceReemplazo);
			indiceReemplazo--;
		}
		return res;
	}
	
	public static int[][] rotarIzquierda(int[][] m) {
		int[][] res = new int[m[0].length][m.length];
		for (int i = 0; i < m.length ; i++) { //por cada fila
			var fila = invertir(getFila(m, i));
			reemplazarColumnaConArray(res,fila,i);
		}
		return res;
	}
	
	public static int[] invertir(int[] a) {
		int[] res = new int[a.length]; 
        int j = a.length; 
        for (int i = 0; i < a.length; i++) { 
            res[j - 1] = a[i]; 
            j = j - 1; 
        } 
        
        return res;
	}
	
	public static void reemplazarFilaConArray(int m[][], int[] a, int indice){
		for (int i = 0; i < m[0].length; i++) {
			m[indice][i] = a[i];			
		}
	}
	
	public static void reemplazarColumnaConArray(int m[][], int[] a, int indice){
		for (int i = 0; i < m.length; i++) {
			m[i][indice] = a[i];			
		}
	}

}
