import Excepciones.CajonException;

public class Cajon<E> {

	private E loQueHayDentro;

	public Cajon() {
		this.loQueHayDentro = null;
	}

	// Meter algo
	public void metela(E loQueQuieroMeter) throws CajonException {
		if (this.loQueHayDentro == null) {
			this.loQueHayDentro = loQueQuieroMeter;
		} else {
			throw new CajonException("El cajón no está vacío");
		}

	}

	// Mirar que hay dentro
	public E mirar() {
		return this.loQueHayDentro;
	}

	// Sacar lo que haya dentro
	public void sacala() {
		this.loQueHayDentro = null;
	}
}
