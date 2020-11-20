package mainapp;

import models.Perro;
import util.ConsolaHelper;

public class MainApp {

	public static void main(String[] args) {
		Perro gregorio = new Perro("Gregorio Jr.", ConsolaHelper.leerFecha("nacimiento del animal"), 30, ConsolaHelper.elegirRazaPerro(), "12345678");
		gregorio.setComentarios("Es puro amor y un ladrillo.");

		System.out.println(gregorio);

	}

}
