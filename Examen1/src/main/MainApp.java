package main;

import java.util.ArrayList;

import io.FileWeather;
import models.Weather;

public class MainApp {

	public static void main(String[] args) {
		//Declaración de variables.
		FileWeather io = new FileWeather();
		ArrayList<Weather> weathers = io.leer();
		int tMax = Integer.MIN_VALUE;
		int tMin = Integer.MAX_VALUE;
		int nLluvias = 0;
		int totalMax = 0, totalMin = 0;
		String mesesMin = "", mesesMax = "";
		
		//Cálculo de medias y temperaturas.
		for (Weather w : weathers) {
			if(w.gettMin() < tMin)
				tMin = w.gettMin();
			if(w.gettMax() > tMax)
				tMax = w.gettMax();
			if(w.getnLluvias() > nLluvias)
				nLluvias = w.getnLluvias();
			
			totalMax += w.gettMax();
			totalMin += w.gettMin();			
		}
		
		//Cálculo de nombre de los meses.
		for (Weather w : weathers) {
			if(w.gettMin() == tMin) {
				mesesMin += w.getMes() + " ";
			}
			if(w.gettMax() == tMax) {
				mesesMax += w.getMes() + " ";
			}
		}
		
		//Salida del programa
		System.out.println("La media máxima = " + totalMax/12);
		System.out.println("La media mínima = " + totalMin/12);
		System.out.println("Meses de temp. mín = " + mesesMin);
		System.out.println("Meses de temp. máx = " + mesesMax);
		System.out.println("Media del año = " + (totalMax/12 + totalMin/12)/2);
		
		
		/////////////
		//Escritura del fichero.
		
		ArrayList<Weather> tiempos = new ArrayList<Weather>();
		tiempos.add(new Weather("Enero",10,-2,6));
		tiempos.add(new Weather("Febrero",11,-2,6));
		tiempos.add(new Weather("Marzo",12,-2,6));
		tiempos.add(new Weather("Abril",13,-2,6));
		tiempos.add(new Weather("Mayo",14,-2,6));
		tiempos.add(new Weather("Junio",15,-2,6));
		
		io.escribir(tiempos);
	}

}
