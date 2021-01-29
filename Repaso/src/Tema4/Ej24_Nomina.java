package Tema4;

import java.util.Scanner;

public class Ej24_Nomina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cargo = 0, dias = 0, estadoCivil = 0;
		double sueldoBase = 0, totalDietas = 0, sueldoNeto = 0, 
				sueldoBruto = 0, retencionIRPF = 0;
		final double CANTIDAD_DIETA_DIA = 30, IRPF_SOLTERO = 25, IRPF_CASADO = 20; 
		
		//Mensaje de bienvenida
		System.out.println("CALCULADORA DE NÓMINAS");
		System.out.println("----------------------");
		
		//Menu y pedir datos al usuario
		System.out.println("1 - Programador junior\n" + 
				"2 - Prog. senior\n" + 
				"3 - Jefe de proyecto");
		
		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
		cargo = Integer.parseInt(sc.nextLine());
		
		System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
		dias = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		estadoCivil = Integer.parseInt(sc.nextLine());
		
		//Calcular la nomina
		switch(cargo) {
		case 1: //Jr.
			sueldoBase = 950;
			break;
		case 2: //Sr.
			sueldoBase = 1200;
			break;
		case 3: //jefe
			sueldoBase = 1600;
			break;
		}
		
		totalDietas = CANTIDAD_DIETA_DIA * dias;
		
		sueldoBruto = sueldoBase + totalDietas;
		
		if(estadoCivil == 1) {
			retencionIRPF = sueldoBruto * IRPF_SOLTERO / 100;
		} else if (estadoCivil == 2) {
			retencionIRPF = sueldoBruto * IRPF_CASADO / 100;
		}
		
		sueldoNeto = sueldoBruto - retencionIRPF;
		
		//Imprimir la nómina
		System.out.println("----------------------------------\n"
		+ " Sueldo base \t\t  " + sueldoBase + "  \n" 
		+ " Dietas \t\t  " + totalDietas + "  \n"
		+ "----------------------------------\n"
		+ " Sueldo bruto \t\t  " + sueldoBruto + "  \n" 
		+ " Retención IRPF (" + (estadoCivil == 1 ? IRPF_SOLTERO : IRPF_CASADO) + "%)   " 
		+ retencionIRPF + "\n"
		+ "----------------------------------\n"
		+ " Sueldo neto \t\t  " + sueldoNeto + "  \n" 
		+ "----------------------------------\n"
				);
		
		sc.close();
	}
}
