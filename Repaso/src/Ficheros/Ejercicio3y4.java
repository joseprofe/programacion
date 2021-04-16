package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3y4 {
	
	public static void main(String[] args) {
		String[] frases = {"pollo", "holi que tal", "tengo hambresita", "el ethereum está disparado"};
		escribirEnFichero(frases, "pollo.txt");
		leerEnFichero("pollo.txt");
	}

	public static void escribirEnFichero(String[] cadenas, String filename) {
		try {
			FileWriter fw = new FileWriter(filename,true);
			
			for (int i = 0; i < cadenas.length; i++) {
				fw.write(cadenas[i]+"*");
			}
			
			fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leerEnFichero(String filename) {
		File f = new File(filename);
		Scanner sc;
		try {
			sc = new Scanner(f);
			sc.useDelimiter("\\*");
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
