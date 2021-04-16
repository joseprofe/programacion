package Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
//	Escribe un programa que escriba los 100 primeros números
//	naturales en un archivo numNaturales.txt.
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("numNaturales.txt");

			for (int i = 0; i < 100; i++) {
				fw.write(String.valueOf(i)+"\n");
			}
			
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
