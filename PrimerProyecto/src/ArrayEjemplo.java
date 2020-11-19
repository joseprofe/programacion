import java.util.Arrays;

public class ArrayEjemplo {

	public static void main(String[] args) {

		double[] miVector = new double[20];

		for (int i = 0; i < miVector.length; i++) {
			miVector[i] = i * 5;
		} //RELLENA

		for (int i = 0; i < miVector.length; i++) {
			System.out.println(miVector[i]);
		} //PRINTEA
		
		double media = calculaMedia(miVector);
		System.out.println("La media es: " + media);
		System.out.println("FIN");
		
		
		String[] pollo = new String[3];
		
		pollo[0] = "pollo";
		pollo[1] = "hola";
		pollo[2] = "Hola";
		
		Arrays.sort(pollo);
		
		for (int i = 0; i < pollo.length; i++) {
			System.out.println(pollo[i]);
		}
		
		
		
		
		
		
		
		
	}
	
	public static double calculaMedia(int[] a) {
		double media = 0;
		for (int i = 0; i < a.length; i++) {
			media += a[i];
		}
		
		media = media/a.length;
		
		return media;
	}
	
	public static double calculaMedia(double[] a) {
		double media = 0;
		for (int i = 0; i < a.length; i++) {
			media += a[i];
		}
		
		media = media/a.length;
		
		return media;
	}

}
