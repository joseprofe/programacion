package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import models.Usuario;

public class FicheroUsuarios {

	public static boolean login(Usuario u) {
		String file = "usuarios.txt";
	    try {
			Scanner scanner = new Scanner(new File(file));
			
			while(scanner.hasNextLine()) {
				String linea = scanner.nextLine();
				String[] lineas = linea.split(":");
				Usuario usuarioFichero = new Usuario(lineas[0], lineas[1]);
				if(usuarioFichero.getUsername().equals(u.getUsername())
						&& usuarioFichero.getPassword().equals(u.getPassword()))
					return true;
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    return false;
	}
	
	public static void insert(Usuario u) {
		try {
			FileWriter fw = new FileWriter("usuarios.txt", true);
			fw.write("\n"+u.getUsername()+":"+u.getPassword());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
