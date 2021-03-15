package Models;

public abstract class Animal {

	protected String nombre;
	protected boolean estaVivo;

	public Animal(String nombre) {
		super();
		this.estaVivo = true;
		this.nombre = nombre;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (estaVivo ? 1231 : 1237);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (estaVivo != other.estaVivo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public void setEstaVivo(boolean vivo) {
		this.estaVivo = vivo;
	}
	
	public boolean isVivo() {
		return this.estaVivo;
	}
	
	
}
