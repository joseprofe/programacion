package POO.models;

import java.util.Scanner;

public class Combate {
	private Pokemon pokemon1, pokemon2;
	private Scanner sc;

	public Combate(Pokemon pokemon1, Pokemon pokemon2) {
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		sc = new Scanner(System.in);
	}

	/**
	 * Elige el pokemon que empieza a atacar en cada turno en base a su velocidad
	 * @return
	 */
	public Pokemon quienEmpieza() {
		if (pokemon1.getVelocidad() > pokemon2.getVelocidad()) {
			return pokemon1;
		} else {
			return pokemon2;
		}
	}

	/**
	 * Elige el pokemon que NO empieza a atacar en cada turno en base a su velocidad
	 * @return
	 */
	public Pokemon quienNoEmpieza() {
		if (pokemon1.getVelocidad() > pokemon2.getVelocidad()) {
			return pokemon2;
		} else {
			return pokemon1;
		}
	}

	/**
	 * Lanza toda la lógica del combate
	 */
	public void combatir() {
		System.out.println("¡Comienza el combate!");
		while (pokemon1.estaVivo() && pokemon2.estaVivo()) {
			
			verEstadoCombate();
			// Se elige quien empieza a atacar y quien ataca en segundo lugar
			Pokemon empieza = quienEmpieza();
			Pokemon noEmpieza = quienNoEmpieza();

			// El que empieza elige movimiento
			Movimiento mov = eligeMovimientoPokemon(empieza);

			// El que empieza usa movimiento
			System.out.println(empieza + " va a usar " + mov);
			mov.usar();
			noEmpieza.recibirAtaque(mov.getDanyo());

			System.out.println(noEmpieza + " sufrió " + mov.getDanyo() + "HP de daño");

			if (!noEmpieza.estaVivo()) {
				System.out.println(noEmpieza + " se debilitó...");
				break; // este break es para que si se debilita noEmpieza, se acabe el combate y no
						// siga atacando estando debilitado.
			}

			// El que NO empieza elige movimiento
			mov = eligeMovimientoPokemon(noEmpieza);

			// El que NO empieza usa movimiento
			System.out.println(noEmpieza + " va a usar " + mov);
			mov.usar();
			empieza.recibirAtaque(mov.getDanyo());

			System.out.println(empieza + " sufrió " + mov.getDanyo() + "HP de daño");

			if (!empieza.estaVivo()) {
				System.out.println(noEmpieza + " se debilitó...");
			}
			
			System.out.println("\n\n\n\n\n\n");
		}

		verEstadoCombate();
		System.out.println("¡FIN DEL COMBATE!");
		sc.close();
	}

	/**
	 * Dado un pokemon poke, permite visualizar sus movimientos, elegir uno de ellos
	 * en base a su índice (validado) y lo devuelve.
	 * @param poke
	 * @return
	 */
	public Movimiento eligeMovimientoPokemon(Pokemon poke) {
		int numMov;
		System.out.println(poke);
		poke.verMovimientos();
		do {
			System.out.print("Elige un movimiento: ");
			numMov = Integer.parseInt(sc.nextLine());
		} while (numMov < 1 || numMov > poke.cuantosMovimientosTiene());

		// En la lista de mov, el ataque 1 tiene índice 0, por lo que
		// debemos restar 1 a la opción elegida por el usuario.
		numMov--;
		return poke.getMovimientoElegido(numMov);
	}
	
	/**
	 * Muestra el estado de ambos pokemon de forma bonita.
	 */
	public void verEstadoCombate() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|  " + pokemon1 + " VS " + pokemon2 + "   |");
		System.out.println("--------------------------------------------------------------------------");

	}

}
