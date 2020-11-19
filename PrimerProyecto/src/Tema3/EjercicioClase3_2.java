package Tema3;

public class EjercicioClase3_2 {
//	Crea un programa en Java que imprima los 
//	100 primeros números primos.
	public static void main(String[] args) {
		
		int i = 2;
		int contadorPrimos = 0;
		
		while(contadorPrimos != 100) {
			
			if(esPrimo(i)) {
				System.out.println(i + " es primo");
				contadorPrimos++;
			} 
//			else { //Si quiero que me diga también los no primos.
//				System.out.println(i +" no es primo");
//			}
		
			i++;
		}			
	}
	
	public static boolean esPrimo(int elNumeraso) {		
		for(int j = 2; j < elNumeraso ; j++) { //Compruebo desde 2 hasta elNumeraso
			if(elNumeraso%j == 0) {
				return false;
			} 
		}		
		return true;
	}
}
