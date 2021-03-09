package Arrays;

public class Ej11 {

	public static void main(String[] args) {
		int[] array = { 8, 7, 6, 3, 5, 20, 21, 13, 9 };
		int[] arrayFinal = new int[9];
		int indice = 0;
		
		imprimirArray(array);
		
		for (int i = 0; i < array.length; i++) {
			var num = array[i];
			
			if(esPrimo(num)) {
				arrayFinal[indice] = num;
				indice++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			var num = array[i];
			
			if(!esPrimo(num)) {
				arrayFinal[indice] = num;
				indice++;
			}
		}
		
		imprimirArray(arrayFinal);
	}
	
	public static void imprimirArray(int[] a) {
		System.out.print("{ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("}");
	}

	/**
	 * Comprueba si un número entero positivo es primo o no. Un número es primo
	 * cuando únicamente es divisible entre * él mismo y la unidad.
	 *
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
	 */
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
