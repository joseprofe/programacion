package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
//	2.- Escribe un programa que reciba el nombre de un archivo que
//	almacena una serie de cantidades enteras positivas e imprima su suma.
	public static void main(String[] args) {
		final String fileName = "nums.txt";
		File f = new File(fileName);

		Scanner sc;
		int suma = 0;
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				suma += Integer.parseInt(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(suma);

	}
}
