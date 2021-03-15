package Models;

public class Perro extends Animal {


	private String raza;

	public Perro(String nombre, String raza) {
		super(nombre);
		this.setRaza(raza);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}	
	
	@Override
	public void setEstaVivo(boolean vivo) {
		this.estaVivo = true;
	}
	

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + ", estaVivo=" + estaVivo + "]";
	}
	
}
