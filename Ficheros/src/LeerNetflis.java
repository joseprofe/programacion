import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNetflis {

	public static void main(String[] args) {

		final String ruta = "assets/netflix_titles.csv";
		File f = new File(ruta);
		Scanner sc = null;
		try {
			sc = new Scanner(f);
			if (sc.hasNextLine())
				sc.nextLine();
			while (sc.hasNextLine()) {
				var cadena = sc.nextLine();
				var cadenitas = cadena.split(",");
				for (String s : cadenitas) {
					System.out.println(s.trim());
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
