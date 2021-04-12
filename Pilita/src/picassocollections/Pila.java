package picassocollections;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Pila<E> {
	private LinkedList<E> elementos;

	public Pila() {
		elementos = new LinkedList<E>();
	}

	/**
	 * Añade un elemento a la cima de la pila
	 * 
	 * @param elemento a añadir
	 * @throws NullPointerException no permite añadir valores nulos.
	 */
	public void push(E elemento) throws NullPointerException {
		if (elemento != null) {
			elementos.add(elemento);
		} else {
			throw new NullPointerException("No se pueden añadir nulls.");
		}
	}

	/**
	 * Extrae el elemento en la cima de la pila si hay alguno.
	 * 
	 * @return elemento E de la cima
	 * @throws EmptyStackException en caso de estar vacía
	 */
	public E pop() throws EmptyStackException {
		if (!elementos.isEmpty())
			return elementos.pollLast();
		else
			throw new EmptyStackException();
	}

	/**
	 * Determina si la pila está vacía o no.
	 * 
	 * @return true si la pila está vacía.
	 */
	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	/**
	 * Devuelve el tamaño de la pila
	 * 
	 * @return tamaño de la pila.
	 */
	public int size() {
		return elementos.size();
	}

	/**
	 * Determina si un objecto está en la pila o no.
	 * 
	 * @param object objeto a comprobar.
	 * @return true si el objeto ya está en la pila
	 */
	public boolean contains(E object) {
		return elementos.contains(object);
	}
}
