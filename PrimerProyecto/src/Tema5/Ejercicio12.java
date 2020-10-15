package Tema5;

public class Ejercicio12 {

	// Fibonacci
	public static void main(String[] args) {
		int n = 20;
		// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		int a = 1, b = 2, res = a + b, aux;
		System.out.println(a); //1
		System.out.println(b); //2
		System.out.println(res); //3
		
		for(int i = 0; i < n; i++) {
			aux = res;
			a = b; 
			b = aux; 
			res = a + b; 
			System.out.println(res);
		}
		
	}

}
