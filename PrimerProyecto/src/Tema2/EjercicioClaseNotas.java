package Tema2;

import java.util.Scanner;

public class EjercicioClaseNotas {
	public static void main(String[] args) {
		double nota;
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime la nota mostro [0-10]: ");
		nota = Double.parseDouble(sc.nextLine());

		/* OPCIÓN QUE FUNCIONA DE LUJO
		if (nota >= 0 && nota <= 2.99) {
			System.out.println("Muy deficiente");
		} else if (nota >= 3 && nota <= 4.99) {
			System.out.println("Deficiente");
		} else if (nota >= 5 && nota <= 5.99) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota <= 7.49) {
			System.out.println("Bien");
		} else if (nota >= 7.5 && nota <= 8.99) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 9.99) {
			System.out.println("Sobresaliente");
		} else if (nota == 10) {
			System.out.println("Matrícula de honor");
		} else {
			System.out.println("Tu nota no es válida");
		}*/
		
		// OPCIÓN RECHULONA 
		if (nota >= 0 && nota <= 2.99) {
			System.out.println("Muy deficiente");
		} else if (nota <= 4.99) {
			System.out.println("Deficiente");
		} else if (nota <= 5.99) {
			System.out.println("Suficiente");
		} else if (nota <= 7.49) {
			System.out.println("Bien");
		} else if (nota <= 8.99) {
			System.out.println("Notable");
		} else if (nota <= 9.99) {
			System.out.println("Sobresaliente");
		} else if (nota == 10) {
			System.out.println("Matrícula de honor");
		} else {
			System.out.println("Tu nota no es válida");
		}
		
		//OPCIÓN - NO VÁLIDA
		/*
		if (nota >= 0 && nota <= 2.99) {
			System.out.println("Muy deficiente");
		} if (nota <= 4.99) {
			System.out.println("Deficiente");
		}  if (nota <= 5.99) {
			System.out.println("Suficiente");
		}  if (nota <= 7.49) {
			System.out.println("Bien");
		}  if (nota <= 8.99) {
			System.out.println("Notable");
		}  if (nota <= 9.99) {
			System.out.println("Sobresaliente");
		}  if (nota == 10) {
			System.out.println("Matrícula de honor");
		} else {
			System.out.println("Tu nota no es válida");
		}
		*/
	}
}
