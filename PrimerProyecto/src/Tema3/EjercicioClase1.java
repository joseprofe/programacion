package Tema3;

import java.util.Scanner;

public class EjercicioClase1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N_ALUMNOS = 5;
		String n1, n2, n3, n4, n5;
		double nota1, nota2, nota3, nota4, nota5;
		double notaBaja = Double.MAX_VALUE;
		double notaAlta = Double.MIN_VALUE;

		System.out.print("Introduce el nombre del alumno: ");
		n1 = sc.nextLine();
		
		System.out.print("Introduce la nota de "+ n1 +": ");
		nota1 = Double.parseDouble(sc.nextLine());

		if(notaBaja > nota1) {
			notaBaja = nota1;
		}
		if(notaAlta < nota1) {
			notaAlta = nota1;
		}
		
		System.out.print("Introduce el nombre del alumno: ");
		n2 = sc.nextLine();
		
		System.out.print("Introduce la nota de "+ n2 +": ");
		nota2 = Double.parseDouble(sc.nextLine());
		
		if(notaBaja > nota2) {
			notaBaja = nota2;
		}
		if(notaAlta < nota2) {
			notaAlta = nota2;
		}
		
		System.out.print("Introduce el nombre del alumno: ");
		n3 = sc.nextLine();
		
		System.out.print("Introduce la nota de "+ n3 +": ");
		nota3 = Double.parseDouble(sc.nextLine());
		
		if(notaBaja > nota3) {
			notaBaja = nota3;
		}
		if(notaAlta < nota3) {
			notaAlta = nota3;
		}
		
		System.out.print("Introduce el nombre del alumno: ");
		n4 = sc.nextLine();
		
		System.out.print("Introduce la nota de "+ n4 +": ");
		nota4 = Double.parseDouble(sc.nextLine());
		
		if(notaBaja > nota4) {
			notaBaja = nota4;
		}
		if(notaAlta < nota4) {
			notaAlta = nota4;
		}
		
		System.out.print("Introduce el nombre del alumno: ");
		n5 = sc.nextLine();
		
		System.out.print("Introduce la nota de "+ n5 +": ");
		nota5 = Double.parseDouble(sc.nextLine());
		
		if(notaBaja > nota5) {
			notaBaja = nota5;
		}
		if(notaAlta < nota5) {
			notaAlta = nota5;
		}
		
		double media = (nota1+nota2+nota3+nota4+nota5)/N_ALUMNOS;
		System.out.println("La media de la clase es: " + media);
		System.out.println("La nota más baja es: " + notaBaja);
		System.out.println("La nota más alta es: " + notaAlta);
	}

}
