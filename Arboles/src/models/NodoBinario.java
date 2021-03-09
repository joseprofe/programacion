package models;

public class NodoBinario {

	private int valor;
	private NodoBinario papa;
	private NodoBinario nodoIzq;
	private NodoBinario nodoDer;

	public NodoBinario(int valor, NodoBinario papa) {
		super();
		this.valor = valor;
		this.papa = papa;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public NodoBinario getPapa() {
		return papa;
	}

	public void setPapa(NodoBinario papa) {
		this.papa = papa;
	}

	public NodoBinario getNodoIzq() {
		return nodoIzq;
	}

	public void setNodoIzq(NodoBinario nodoIzq) {
		this.nodoIzq = nodoIzq;
	}

	public NodoBinario getNodoDer() {
		return nodoDer;
	}

	public void setNodoDer(NodoBinario nodoDer) {
		this.nodoDer = nodoDer;
	}

	public boolean esHoja() {
		return this.nodoIzq == null && this.nodoDer == null;
	}

	public void preOrden() {
		System.out.println(this.valor);

		if (!this.esHoja()) {
			if(nodoIzq != null)
				this.nodoIzq.preOrden();
			if(nodoDer != null)
				this.nodoDer.preOrden();
		} else {			
			return;
		}
	}

}
