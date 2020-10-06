package Tema3;

import java.util.Scanner;

//Escribe un programa que ordene tres números enteros 
//introducidos por teclado.
public class Ejercicio13 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce el segundo número: ");
		b = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce el tercer número: ");
		c = Integer.parseInt(sc.nextLine());
		
		//a es el mayor
		if(a > b && a > c) {
			if(b > c) { //b es el segundo mayor
				System.out.println(a + " " + b  + " " + c);
			} else { // c es el segundo mayor
				System.out.println(a + " " + c  + " " + b);
			}
		} else if (b > a && b > c) { //b es el mayor
			if(a > c) { //b, a, c
				System.out.println(b + " " + a  + " " + c);
			} else { //b, c, a
				System.out.println(b + " " + c  + " " + a);
			}
		} else if (c > a && c > b) { //c es el mayor
			if(b > a) { //c, b, a
				System.out.println(c + " " + b  + " " + a);
			} else { //c, a, b
				System.out.println(c + " " + a  + " " + b);
			}
		}
		
	}

}
