package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio6 {
//	6.- Escribir un método que reciba por parámetro un nombre de archivo
//	para dejar sus líneas ordenadas alfabéticamente (no distinguir
//	minúsculas de mayúsculas a la hora de ordenar).

	public static void main(String[] args) {
		reescribirOrdenado("polloDesordenado.txt");
	}

	public static void reescribirOrdenado(String filename) {
		ArrayList<String> cadenas = new ArrayList<String>();
		File f = new File(filename);
		Scanner sc;
		try {
			sc = new Scanner(f);

			while (sc.hasNextLine()) {
				cadenas.add(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Collections.sort(cadenas);

		try {
			FileWriter fw = new FileWriter(filename);

			for (String cadena : cadenas) {
				fw.write(cadena + "\n");
			}
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
