package Caja.mainapp;

import java.util.Scanner;

import Caja.models.Caja;

public class MainApp {

	static Scanner sc = new Scanner(System.in);
	static Caja caja = new Caja();

	public static void main(String[] args) {
		String u, p;
		final int maxIntentos = 3;
		int intentos = 0;
		do {
			System.out.print("Usuario: ");
			u = sc.nextLine();
			System.out.print("Password: ");
			p = sc.nextLine();
			intentos++;
		} while (!caja.login(u, p) && maxIntentos > intentos);

		if (caja.login(u, p)) {
			System.out.println("WELCOME TU LAIF IS LAIF\n");
			while (menu() != 3)
				;
		} else {
			System.out.println("Cruck, te has colado");
		}

		sc.close();
	}

	public static int menu() {
		int opc;
		do {
			System.out.println("1. Pasar producto por caja\n" + "2. Finalizar compra\n" + "3. Salir");

			opc = Integer.parseInt(sc.next());

			if (opc < 1 || opc > 3) {
				System.out.println("Bro, elige una opsió correcta.");
			}
		} while (opc < 1 || opc > 3);

		switch (opc) {
		case 1:
			caja.pasarProducto();
			break;
		case 2:
			if (caja.hayAlgunProducto())
				caja.pagar();
			else
				System.out.println("Brodel parguelilla, mete argo en la cesta antes xfi.");
			break;
		case 3:
			System.out.println("Bye serdo");
			break;
		}

		return opc;

	}

}
