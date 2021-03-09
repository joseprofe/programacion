package models;

public class ArbolBinario {

	private NodoBinario raiz;

	public ArbolBinario(NodoBinario raiz) {
		super();
		this.raiz = raiz;
	}

	public NodoBinario getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoBinario raiz) {
		this.raiz = raiz;
	}
	
	public void preOrden() 
	{
		this.raiz.preOrden();
	}

}
