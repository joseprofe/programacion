package util;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import enums.RazaPerro;

public class ConsolaHelper {

	private static Scanner sc = new Scanner(System.in);
	private static int opcionMinMenu = 1;
	private static int opcionMaxMenu = 3;
	private static int opcionMinSubMenu = 1;
	private static int opcionMaxSubMenu = 4;

	public static void imprimirSubMenu() {
		System.out.println("OPCIONES:");
		System.out.println("1. Cobrar sueldo\n" + "2. Sacar pasta\n" + "3. Subir sueldo\n"
				+ "4. Mostrar detalles de la persona\n");
		System.out.println("Elige una opción: ");
	}

	public static void imprimirMenu() {
		System.out.println("OPCIONES:");
		System.out.println("1. Añadir persona\n" + "2. Elegir persona\n" + "3. Borrar persona\n");
		System.out.println("Elige una opción: ");
	}

	public static int elegirOpcionMenu() {
		boolean isNumber = false;
		int opc = 0;
		while (!isNumber) {
			try {
				opc = Integer.parseInt(sc.nextLine());
				while (opc < opcionMinMenu || opc > opcionMaxMenu) {
					System.out.println(
							"ERROR: Por favor, elige una opción entre " + opcionMinMenu + " y " + opcionMaxMenu);
					imprimirMenu();
					opc = Integer.parseInt(sc.nextLine());
				}
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce números del " + opcionMinMenu + " al " + opcionMaxMenu);
				imprimirMenu();
			}
		}
		return opc;
	}

	public static int elegirOpcionSubMenu() {
		boolean isNumber = false;
		int opc = 0;
		while (!isNumber) {
			try {
				opc = Integer.parseInt(sc.nextLine());
				while (opc < opcionMinSubMenu || opc > opcionMaxSubMenu) {
					System.out.println(
							"ERROR: Por favor, elige una opción entre " + opcionMinSubMenu + " y " + opcionMaxSubMenu);
					imprimirSubMenu();
					opc = Integer.parseInt(sc.nextLine());
				}
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce números del " + opcionMinSubMenu + " al " + opcionMaxSubMenu);
				imprimirSubMenu();
			}
		}
		return opc;
	}

	public static int elegirOpcion(int min, int max) {
		boolean isNumber = false;
		int opc = 0;
		while (!isNumber) {
			try {
				opc = Integer.parseInt(sc.nextLine());
				while (opc < min || opc > max) {
					System.out.println("ERROR: Por favor, elige una opción entre " + min + " y " + max);
					opc = Integer.parseInt(sc.nextLine());
				}
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce números del " + min + " al " + max);
			}
		}
		return opc;
	}

	public static String leerString(String what) {
		System.out.print("Introduce " + what + ": ");
		return sc.nextLine();
	}

	public static double leerDouble(String what) {
		double num = 0;
		System.out.print("Introduce " + what + ": ");
		boolean isNumber = false;

		while (!isNumber) {
			try {
				num = Double.parseDouble(sc.nextLine());
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce un número real.");
				System.out.print("Introduce " + what + ": ");
			}
		}
		return num;
	}

	public static boolean leerSiNo() {
		boolean isNumber = false;
		int opc = 0;
		while (!isNumber) {
			try {
				opc = Integer.parseInt(sc.nextLine());
				while (opc < 0 || opc > 1) {
					System.out.println("ERROR: Por favor, elige una opción entre " + 0 + " (no) y " + 1 + "(sí)");
					opc = Integer.parseInt(sc.nextLine());
				}
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce números del " + 0 + " (no) y " + 1 + "(sí)");
			}
		}
		return opc == 1;
	}

	public static LocalDate leerFecha(String tipoFecha) {
		String fecha;
		boolean formatoCorrecto = false;
		LocalDate date = null;
		do {
			System.out.print("Dime la fecha de "+tipoFecha+" (YYYY-MM-DD): ");
			fecha = sc.nextLine();

			try {
				date = LocalDate.parse(fecha);
				formatoCorrecto = true;
			} catch (DateTimeParseException e) {
				System.out.println("ERROR: hay un problema con el formato de la fecha, introduce "
						+ "la fecha así (YYYY-MM-DD). Ejemplo: 1990-10-22 :)");
				System.out.println("Más detalles técnicos: " + e.getMessage());
			}
		} while (!formatoCorrecto);

		return date;
	}
	
	public static RazaPerro elegirRazaPerro() {
		System.out.println("Seleccione una raza: ");
		for (RazaPerro r : RazaPerro.values()) {
			System.out.println(r.ordinal() + 1 + ". " + r);
		}
		int opc = ConsolaHelper.elegirOpcion(1, RazaPerro.values().length);

		RazaPerro raza = RazaPerro.values()[opc - 1];

		return raza;
	}
	
}
