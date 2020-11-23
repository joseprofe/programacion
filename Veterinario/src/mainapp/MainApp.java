package mainapp;

import enums.EspeciePajaro;
import models.Animal;
import models.ClinicaVeterinaria;
import models.Pajaro;
import models.Perro;
import util.ConsolaHelper;

public class MainApp {

	public static void main(String[] args) {
		Animal gregorio = new Perro("Gregorio Jr.", ConsolaHelper.leerFecha("nacimiento del animal"), 30,
				ConsolaHelper.elegirRazaPerro(), "12345678");
		gregorio.setComentarios("Es puro amor y un ladrillo.");

		Animal pollo = new Pajaro("Pollete de la ventana", ConsolaHelper.leerFecha("nacimiento"), 0.1, EspeciePajaro.Jilguero, true);
		pollo.setComentarios("Es un amorcito");
		System.out.println(pollo);
		
		ClinicaVeterinaria ernesto = new ClinicaVeterinaria();
		ernesto.insertaAnimal(gregorio);
		ernesto.insertaAnimal(pollo);
		ernesto.cambiarComentario("Pollete de la ventana", "Tengo hambresita");
		System.out.println(ernesto);

	}

}
