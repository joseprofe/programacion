package mainapp;

import picassocollections.Pila;

public class MainApp {

	public static void main(String[] args) {

		Pila<Integer> pilita = new Pila<Integer>();

		pilita.add(1);
		pilita.add(2);
		pilita.add(3);
		pilita.add(4);

		System.out.println(pilita);

		pilita.add(5);

		System.out.println(pilita);

		var e = pilita.peek();
		System.out.println(e);
		System.out.println(pilita);

		pilita.clear();
		System.out.println(pilita);

	}

}
