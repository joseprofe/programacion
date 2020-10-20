package Tema7;

//Realiza un programa que rellene un array de 6 filas por 10 columnas 
//con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). 
//A continuación, el programa deberá dar la posición tanto del máximo como 
//del mínimo.

public class Ejercicio7_5 {

	public static void main(String[] args) {

		final int FIL = 6;
		final int COL = 10;
		final int TAMMAX = 1000;
		int[][] matriz = new int[FIL][COL];
		
		//Rellena la matriz con números aleatorios entre 0 y 1000.
		for (int i = 0; i < matriz.length; i++) { //por cada fila
			for (int j = 0; j < matriz[i].length; j++) { //por cada columna
				int aleatorio;
				aleatorio = (int)(Math.random()*(TAMMAX + 1));
				matriz[i][j] = aleatorio;
			}
		}
		
		//Imprimir la matriz
		imprimirMatriz(matriz);
		
		int indiceImin=0,indiceImax=0,indiceJmax=0,indiceJmin=0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(min > matriz[i][j]) {
					min = matriz[i][j];
					indiceImin = i;
					indiceJmin = j;
				}
				if(max < matriz[i][j]) {
					max = matriz[i][j];
					indiceImax = i;
					indiceJmax = j;
				}
			}
		}
		
		System.out.println("El max es: " + max + " Coordenadas: " +  indiceImax + " " + indiceJmax);
		System.out.println("El min es: " + min + " Coordenadas: " + indiceImin + " " + indiceJmin);
		
	}

	public static void imprimirMatriz(int[][] miMatrizPollua) {
		for (int i = 0; i < miMatrizPollua.length; i++) {
			System.out.print("(");
			for (int j = 0; j < miMatrizPollua[i].length; j++) {
				System.out.print(" " + miMatrizPollua[i][j] + " ");
			}
			System.out.println(")"); // salto de línea
		}
	}

}
