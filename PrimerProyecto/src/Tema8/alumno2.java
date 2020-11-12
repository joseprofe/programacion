package Tema8;


import java.util.Scanner;

public class alumno2 {

	public static Scanner scanner = new Scanner(System.in);
	public static String[][] turno1 = null, turno2 = null;
	public final static int COL = 5;
	public final static int ROW = 6;

	public static void main(String[] args) {
		boolean par, activo = true;
		String[] nomAlumno = { "ALUMNO1", "ALUMNO2", "ALUMNO3", "ALUMNO4", "ALUMNO5", "ALUMNO6", "ALUMNO7", "ALUMNO8",
				"ALUMNO9", "ALUMNO10", "ALUMNO11", "ALUMNO12", "ALUMNO13", "ALUMNO14", "ALUMNO15", "ALUMNO16",
				"ALUMNO17", "ALUMNO18", "ALUMNO19", "ALUMNO20", "ALUMNO21", "ALUMNO22", "ALUMNO23", "ALUMNO24",
				"ALUMNO25", "ALUMNO26", "ALUMNO27", "ALUMNO28", "ALUMNO29", "ALUMNO30" };// Array con el nombre de alumnos
		par = true;
		turno1 = Asientos(par, nomAlumno, turno1);// Creamos los dos turnos
		par = false;
		turno2 = Asientos(par, nomAlumno, turno2);
		while (activo) {
			System.out.println(
					"\nElija el turno que quiere ver\n 1. Turno 1\n 2. Turno 2\n 3. Intercambiar turno\n 4. Salir del programa");
			String numero = scanner.nextLine();
			while (!Validador(numero, 4)) {
				System.out.println("Error, no ha puesto un numero valido");
				System.out.println(
						"Elija el turno que quiere ver\n 1. Turno 1\n 2. Turno 2\n 3. Intercambiar turno \n4. Salir del programa");
				numero = scanner.nextLine();
			}
			switch (numero) {// Seleccion de opciones
			case "1":
				Imprimir(turno1);// Imprime el turno 1
				break;
			case "2":
				Imprimir(turno2);// Imprime el turno 2
				break;
			case "3":
				CambiarTurno(nomAlumno);// Cambia el turno
				break;
			case "4":
				System.out.println("Adios :D");
				activo = false;
				break;
			}
		}
		scanner.close();
	}

//Metodo para cambiar de turno
	private static void CambiarTurno(String[] alumno) {// Funcion para cambiar de turno
		System.out.println("�Que turno quiere cambiar?\n 1. Turno 1\n 2. Turno 2");
		String turnoString = scanner.nextLine();
		while (!Validador(turnoString, 2)) {
			System.out.println("Error, no ha puesto un numero valido");
			System.out.println("�Que turno quiere cambiar?\n 1. Turno 1\n 2. Turno 2");
			turnoString = scanner.nextLine();
		}
		System.out.println("�Que alumno quieres intercambiar?");
		if (turnoString.equals("1")) {// Imprime los 15 de cada turno
			ImprimirCambioTurno(turno1);
		} else {
			ImprimirCambioTurno(turno2);
		}
		String numAlumno = scanner.nextLine();
		String[] arrayFinal = new String[4];

		switch (turnoString) {//Valida e imprime los posibles intercambios
		case "1":
			while (!ValidadorTurno(numAlumno, turno1)) {// Comprueba que el numero de turno es valido
				System.out.println("Error, no ha puesto un numero valido");
				numAlumno = scanner.nextLine();
			}
			System.out.println("�Por cual lo quieres intercambiar?");
			arrayFinal = Sentarse(turno1, turno2, numAlumno);//Array donde almacena los posibles intercambios
			break;
		case "2":
			while (!ValidadorTurno(numAlumno, turno2)) {// Comprueba que el numero de turno es valido
				System.out.println("Error, no ha puesto un numero valido");
				numAlumno = scanner.nextLine();
			}
			System.out.println("�Por cual lo quieres intercambiar?");
			arrayFinal = Sentarse(turno2, turno1, numAlumno);//Array donde almacena los posibles intercambios
			break;
		}
		String intercambio = scanner.nextLine().toUpperCase();
		while (!ValidadorAlumno(arrayFinal, intercambio)) {//Valida lo que ha escrito el usuario con el posible intercambio
			System.out.println("Error no ha puesto un nombre de alumno valido");
			intercambio = scanner.nextLine().toUpperCase();
		}
		String nombreAlumnoString = "ALUMNO" + Integer.toString(Integer.parseInt(numAlumno));// Nombre del alumno que se quiere cambiar
		if (turnoString.equals("1")) {
			IntercambiarAsientos(turno1, turno2, intercambio, nombreAlumnoString);
		} else {
			IntercambiarAsientos(turno2, turno1, intercambio, nombreAlumnoString);
		}
	}

//Metodo para intercambiar los asientos
	private static void IntercambiarAsientos(String[][] turno, String[][] turnoIntercambio, String intercambio, String nombreAlumnoString) {
		int[] posicion = Posicion(turno, nombreAlumnoString);//Recoge la posicion del alumno que se quiere intercambiar
		int[] posicionIntercambio = Posicion(turnoIntercambio, intercambio);//Recoge la posicion del intercambio
		turno[posicion[0]][posicion[1]] = intercambio;//Intercambia el alumno
		turnoIntercambio[posicionIntercambio[0]][posicionIntercambio[1]] = nombreAlumnoString;
	}

//Metodo para validar el numero de alumno con el alumno en el turno
	private static boolean ValidadorTurno(String alumno, String[][] turno) {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (!turno[i][j].equalsIgnoreCase("HUECO")) {
					if (turno[i][j].substring(6).equals(alumno)) {
						return true;
					}
				}
			}
		}
		return false;
	}

