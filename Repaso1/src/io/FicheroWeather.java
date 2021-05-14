package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import models.Weather;

public class FicheroWeather {

	public static Weather leerTiempo() throws FileNotFoundException {
		String file = "weather.txt";
		Scanner sc = new Scanner(new File(file));
		
		while(sc.hasNext()) {
			//2020-05-14:Soleado:27:15
			String linea = sc.nextLine();
			String[] trocitos = linea.split(":");
			Weather w = new Weather(trocitos[0], trocitos[1], 
					Integer.parseInt(trocitos[2]), Integer.parseInt(trocitos[3]));
			
			
			Date dHoy = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			try {
				date = sdf.parse(w.getFecha());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			if(sdf.format(dHoy).equals(sdf.format(date))) {
				return w;
			}
		}
		
		sc.close();
		return null;
	}
}
