package POO.models;

public class Movimiento {
	private String nombre;
	private int maxPP;
	private int actualPP;
	private int danyo;

	public Movimiento(String nombre, int maxPP, int danyo) {
		this.nombre = nombre;
		this.maxPP = maxPP;
		this.actualPP = this.maxPP;
		this.danyo = danyo;
	}

	public void usar() {
		this.actualPP--;
	}

	public int getDanyo() {
		return this.danyo;
	}

	@Override
	public String toString() {
		return "\t+" + nombre + " \t- [" + actualPP + "/" + maxPP + "]";
	}

}
