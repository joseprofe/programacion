package controllers;

import java.util.ArrayList;

import models.CuentaCorriente;
import models.Persona;
import utils.ConsolaHelper;

public class Controlador {
	static int contadorCuentas = 1;
	static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public void lanzarPrograma() {
		logicaMenu();
	}

	private Persona crearPersona() {
		String nombre = ConsolaHelper.leerString("nombre");
		String apellidos = ConsolaHelper.leerString("apellidos");
		String dni = ConsolaHelper.leerString("DNI");
		double sueldo = ConsolaHelper.leerDouble("sueldo");
		Persona p = new Persona(nombre, apellidos, dni, sueldo, new CuentaCorriente("Cuenta" + contadorCuentas++, 0.0));
		return p;
	}

	private void logicaMenu() {
		do {
			ConsolaHelper.imprimirMenu();
			int opc = ConsolaHelper.elegirOpcionMenu();
			switch (opc) {
			case 1:
				listaPersonas.add(crearPersona());
				break;
			case 2:
				logicaSubmenu();
				break;
			case 3:
				System.out.println("Vamos a borrar...");
				Persona p = elegirPersona();
				listaPersonas.remove(p);
				break;

			}
			System.out.println("¿Desea hacer algo más? Sí (1) No (0)");
		} while (ConsolaHelper.leerSiNo());
	}

	private void logicaSubmenu() {
		Persona p = elegirPersona();
		do {
			ConsolaHelper.imprimirSubMenu();
			int subOpc = ConsolaHelper.elegirOpcionSubMenu();
			switch (subOpc) {
			case 1:
				p.cobrarSueldo();
				break;
			case 2:
				System.out.println("¿Cuánto quieres sacar?");
				double pasta = ConsolaHelper.leerDouble("pasta");
				p.sacarPasta(pasta);
				break;
			case 3:
				System.out.println("¿Cuál es tu nuevo sueldo?");
				double sueldo = ConsolaHelper.leerDouble("sueldo");
				p.subirSueldo(sueldo);
				break;
			case 4:
				System.out.println(p);
				break;
			}
			System.out.println("¿Desea hacer algo más con " + p.getNombre() + "? Sí (1) No (0)");
		} while (ConsolaHelper.leerSiNo());
	}

	private Persona elegirPersona() {
		int contador = 1;
		for (Persona persona : listaPersonas) {
			System.out.println(contador++ + " - " + persona);
		}

		System.out.println("Introduce el número de la persona que quieres elegir.");
		int indicePersona = ConsolaHelper.elegirOpcion(1, listaPersonas.size());

		return listaPersonas.get(indicePersona - 1);
	}
}
