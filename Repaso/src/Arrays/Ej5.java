package Arrays;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		int[] miArray = new int[5];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < miArray.length; i++) {
			System.out.print("Dime el número: ");
			miArray[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println("El array se ha rellenado.");

		for (int i = 0; i < miArray.length; i++) {
			if (max < miArray[i]) {
				max = miArray[i];
			}
			if(min > miArray[i]) {
				min = miArray[i];
			}
		}
		
		System.out.println("El minimo: " + min);
		System.out.println("El máximo: " + max);

		sc.close();
	}

}
