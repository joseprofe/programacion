package Tema3;

import java.util.Scanner;

public class Ejercicio20 {

	//Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. 
	//Se permiten números de hasta 5 cifras.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Dime el numero hasta 5 cifras: "); 
		n = Integer.parseInt(sc.nextLine());
		
//		System.out.println(n%10); //Unidades
//		System.out.println(n%100/10); //Decenas pollo frito
//		System.out.println(n%1000/100); //Centenas
//		System.out.println(n%10000/1000); //Mil
//		System.out.println(n%100000/10000); //Diezmil
		
		int unidades = n%10;
		int decenas = n%100/10;
		int centenas = n%1000/100;
		int mil = n%10000/1000;
		int diezmil = n%100000/10000;
		
		if(n < 10) {
			System.out.println("Es capicúa");
		} else if(n<100 && unidades == decenas) { //Comprobamos unidades y decenas
			System.out.println("Es capicúa");
		} else if(n < 1000 && unidades == centenas) { //Tenemos 3 símbolos, comprobamos unidades y centenas
			System.out.println("Es capicúa");
		} else if(n < 10000 && unidades == mil && decenas == centenas ) { //Tenemos 4 símbolos, comprobamos unidades y millares, y
			System.out.println("Es capicúa");
		} else if(n < 100000 && unidades == diezmil && decenas == mil ) { //Tenemos 5 símbolos, comprobamos unidades y diezmil, y
			System.out.println("Es capicúa");
		} else{
			System.out.println("NO es capicúa");
		}
		
	}
}
