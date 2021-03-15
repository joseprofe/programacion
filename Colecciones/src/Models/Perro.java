package Models;

public class Perro extends Animal {

	private String raza;
	private int edad;

	public Perro(String nombre, String raza, int edad) {
		super(nombre);
		this.setRaza(raza);
		this.edad = edad;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((raza == null) ? 0 : raza.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		if (raza == null) {
			if (other.raza != null)
				return false;
		} else if (!raza.equals(other.raza))
			return false;
		return true;
	}
	
	
	
}
