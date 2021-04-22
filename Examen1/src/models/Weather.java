package models;

public class Weather {

	private String mes;
	private int tMax;
	private int tMin;
	private int nLluvias;

	public Weather(String mes, int tMax, int tMin, int nLluvias) {
		super();
		this.mes = mes;
		this.tMax = tMax;
		this.tMin = tMin;
		this.nLluvias = nLluvias;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int gettMax() {
		return tMax;
	}

	public void settMax(int tMax) {
		this.tMax = tMax;
	}

	public int gettMin() {
		return tMin;
	}

	public void settMin(int tMin) {
		this.tMin = tMin;
	}

	public int getnLluvias() {
		return nLluvias;
	}

	public void setnLluvias(int nLluvias) {
		this.nLluvias = nLluvias;
	}

	@Override
	public String toString() {
		return "Weather [mes=" + mes + ", tMax=" + tMax + ", tMin=" + tMin + ", nLluvias=" + nLluvias + "]";
	}

}
