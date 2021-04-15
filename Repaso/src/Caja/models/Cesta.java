package Caja.models;

import java.util.ArrayList;

public class Cesta {
	private ArrayList<Producto> productos;
	
	public Cesta() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void listarProductos() {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		System.out.println("Suma un total de: " + getPrecioTotal() + "€");
	}
	
	public double getPrecioTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	public void addProducto(Producto p) {
		this.productos.add(p);
	}
	
	public void resetearCesta() {
		this.productos.clear();
	}
	
	public boolean estaVacia() {
		return this.productos.isEmpty();
	}
}