//Metodo para imprimir los alumnos disponibles para cambiarse
	private static void ImprimirCambioTurno(String[][] turno) {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (!turno[i][j].equalsIgnoreCase("Hueco")) {
					System.out.println(turno[i][j].substring(6) + ". " + turno[i][j]);
				}
			}
		}
	}

//Metodo para validar que el nombre del alumno es correcto
	private static boolean ValidadorAlumno(String[] alumnos, String intercambio) {
		for (int i = 0; i < alumnos.length; i++) {
			try {
				if (alumnos[i].equalsIgnoreCase(intercambio)) {
					return true;
				}
			} catch (Exception e) {
			}
		}
		return false;
	}

//Metodo para saber la posicion
	private static int[] Posicion(String[][] turno, String numAlumno) {
		int[] posicion = new int[2];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (turno[i][j].equalsIgnoreCase(numAlumno)) {
					posicion[0] = i;
					posicion[1] = j;
					break;
				}
			}
		}
		return posicion;
	}

//Metodo donde se mira por que alumnos cambiar su turno
	private static String[] Sentarse(String[][] turno, String[][] turnoInverso, String numAlumno) {
		String nombreAlumnoString = "ALUMNO" + Integer.toString(Integer.parseInt(numAlumno));
		int[] posicion = Posicion(turno, nombreAlumnoString);

		String[] arrayFinal = new String[4];
		try {//Si encuentra un alumno se guarda en el array e imprime el alumno que se puede intercambiar
			if (turnoInverso[posicion[0] - 1][posicion[1]].startsWith("ALUMNO")) {
				arrayFinal[0] = turnoInverso[posicion[0] - 1][posicion[1]];
				System.out.println(arrayFinal[0]);
			}
		} catch (Exception e) {
		}
		try {
			if (turnoInverso[posicion[0]][posicion[1] - 1].startsWith("ALUMNO")) {
				arrayFinal[1] = turnoInverso[posicion[0]][posicion[1] - 1];
				System.out.println(arrayFinal[1]);
			}
		} catch (Exception e) {
		}
		try {
			if (turnoInverso[posicion[0]][posicion[1] + 1].startsWith("ALUMNO")) {
				arrayFinal[2] = turnoInverso[posicion[0]][posicion[1] + 1];
				System.out.println(arrayFinal[2]);
			}
		} catch (Exception e) {
		}
		try {
			if (turnoInverso[posicion[0] + 1][posicion[1]].startsWith("ALUMNO")) {
				arrayFinal[3] = turnoInverso[posicion[0] + 1][posicion[1]];
				System.out.println(arrayFinal[3]);
			}
		} catch (Exception e) {
		}
		return arrayFinal;
	}

//Metodo donde se crean los turnos
	private static String[][] Asientos(boolean par, String[] alumno, String[][] turno) {
		int numAlumno = 0;
		if (!par)
			numAlumno = 15;
		turno = new String[ROW][COL];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (par) {
					turno[i][j] = alumno[numAlumno];
					numAlumno++;
					par = par ? false : true;
				} else {
					turno[i][j] = "HUECO";
					par = par ? false : true;
				}
			}
		}
		return turno;

	}

//Metodo para imprimir los turnos
	private static void Imprimir(String[][] asiento) {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(asiento[i][j] + " ");
			}
			if (i != -1) {
				System.out.println("");
			}
		}
	}

//Metodo donde valida una cadena de texto
	private static boolean Validador(String numero, int opciones) {
		try {
			Integer.parseInt(numero);
			if (Integer.parseInt(numero) < opciones + 1 && Integer.parseInt(numero) > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
