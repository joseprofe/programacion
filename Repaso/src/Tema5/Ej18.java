package Tema5;

import java.util.Scanner;

public class Ej18 {
//	Escribe un programa que obtenga los números enteros comprendidos entre dos números 
//	introducidos por teclado y validados como distintos, el programa debe empezar por 
//	el menor de los enteros introducidos e ir incrementando de 7 en 7
	
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		a = Integer.parseInt(sc.nextLine());
		
		do {
			System.out.print("Introduce el segundo número: ");
			b = Integer.parseInt(sc.nextLine());
		} while(a == b);
		
		if(a < b) {
			for(int i = a; i <= b ; i+=7) {
				System.out.println(i);
			}
		} else { //b < a
			for(int i = b; i <= a; i+=7) {
				System.out.println(i);
			}
		}
	
	
		sc.close();
	}

}
