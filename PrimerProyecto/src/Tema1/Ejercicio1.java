package Tema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int i;
		for ( i = 0; i < 100; i++) {
			System.out.println(i);
			if(i == 50) {
				break;
			}			
		}
		
		for (i = 0; (i < 100 && i != 50); i++) {
			System.out.println(i);		
		}

		
		for (i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		
		
		int numero = 121;
		for (i = 0; i <= 10;) {
			System.out.println(numero + "x"+i + " = " +i*numero);
		}
	}

}