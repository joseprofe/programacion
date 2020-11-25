package es.iespablopicasso.winnie.models;

public class Punto {

	private int x, y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void suma(Punto p) {
		this.x += p.getX();
		this.y += p.getY();
	}

	public void dobla() {
		this.suma(this);
	}

}
