import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Binario {

	public static void main(String[] args) {
		try {

			InputStream is = new URL("https://pbs.twimg.com/profile_images/456197684177543168/s3Nm6qzc_400x400.jpeg")
					.openStream();
			FileOutputStream fos = new FileOutputStream("ies.jpeg");

			// Lectura del InputStream y escritura en fichero local
			int n = 0;
			byte[] buffer = new byte[50000]; // buffer temporal de lectura.

			int leido = is.read(buffer);

			while (leido > 0) {
				n++;
				fos.write(buffer, 0, leido);

				leido = is.read(buffer);

			}
			System.out.println(n);
			fos.flush();
			fos.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
