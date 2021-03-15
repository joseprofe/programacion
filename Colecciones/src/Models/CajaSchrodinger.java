package Models;

public class CajaSchrodinger<E extends Animal> {

	public E observar(E pepe) {
		if (Math.random() < 0.5) {
			pepe.setEstaVivo(true);
		} else {
			pepe.setEstaVivo(false);
		}

		if (pepe.isVivo()) {
			return pepe;
		} else {
			return null;
		}
	}

}
