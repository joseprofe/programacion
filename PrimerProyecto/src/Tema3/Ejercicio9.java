package Tema3;

import java.util.Scanner;

//Realiza un programa que resuelva una ecuación de segundo grado 
//(del tipo ax2 +bx+c = 0).
public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Soluciones a la ecuación, x1 sería con la suma, x2 con la resta
		double x1, x2;
		//Los valores de la ecuación
		int a, b, c;
		
		System.out.print("Dime el valor de a: ");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.print("Dime el valor de b: ");
		b = Integer.parseInt(sc.nextLine());
		
		System.out.print("Dime el valor de c: ");
		c = Integer.parseInt(sc.nextLine());
		
		double discriminante = Math.pow(b, 2) - (4 * a * c);
		
		if(discriminante < 0 || a == 0) { //la raíz es negativa o a=0; ERROR
			System.out.println("Error, el discriminante es negativo o a = 0.");
		} else { //Hacemos cálculos
			x1 = (-b + Math.sqrt(discriminante)) / 2*a;
			x2 = (-b - Math.sqrt(discriminante)) / 2*a;
			System.out.println("Las soluciones a tu ecuación son:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		System.out.println("Fin del programa");
		
	}

}
