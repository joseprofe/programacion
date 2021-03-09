package Models;

public class Pokemon {

	private int numero;
	
	private String nombre;
	
	private String tipo;

	public Pokemon(int numero, String nombre, String tipo) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pokemon [numero=" + numero + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	
	
}
