package models;

public class Tipo {
	private int codigo;
	private String tipo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Tipo(int codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}
}
