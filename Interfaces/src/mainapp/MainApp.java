package mainapp;

import java.util.ArrayList;
import java.util.List;

import interfaces.Acelerable;
import interfaces.Arrancable;
import models.Coche;
import models.Motocicleta;

public class MainApp {

	public static void main(String[] args) {
		List<Acelerable> lista = new ArrayList<Acelerable>();
		lista.add(new Coche());
		lista.add(new Motocicleta());
		
		for (Arrancable a : lista) {
			a.arrancar();
		}
	}

}
