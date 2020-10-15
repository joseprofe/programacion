package Tema5;

import java.text.DecimalFormat;

import java.util.Scanner;

public class PracticaResumen1CarlosF {

	public static void main(String[] args) {
		/*
		 * Crear un programa en Java que permita introducir un número de 5 dígitos y
		 * compruebe (simulando la lotería de la ONCE) si ese número es el número
		 * premiado o no. El número premiado se calculará como un número aleatorio entre
		 * 00000 y 99999 en el propio programa. Adicionalmente, deberá decir cuánto
		 * dinero te ha tocado en función de las coincidencias que haya entre tu número
		 * y el número premiado.
		 * 
		 * Si se acierta únicamente la primera o la última cifra se ganan 1.5€ Si se
		 * aciertan las 2 últimas cifras se ganan 6€ Si se aciertan las 3 últimas cifras
		 * se ganan 20€ Si se aciertan las 4 últimas cifras se ganan 200€ Si se aciertan
		 * las 5 últimas cifras se ganan 35000€
		 * 
		 * EXTRA DIFICULTAD PARA LOS QUE LO TERMINEN Y QUIERAN MÁS: - Contemplar que
		 * solo introduzca 5 cifras (control de errores) - Permitir jugar varias veces
		 * en una misma ejecución. - Si te toca el reintegro (1.5), te dará opción a
		 * comprar un nuevo boleto para otro sorteo.
		 * 
		 * --------- Ejemplo de salida del programa: BIENVENIDO! Introduce tu número de
		 * lotería: 12345 %%%%%%%%%% (pensando) -- Calcula un número aleatorio para
		 * definir el número ganador. Has ganado un mojón.
		 */
		System.out.println("Bienvenido/a");

		Jugar();
	}

//////////////////////////////////////////////FUNCIONES//////////////////////////////////////////////////////////////////		

	public static void Jugar() { // JUGAR
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Introduzca el número de su cupón (5 cifras): ");
			final int minvalue = 00000;

			final int maxvalue = 99999;
			int nintro = Integer.parseInt(sc.nextLine());

			int nAl = 0;
			DecimalFormat formLot = new DecimalFormat("00000");
			DecimalFormat formNum = new DecimalFormat("00000");

			rangonum(minvalue, maxvalue, nintro);

			System.out.println("¿Es correcto? Si / No");

			String correcto = (sc.nextLine().toUpperCase());

			switch (correcto) {
			case "SI":
				System.out.println("¡Estupendo!");
				Loteria(nintro, maxvalue);
				break;
			case "NO":
				System.out.println("Introduzca nuevamente el número de su cupón: ");
				Correcto1();
				break;

			default:
				System.out.println("¡No ha respondido correctamente! Introduzca de nuevo el número de su cupón: ");

				Correcto1();
			}
		} catch (Exception e) {
			System.out.println("¿Estás intentando truncarme? Volvemos a empezar.");
			Jugar();
		}
	}

	public static void rangonum(int minvalue, int maxvalue, int nintro) { // EL RANGO DE NÚMEROS
		Scanner sc = new Scanner(System.in);
		DecimalFormat formNum = new DecimalFormat("00000");

		if (nintro < minvalue || nintro > maxvalue) {

			System.out.println(
					"El número introducido no está dentro del rango aceptable\n Por favor, introduzca de nuevo el numero de su cupón: ");
			nintro = Integer.parseInt(sc.nextLine());

			rangonum(minvalue, maxvalue, nintro);
		} else {
			System.out.println("El número introducido es: " + formNum.format(nintro));
		}
	}

	public static void Correcto1() { // EL NUMERO ES CORRECTO?
		Scanner sc = new Scanner(System.in);
		final int maxvalue = 99999;
		final int minvalue = 00000;
		int nintro = Integer.parseInt(sc.nextLine());
		rangonum(minvalue, maxvalue, nintro);

		System.out.println("¿Es correcto? Si / No");

		String correcto = (sc.nextLine().toUpperCase());

		switch (correcto) {
		case "SI":
			System.out.println("¡Estupendo!");
			Loteria(nintro, maxvalue);
			break;
		case "NO":
			System.out.println("Introduzca nuevamente el número de su cupón: ");
			Correcto1();
			break;

		default:
			System.out.println("¡No ha respondido correctamente! Introduzca de nuevo el número de su cupón: ");
			Correcto1();
		}
	}

	public static void Loteria(int nintro, int maxvalue) { // SORTEO Y PREMIOS
		System.out.println("Espere por favor, en breves momentos comenzará el sorteo.");
		System.out.println("...");
		DecimalFormat formLot = new DecimalFormat("00000");
		int nAl = 0;
//		int nAt = 111; //Numero ganador no aleatorio

		nAl = (int) (Math.random() * maxvalue) + 1;

		System.out.println("Número ganador = " + formLot.format(nAl));

		if (nintro == nAl) { // PREMIO GORDO

			System.out.println("¡Enhorabuena! ¡Has ganado 35000€! ¡Invítame a unas gambas!");
		}

		else if (nintro % 10 == nAl % 10 && nintro % 100 / 10 == nAl % 100 / 10
				&& nintro % 1000 / 100 == nAl % 1000 / 100 && nintro % 10000 / 1000 == nAl % 10000 / 1000) {
			System.out.println("¡Enhorabuena! ¡Has ganado 200€! ¡Invítame a un cubatita!"); // 4 ÚLTIMAS CIFRAS
		} else if (nintro % 10 == nAl % 10 && nintro % 100 / 10 == nAl % 100 / 10
				&& nintro % 1000 / 100 == nAl % 1000 / 100) {
			System.out.println("¡Enhorabuena! ¡Has ganado 20€! ¡Dame un cigarrito io!"); // 3 ÚLTIMAS CIFRAS
		} else if (nintro % 10 == nAl % 10 && nintro % 100 / 10 == nAl % 100 / 10) {
			System.out.println("¡Enhorabuena! ¡Has ganado 6€! ¡Un par de chicles loco!"); // 2 ÚLTIMAS CIFRAS
		} else if (nintro % 10 == nAl % 10 || nintro % 100000 / 10000 == nAl % 100000 / 10000) { // SI PRIMERA CIFRA O
																									// ÚLTIMA.
			System.out.println("¡Enhorabuena! !Has ganado un puerco euro y medio!");
			VerificarJuego();
		} else {
			System.out.println("Lo siento bebé, te has comido un mojón enorme y blandito. No pierdas la fé .");

			VerificarJuego();
		}
	}

	public static void VerificarJuego() { // QUIERES JUGAR DE NUEVO?
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Te apetece jugar de nuevo? Si / No");
		String respuesta = (sc.nextLine().toUpperCase());
		switch (respuesta) {
		case "SI":
			Jugar();
			break;
		default:
			System.out.println("Un placer, por favor, no dejes la ludopatía :D");
		}

	}

}