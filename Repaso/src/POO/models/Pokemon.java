package POO.models;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
	// ATRIBUTOS o PROPIEDADES
	private String nombre;
	private int nivel; // 1-100
	private int maxHP;
	private int actualHP;
	private int velocidad;
	private List<Movimiento> listaMov;

	// CONSTRUCTORES
	public Pokemon(String nombre, int velocidad) {
		this.nombre = nombre;
		this.nivel = 5;
		this.maxHP = 20;
		this.velocidad = velocidad;
		this.actualHP = this.maxHP;
		this.listaMov = new ArrayList<Movimiento>();
	}

	public Pokemon(String nombre, int nivel, int maxHP, int velocidad) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.maxHP = maxHP;
		this.velocidad = velocidad;
		this.actualHP = this.maxHP;
		this.listaMov = new ArrayList<Movimiento>();
	}

	// MÉTODOS

	/**
	 * Permite añadir un movimiento a la lista de movimientos.
	 * @param mov
	 */
	public void aprenderMovimiento(Movimiento mov) {
		this.listaMov.add(mov);
	}
	
	/**
	 * Imprime por pantalla todos los movimientos del pokemon.
	 */
	public void verMovimientos() {
		for(Movimiento mov : listaMov) {
			System.out.println(mov);
		}
	}
	
	/**
	 * Devuelve el número de movimientos que tiene disponibles el pokemon.
	 * @return
	 */
	public int cuantosMovimientosTiene() {
		return this.listaMov.size(); 
	}
	
	/**
	 * Devuelve el movimiento en base al índice de la lista
	 * @param indice
	 * @return
	 */
	public Movimiento getMovimientoElegido(int indice) {
		return this.listaMov.get(indice); 
	}
	
	/**
	 * Permite subir de nivel a cualquier pokemon.
	 */
	public void darCarameloRaro() {
		this.nivel++;
		this.maxHP += 6;
	}

	/**
	 * El pokemon recibe un ataque de danyo HP por lo que decrementa sus HP.
	 * @param danyo
	 */
	public void recibirAtaque(int danyo) {
		System.out.println(this.nombre + " sufrió un ataque de " + danyo + "HP");
		if (danyo > this.actualHP) {
			this.actualHP = 0;
		} else {
			this.actualHP = this.actualHP - danyo;
		}
	}

	/**
	 * Devuelve un string con la vida actual del pokemon.
	 * @return
	 */
	public String getVida() {
		return actualHP + "/" + maxHP;
	}

	/**
	 * Indica si el pokemon está vivo o no.
	 * @return
	 */
	public boolean estaVivo() {
		return this.actualHP > 0;
	}

	/**
	 * Permite curar al pokemon con 20HP, siempre que esté vivo.
	 */
	public void darPocion() {
		if (this.estaVivo()) {
			this.actualHP += 20;
		} else {
			System.out.println("El pokemon no se puede curar, está debilitado.");
		}
	}

	/**
	 * Recupera al pokemon a sus máximas estadísticas.
	 */
	public void curarCentroPokemon() {
		this.actualHP = this.maxHP;
		for(var mov : listaMov) {
			mov.restaurarPP();
		}
	}

	@Override
	public String toString() {
		return nombre + " | Lvl=" + nivel + " | Vida=" + this.getVida();
	}

	public int getVelocidad() {
		return velocidad;
	}

}
