package models;

import java.util.ArrayList;
import java.util.Collections;

public class Nodo {

	private String valor;
	private Nodo papa;
	private ArrayList<Nodo> hijos;

	public Nodo(String valor, Nodo papa) {
		super();
		this.valor = valor;
		this.papa = papa;
		this.hijos = new ArrayList<Nodo>();
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Nodo getPapa() {
		return papa;
	}

	public void setPapa(Nodo papa) {
		this.papa = papa;
	}

	public ArrayList<Nodo> getHijos() {
		return hijos;
	}

	public void setHijos(ArrayList<Nodo> hijos) {
		this.hijos = hijos;
	}

	public boolean esHoja() {
		return this.hijos.size() == 0;
	}

	public void preOrden() {
		System.out.println(this.valor);

		if (!this.esHoja()) {
			for (var nodo : hijos) {
				nodo.preOrden();
			}
		} else {
			return;
		}
	}

	public Nodo buscarNodo(String valor) {
		if (this.valor.equals(valor)) {
			return this;
		} else if (!esHoja()) {
			for (var hijo : hijos) {
				var res = hijo.buscarNodo(valor);
				if (res != null) {
					return res;
				}
			}
		}

		return null;

	}

	public Nodo insertarNodo(String valor) {
		var hijo = new Nodo(valor, this);
		this.hijos.add(hijo);
		return hijo;
	}

	public ArrayList<Nodo> path(String valor, ArrayList<Nodo> path) {
		if (this.valor.equals(valor)) {
			path.add(this);
			return path;
		} else if (!esHoja()) {
			for (var hijo : hijos) {
				var res = hijo.path(valor, path);
				if (res != null) {
					path.add(this);
					return path;
				}
			}
		}

		return null;
	}

	public void preOrdenPath(ArrayList<Nodo> path) {
		path.add(this);

		String pathString = "";
		for (Nodo nodo : path) {
			pathString += nodo + "/";
		}
		System.out.println(pathString);

		if (!this.esHoja()) {
			for (var nodo : hijos) {
				nodo.preOrdenPath(path);
			}
		}

		path.remove(this);
		return;

	}

	@Override
	public String toString() {
		return valor;
	}
}
