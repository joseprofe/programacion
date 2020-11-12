package Funciones;

public class MisFunciones {
	public static void saludo(String nombrecito, String edad) {
		System.out.println("Empieza el saludo");
		System.out.println("Hola " + nombrecito + ", tienes " + edad + " años.");
		System.out.println("Continua el saludo");
		System.out.println("Termina el saludo");
	}

	public static int suma(int a, int b) {
		return a + b;
	}

	public static void rellenaArrayCon4(int[] nobita) {
		for (int i = 0; i < nobita.length; i++) {
			nobita[i] = 4;
		}
	}

	public static void imprimirArray(int[] doraemon, String separador) {
		System.out.print("{ ");
		for (int i = 0; i < doraemon.length; i++) {
			//Siempre que sea distinto del último elemento del array
			if (i < doraemon.length - 1) {
				System.out.print(doraemon[i] + separador);
			} else { //Cuando sea el último elemento
				System.out.print(doraemon[i]);
			}
			

		}
		System.out.println(" }");
	}
}
