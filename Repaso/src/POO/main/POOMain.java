package POO.main;

import POO.models.Pokemon;

public class POOMain {

	public static void main(String[] args) {

		Pokemon pikachu = new Pokemon(25,"Pikachu");
		Pokemon charmander = new Pokemon(4,"Charmander",100,250);
		
		System.out.println(pikachu);
		pikachu.darCarameloRaro();	
		
		pikachu.recibirAtaque(100);
		
		System.out.println(pikachu);
		System.out.println(pikachu.estaVivo());
		

		
	}

}
