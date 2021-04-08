import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNetflis {

	public static void main(String[] args) {

		final String ruta = "assets/netflix_titles.csv";
		File f = new File(ruta);
		boolean isString = false;
		Scanner sc = null;
		try {
			sc = new Scanner(f);
			if (sc.hasNextLine())
				sc.nextLine();
			while (sc.hasNextLine()) {
				var cadena = sc.nextLine();
				var cadenitas = cadena.split(",");
				String stringConComillas = "";
				for (String s : cadenitas) {
					//Para escapar cadenas completas de caracteres
					if(s.startsWith("\"")) {
						isString = true;
					}
					if(isString) {
						stringConComillas += s + ",";
					}
					if(s.endsWith("\"")) {
						isString = false;		
						s = stringConComillas;
						stringConComillas = "";
					}	
					
					//Imprimir el término entre las comas.
					if(!isString) {
						System.out.println(s.trim());
					}
				}
				System.out.println("---");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
