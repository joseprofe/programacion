package mainapp;

import java.util.Iterator;

import models.Arbol;
import models.Nodo;

public class Mainapp {

	public static void main(String[] args) {
		/*
		//Creamos la raiz
		NodoBinario raiz = new NodoBinario(1, null);
		
		//Creamos nodos y sus papas
		NodoBinario nodo2 = new NodoBinario(2, raiz);
		NodoBinario nodo7 = new NodoBinario(7, raiz);		
		NodoBinario nodo3 = new NodoBinario(3, nodo2);
		NodoBinario nodo4 = new NodoBinario(4, nodo2);
		NodoBinario nodo5 = new NodoBinario(5, nodo4);
		NodoBinario nodo6 = new NodoBinario(6, nodo4);
		NodoBinario nodo8 = new NodoBinario(8, nodo7);
		NodoBinario nodo9 = new NodoBinario(9, nodo7);
		
		
		//Establecemos los hijos de cada nodo
		raiz.setNodoIzq(nodo2);
		raiz.setNodoDer(nodo7);
		nodo2.setNodoIzq(nodo3);
		nodo2.setNodoDer(nodo4);
		nodo7.setNodoIzq(nodo8);
		nodo7.setNodoDer(nodo9);
		nodo4.setNodoIzq(nodo5);
		nodo4.setNodoDer(nodo6);
		nodo8.setNodoDer(new NodoBinario(10, nodo8));
		
		ArbolBinario arbolito = new ArbolBinario(raiz);	*/
		
		/*
		//Creamos la raiz
		Nodo raiz = new Nodo(1, null);
		
		//Creamos nodos y sus papas
		Nodo nodo2 = new Nodo(2, raiz);
		Nodo nodo7 = new Nodo(7, raiz);		
		Nodo nodo3 = new Nodo(3, nodo2);
		Nodo nodo4 = new Nodo(4, nodo2);
		Nodo nodo5 = new Nodo(5, nodo4);
		Nodo nodo6 = new Nodo(6, nodo4);
		Nodo nodo8 = new Nodo(8, nodo7);
		Nodo nodo9 = new Nodo(9, nodo7);
		
		
		//Establecemos los hijos de cada nodo
		raiz.getHijos().add(nodo2);
		raiz.getHijos().add(nodo7);
		nodo2.getHijos().add(nodo3);
		nodo2.getHijos().add(nodo4);
		nodo7.getHijos().add(nodo8);
		nodo7.getHijos().add(nodo9);
		nodo7.getHijos().add(new Nodo(10, nodo7));
		nodo7.getHijos().add(new Nodo(11, nodo7));
		nodo4.getHijos().add(nodo5);
		nodo4.getHijos().add(nodo6);
		
		Arbol arbolito = new Arbol(raiz);
		arbolito.preOrden(); */
		
		Nodo raiz = new Nodo("~", null);
		Nodo pollo = new Nodo("pollo", raiz);
		Nodo cerdo = new Nodo("cerdo", raiz);
		Nodo ternera = new Nodo("ternera", raiz);
		Nodo uno = new Nodo("uno", pollo);	
		Nodo dos = new Nodo("dos", pollo);	
		Nodo tres = new Nodo("tres", cerdo);	
		Nodo cuatro = new Nodo("cuatro", ternera);	
		Nodo cinco = new Nodo("cinco", dos);
		
		raiz.getHijos().add(pollo);
		raiz.getHijos().add(cerdo);
		raiz.getHijos().add(ternera);
		pollo.getHijos().add(uno);
		pollo.getHijos().add(dos);
		cerdo.getHijos().add(tres);
		ternera.getHijos().add(cuatro);
		dos.getHijos().add(cinco);
		cinco.insertarNodo("seis");
		
		Arbol arbol = new Arbol(raiz);
		arbol.mostrarArbol();
		System.out.println();

		
		
		
	}

}
