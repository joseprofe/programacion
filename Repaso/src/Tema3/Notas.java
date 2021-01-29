package Tema3;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		//Declaracion variables
		double nf, n1, n2;
		Scanner sc = new Scanner(System.in);
		
		//Mensajes al usuario
		System.out.println("Introduce la nota del primer examen: ");
		//Lectura por teclado
		n1 = Double.parseDouble(sc.nextLine()); //sc.nextDouble();
		
		System.out.println("¿Qué nota quieres sacar en el trimestre?");
		nf = Double.parseDouble(sc.nextLine());
		
		//Operaciones
		
		n2 = (nf - 0.4*n1)/0.6;
		
		//Mostrar resultado al usuario
		
		System.out.println("Para tener un "+ nf + " en el trimestre necesitas sacar un "+
		 n2 +" en el segundo examen.");
		
		sc.close();
	}
}
