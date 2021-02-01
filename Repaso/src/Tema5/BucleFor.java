package Tema5;

import java.util.Scanner;

public class BucleFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intentos = 4;
		final String COMBINACION = "0123";
		String combUsuario = "";
		boolean abierta = false;
		
		System.out.println("Holi, esto es una caja fuerte, me abro con una combinación "
				+ "de 4 dígitos. Te invito a probar. TIENES 4 INTENTOS");
	
		while(intentos > 0 && !abierta) {
			System.out.print("Tu combinación: ");
			combUsuario = sc.nextLine();
			intentos--;
			
			if(combUsuario.equals(COMBINACION)) {
				System.out.println("Caja abierta");
				abierta = true;
			} else {
				System.out.println("ERROR! Te quedan " + intentos + " intentos.");
			}
		}
			
		sc.close();
	}
}
