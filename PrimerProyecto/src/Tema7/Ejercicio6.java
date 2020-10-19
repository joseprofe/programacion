package Tema7;

import java.util.Scanner;

//Escribe un programa que lea 6 números por teclado y 
//que los almacene en un array. Rota los elementos de ese array, 
//es decir, el elemento de la posición 0 debe pasar a la posición 1,
//el de la 1 a la 2, etc. El número que se encuentra en la última 
//posición debe pasar a la posición 0. 
//Finalmente, muestra el contenido del array.
public class Ejercicio6 {
	public static void main(String[] args) {
		
//		final int TAM = 6;
//		int[] pollo = new int[TAM];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < pollo.length ; i++) {
//			System.out.print("Introduse el valor "+ i + ": ");
//			pollo[i] = Integer.parseInt(sc.nextLine());
//		}
		int[] pollo = {0,1,2,3,4,5};
		
		System.out.println("Antes: ");
		for (int i = 0; i < pollo.length; i++) {
			System.out.println(pollo[i]);
		}
		
		int ultimo = pollo[pollo.length-1];
		//Bucle que dará las vueltas para rotar los elementos
		for(int i = pollo.length - 1 ; i > 0 ; i--) {
			pollo[i] = pollo[i-1];
		}
		pollo[0] = ultimo;
		
		System.out.println("Después: ");
		for (int i = 0; i < pollo.length; i++) {
			System.out.println(pollo[i]);
		}
		
//		sc.close();	
	}
}
