package POO.main;

import POO.models.Movimiento;
import POO.models.Pokemon;

public class POOMain {

	public static void main(String[] args) {

		Pokemon pikachu = new Pokemon(25,"Pikachu");
		Pokemon charmander = new Pokemon(4,"Charmander",100,250);
		
		pikachu.aprenderMovimiento(new Movimiento("Impactrueno", 20, 50));
		pikachu.aprenderMovimiento(new Movimiento("Látigo", 20, 0));
		
		charmander.aprenderMovimiento(new Movimiento("Ascuas", 20, 60));
		charmander.aprenderMovimiento(new Movimiento("Gruñido", 20, 0));
		
		System.out.println(pikachu);
		pikachu.verMovimientos();
		

		
	}

}
