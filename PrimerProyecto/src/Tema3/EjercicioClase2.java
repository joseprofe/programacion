package Tema3;

public class EjercicioClase2 {
//	Crea un programa en Java que imprima los 
//	100 primeros números pares empezando desde el 0.
	public static void main(String[] args) {
		
		for(int i = 0; i < 100 ; i++) {
			if(esPar(i)) { //Si el número es par
				System.out.println(i);
			}
		}		
	}
	
	public static boolean esPar(int miNumerito) {
		if(miNumerito % 2 == 0) { //Si el número es par
			return true;
		} else { //El número es impar
			return false;
		}
	}
}
