package POO.main;

import POO.models.Combate;
import POO.models.Movimiento;
import POO.models.Pokemon;

public class POOMain {

	public static void main(String[] args) {

		Pokemon pikachu = new Pokemon("Pikachu", 24);
		Pokemon charmander = new Pokemon("Charmander", 100, 250, 35);
		Combate c;

		pikachu.aprenderMovimiento(new Movimiento("Impactrueno", 20, 50));
		pikachu.aprenderMovimiento(new Movimiento("Látigo", 20, 0));

		charmander.aprenderMovimiento(new Movimiento("Ascuas", 20, 60));
		charmander.aprenderMovimiento(new Movimiento("Gruñido", 20, 0));

		c = new Combate(pikachu, charmander);
		c.combatir();

	}

}
