package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import models.Weather;

public class FileWeather {
	private String filename;
	private ArrayList<Weather> weathers;

	public FileWeather() {
		this.weathers = new ArrayList<Weather>();
	}

	public ArrayList<Weather> leer() {
		filename = "m.csv";
		try {
			Scanner sc = new Scanner(new File(filename));

			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				String[] trocitos = s.split(";");
				Weather w = new Weather(trocitos[0], Integer.parseInt(trocitos[1]), Integer.parseInt(trocitos[2]),
						Integer.parseInt(trocitos[3]));

				this.weathers.add(w);
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return this.weathers;

	}
	
	public void escribir(ArrayList<Weather> weathers) {
		filename = "c.csv";
		try {
			FileWriter fw = new FileWriter(filename);
			
			Date date = new Date();
			LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			int month = localDate.getMonthValue();
			
			for (int i = 0 ; i < month ; i++) {
				Weather w = weathers.get(i);
				fw.write(w.getMes()+";"+w.gettMax()+";"+w.gettMin()+";"+w.getnLluvias()+"\n");
			}
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
