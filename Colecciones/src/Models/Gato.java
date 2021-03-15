package Models;

public class Gato extends Animal {

	private String raza;

	public Gato(String nombre, String raza) {
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
	public String toString() {
		return "Gato [raza=" + raza + ", nombre=" + nombre + ", estaVivo=" + estaVivo + "]";
	}
	
}

