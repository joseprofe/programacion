package picassocollections;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Pila<J> {
	private LinkedList<J> elementos;

	public Pila() {
		elementos = new LinkedList<J>();
	}

	public void add(J elemento) {
		if (elemento != null) {
			elementos.add(elemento);
		} else {
			throw new NullPointerException("No se pueden añadir nulls.");
		}
	}

	public J peek() {
		if (!elementos.isEmpty())
			return elementos.pollLast();
		else
			throw new EmptyStackException();
	}

	public void clear() {
		elementos.clear();
	}
	
	@Override
	public String toString() {
		String out = "--\n";
		for (int i = elementos.size() -1 ; i >= 0 ; i-- ) {
			out += elementos.get(i) + "\n";
		} 
		out += "--";
		return out;
	}

}
