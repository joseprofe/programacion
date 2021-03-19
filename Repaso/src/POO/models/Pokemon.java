package POO.models;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
	// ATRIBUTOS o PROPIEDADES
	private int numero;
	private String nombre;
	private int nivel; // 1-100
	private int maxHP;
	private int actualHP;
	private List<Movimiento> listaMov;

	// CONSTRUCTORES
	public Pokemon(int numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
		this.nivel = 5;
		this.maxHP = 20;
		this.actualHP = this.maxHP;
		this.listaMov = new ArrayList<Movimiento>();
	}

	public Pokemon(int numero, String nombre, int nivel, int maxHP) {
		this.numero = numero;
		this.nombre = nombre;
		this.nivel = nivel;
		this.maxHP = maxHP;
		this.actualHP = this.maxHP;
		this.listaMov = new ArrayList<Movimiento>();
	}

	// MÉTODOS

	public void aprenderMovimiento(Movimiento mov) {
		this.listaMov.add(mov);
	}
	
	public void verMovimientos() {
		for(Movimiento mov : listaMov) {
			System.out.println(mov);
		}
	}
	
	public void darCarameloRaro() {
		this.nivel++;
		this.maxHP += 6;
	}

	public void recibirAtaque(int danyo) {
		System.out.println(this.nombre + " sufrió un ataque de " + danyo + "HP");
		if (danyo > this.actualHP) {
			this.actualHP = 0;
		} else {
			this.actualHP = this.actualHP - danyo;
		}
	}

	public String getVida() {
		return actualHP + "/" + maxHP;
	}

	public boolean estaVivo() {
		return this.actualHP > 0;
	}

	public void darPocion() {
		if (this.estaVivo()) {
			this.actualHP += 20;
		} else {
			System.out.println("El pokemon no se puede curar, está debilitado.");
		}
	}

	public void curarCentroPokemon() {
		this.actualHP = this.maxHP;
	}

	@Override
	public String toString() {
		return nombre + " | Lvl=" + nivel + " | Vida=" + this.getVida();
	}

}
