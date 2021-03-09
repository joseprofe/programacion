import Models.Pokemon;

public class ProbarImprimidor {

	public static void main(String[] args) {

		Imprimidor<Pokemon> mi = new Imprimidor<Pokemon>(new Pokemon(1, "Bulbasaur", "Planta"));
	
		mi.imprimir();
		mi.imprimir_reves();
	}

}
