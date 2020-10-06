package Tema3;

import java.util.Scanner;

public class CalculadoraSimple {

	// Calculadora de 2 números que suma y resta
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int opcion = 0;
		
		while (opcion != 5) {

			boolean esNumero = false;
			while (!esNumero) {
				try {
					System.out.println("¿Qué deseas hacer?\n1. Suma\n2. Resta\n3. Multiplicación\n4. Dividir\n5. Salir");
					opcion = Integer.parseInt(sc.nextLine());
					esNumero = true;
				} catch (Exception e) {
					System.out.println("No has introducido un número.");
					esNumero = false;
				}
			}

			// if(opcion > 0 && opcion < 5) //esto es lo mismo que lo de debajo
			if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
				esNumero = false;
				while (!esNumero) {
					try {
						System.out.print("Dime a: ");
						a = Integer.parseInt(sc.nextLine());
						esNumero = true;
					} catch (Exception e) {
						System.out.println("No has introducido un número.");
						esNumero = false;
					}
				}

				esNumero = false;
				while (!esNumero || (opcion == 4 && b == 0)) {
					try {
						System.out.print("Dime b: ");
						b = Integer.parseInt(sc.nextLine());
						esNumero = true;
						if(opcion == 4 && b == 0) {
							System.out.println("El denominador no puede ser 0");
						}
					} catch (Exception e) {
						System.out.println("No has introducido un número o el denominador es 0.");
						esNumero = false;
					}
				}
			}

			switch (opcion) {
			case 1: // Suma
				System.out.println(a + b);
				break;
			case 2: // Resta
				System.out.println(a - b);
				break;
			case 3: // Multiplicación
				System.out.println(a * b);
				break;
			case 4: // División
				System.out.println(a / b);
				break;
			case 5: // Salir con despedida
				System.out.println("Adiós, guapo/a.");
				break;
			default: // Error
				System.out.println("Opción no válida");
				break;
			}
		}
	}

}
