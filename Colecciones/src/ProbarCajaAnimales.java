import java.util.ArrayList;

import Models.Animal;
import Models.CajaSchrodinger;
import Models.Gato;
import Models.Perro;

public class ProbarCajaAnimales {

	public static void main(String[] args) {
//		CajaSchrodinger<Animal> cajita = new CajaSchrodinger<Animal>();
		ArrayList<Animal> lista = new ArrayList<Animal>();
		
//		lista.add(new Perro("Lor", "Chihuahua"));
//		lista.add(new Gato("Misifú", "Misifuense"));
//		lista.add(new Gato("Garfield", "Naranja"));
//		lista.add(new Gato("Doraemon", "Gato Cósmico"));
//		lista.add(new Gato("Gato con BOTAS", "Malo"));

		// FORMA 1
//		int indiceAnimal;
//		for (Animal animal : lista) {
//			System.out.println("El animal "+ animal + " se introduce en la caja...");
//			if(cajita.observar(animal) == null) {  //Se observa si está vivo o no!
//				indiceAnimal = lista.indexOf(animal);
//				lista.set(indiceAnimal, null);
//			}
//		}

		// FORMA 2
//		var it = lista.iterator();
//		while(it.hasNext()) {
//			Animal animal = it.next();
//			System.out.println("El animal "+ animal + " se introduce en la caja...");
//			if(cajita.observar(animal) == null) {  //Se observa si está vivo o no!
//				lista.remove(animal);
//			}
//		}

//		//Vemos quién está vivo
//		System.out.println("\n\nLos siguientes animales son los supervivientes");
//		for (Animal animal : lista) {
//			System.out.println(animal);
//		}

		Perro scoobie = new Perro("Scoobie", "Lo que sea", 2);
		Perro scoobie2 = new Perro("Scoobie", "Lo que sea", 2);
		Perro scoobie3 = scoobie;
		System.out.println(scoobie.hashCode());
		System.out.println(scoobie2.hashCode());
		System.out.println(scoobie3.hashCode());
		System.out.println(scoobie.equals(scoobie2));
		System.out.println(scoobie.equals(scoobie));
		System.out.println(scoobie.equals(scoobie3));
	}

}
