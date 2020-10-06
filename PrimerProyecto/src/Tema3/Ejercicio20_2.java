package Tema3;

import java.util.Scanner;

public class Ejercicio20_2 {

	//Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. 
	//Se permiten números de hasta 5 cifras.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n; 
		
		System.out.print("Dime el numero hasta 5 cifras: "); 
		n = sc.nextLine();
		
		if (n.length() <= 5 && n.length() > 0) { //El número tiene la longitud adecuada
		    if(n.length() == 1) {
				System.out.println("Es capicúa");
			} else if (n.length() == 2 && n.charAt(0) == n.charAt(1)) {
				System.out.println("Es capicúa");
			} else if (n.length() == 3 && n.charAt(0) == n.charAt(2)) {
				System.out.println("Es capicúa");
			} else if (n.length() == 4 && n.charAt(0) == n.charAt(3) 
					&& n.charAt(1) == n.charAt(2)) {
				System.out.println("Es capicúa");
			} else if (n.length() == 5 && n.charAt(0) == n.charAt(4) 
					&& n.charAt(1) == n.charAt(3)) {
				System.out.println("Es capicúa");
			} else {
				System.out.println("El número NO es capicúa");
			}
		} else { //ERROR
			System.out.println("El número no tiene la longitud adecuada.");
		}	
		
	}
}
