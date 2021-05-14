package models;

public class Weather {

	private String fecha;
	private String estado;
	private int min;
	private int max;

	public Weather(String fecha, String estado, int min, int max) {
		super();
		this.fecha = fecha;
		this.estado = estado;
		this.min = min;
		this.max = max;
	}

	@Override
	public String toString() {
		return "Weather [fecha=" + fecha + ", estado=" + estado + ", min=" + min + ", max=" + max + "]";
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
