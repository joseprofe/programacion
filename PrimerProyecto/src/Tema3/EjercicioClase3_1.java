package Tema3;

public class EjercicioClase3_1 {
//	Crea un programa en Java que imprima los 
//	100 primeros números primos.
	public static void main(String[] args) {
		
		int i = 2;
		int contadorPrimos = 0;
		
		while(contadorPrimos != 100) {
			boolean esPrimo = true; //flag o centinela.
			
			for(int j = 2; j < i ; j++) { //Compruebo desde 2 hasta i
				if(i%j == 0) {
					esPrimo = false;
					break;
				} 
			}
			 
			if(esPrimo) {
				System.out.println(i + " es primo");
				contadorPrimos++;
			} 
//			else { //Si quiero que me diga también los no primos.
//				System.out.println(i +" no es primo");
//			}
		
			i++;
		}
			
	}
}
