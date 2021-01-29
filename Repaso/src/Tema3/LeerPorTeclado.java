package Tema3;

import java.util.Scanner;

public class LeerPorTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		String nacimiento;
		double estatura;
		
		System.out.println("Buenos días, dime tu nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Dime tu edad: ");
		edad = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime dónde naciste:");
		nacimiento = sc.nextLine();
		
		System.out.println("Dime tu estatura: ");
		estatura = Double.parseDouble(sc.nextLine());
		
		
		System.out.println("Buenas "+nombre+" tienes " + edad + " anyos, naciste en "+
							nacimiento+" y mides "+ String.format("%.2f", estatura) + "m.");
		
		
		sc.close();
	}
}
