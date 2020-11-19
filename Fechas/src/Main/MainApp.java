package Main;

import models.Animal;
import util.DateHelper;

public class MainApp {

	public static void main(String[] args) {

		Animal a = new Animal(DateHelper.fecha("22-10-1990"));
		System.out.println(DateHelper.printFecha(a.getfNac()));
		
	}
}
