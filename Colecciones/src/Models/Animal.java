package Models;

public abstract class Animal {

	protected String nombre;
	protected boolean estaVivo;

	public Animal(String nombre) {
		super();
		this.estaVivo = true;
		this.nombre = nombre;
	}
	
	public void setEstaVivo(boolean vivo) {
		this.estaVivo = vivo;
	}
	
	public boolean isVivo() {
		return this.estaVivo;
	}
	
	
}
