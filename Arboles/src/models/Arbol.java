package models;

import java.util.ArrayList;
import java.util.Collections;

public class Arbol {

	private Nodo raiz;

	public Arbol(Nodo raiz) {
		super();
		this.raiz = raiz;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	public void preOrden() 
	{
		this.raiz.preOrden();
	}
	
	public Nodo buscarNodo(String valor) {
		return raiz.buscarNodo(valor);
	}
	
	public Nodo insertarNodo(Nodo padre, String valor) {
		return padre.insertarNodo(valor);
	}
	
	public String path(String valor) {
		ArrayList<Nodo> path = new ArrayList<Nodo>();
		path = this.raiz.path(valor, path);

		if(path != null) {
			//Collections.reverse(path);
			String pathString = "";
			for (Nodo nodo : path) {
				pathString += nodo + "/";
			}
			return pathString;
		}
		return "No se encuentra dicho nodo...";
	}
	
	public void mostrarArbol() {

		ArrayList<Nodo> path = new ArrayList<Nodo>();
		this.raiz.preOrdenPath(path);
	}

}
