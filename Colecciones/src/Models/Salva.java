package Models;

public class Salva {
	private boolean salva;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (salva ? 1231 : 1237) + super.hashCode();
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
		Salva other = (Salva) obj;
		if (salva != other.salva)
			return false;
		return true;
	}
}
