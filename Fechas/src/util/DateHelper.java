package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
	private static SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

	/**
	 * Intenta parsear la fecha y devolver el objeto Date y si no es capaz porque el 
	 * formato sea incorrecto, devuelve la fecha 01/01/1970.
	 * @param fecha
	 * @return
	 */
	public static Date fecha(String fecha) {
		try {
			return df.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return new Date();
	}

	/**
	 * Dado un objeto fecha devuelve el String con el formato "dd-MM-yyyy"
	 * @param fecha
	 * @return
	 */
	public static String printFecha(Date fecha) {
		return df.format(fecha);
	}
}
