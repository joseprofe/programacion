package Tema5;

public class EjemploLili {
	public static void main(String[] args) {
		int numGanador = (int) (Math.random()*99999);
		String ganadorString = Integer.toString(numGanador);
		int miNumero = 111;
		String miNumeroString = Integer.toString(miNumero);
		
		while(ganadorString.length() < 5) {
			ganadorString = "0" + ganadorString;
		}
		
		while(miNumeroString.length() < 5) {
			miNumeroString = "0" + miNumeroString;
		}		
		
		System.out.println(ganadorString);
		System.out.println(miNumeroString);
		
		if(miNumeroString.charAt(4) == ganadorString.charAt(4)) {
			System.out.println("Coincide el último número");
		}
	}
}
