package Tema8;

public class MisFuncionsitas {
	/**
	 * Te dice si un número entero es primo o no.
	 * 
	 * @param x es el número a verificar si es primo o no
	 * @return true si es primo, false si no es primo.
	 */
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Establece si un numero es par o no.
	 * @param numero a determinar su paridad
	 * @return true si numero es par, false si el numero es impar.
	 */
	public static boolean esPar(int numero) {
		
		if(numero%2 == 0) {
			return true;
		} else {
			return false;
		}
		
//		return (numero%2 == 0);
	}
	
	/**
	 * Este método imprime por pantalla los valores de un vector entero.
	 * @param v el vector a imprimir por pantalla.
	 */
	public static void imprimirVector(int[] v) {
		System.out.print("[ ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(" " + v[i] + " ");
		}
		System.out.print(" ]");
	}
	
	public static void incrementar(int[] numero) {
		numero[0]++;
	}
	
	/**
	 * Calcula iterativamente el factorial de un numero n
	 * 
	 * Ejemplo: Factorial(3) = 3*2*1
	 * @param n es el número a calcular el factorial
	 * @return el valor de factorial de n
	 */
	public static int factorial(int n) {
		int res = 1;
		if(n > 0) {
			for(int i = 1; i <= n; i++) {
				res = res * i;
			}
		}
		return res;
	}
	
	/**
	 * Calcula recursivamente el factorial de un numero n
	 * 
	 * Ejemplo: Factorial(3) = 3*2*1
	 * @param n es el número a calcular el factorial
	 * @return el valor de factorial de n
	 */
	public static int factorialRecursivo(int n) {
		if(n > 0) {
			return factorialRecursivo(n-1)*n;
		} else {
			return 1;
		} 
	}
	
}
