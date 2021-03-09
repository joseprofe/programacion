import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class RecorrerColecciones {

	public static void main(String[] args) {
		
		
		ArrayList<String> listita = new ArrayList<String> ();
	
		
		for (int i = 0; i < listita.size(); i++) {
			System.out.println(listita.get(i));
		}
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);

		LinkedList<Integer> listaEnlazada = new LinkedList<Integer>();
		
		var ite = listaEnlazada.listIterator();
		
		//Forma 1
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Forma 2
		for (int integer : lista) {
			System.out.println(integer);
		}
		
		//Forma 3
		Iterator<Integer> it = lista.iterator();
		while (it.hasNext()) {
			Integer miEntero = (Integer) it.next();
			System.out.println(miEntero);
			
		}
		
		

	}

}
