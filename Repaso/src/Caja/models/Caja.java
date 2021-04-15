package Caja.models;

import java.util.Scanner;

public class Caja {
	private double totalVendidoDia;
	private Cesta cesta;
	private final String u = "admin";
	private final String p = "P@ssw0rd";
	private Scanner sc;
	
	public Caja() {
		this.sc = new Scanner(System.in);
		this.cesta = new Cesta();
		this.totalVendidoDia = 0;
	}
	
	public double getCambio(double pasta) {
		return pasta - cesta.getPrecioTotal();
	}
	
	public void resetearCesta() {
		this.cesta.resetearCesta();
	}
	
	public boolean login(String usuario, String pass) {
		return usuario.equals(u) && pass.equals(p);
	}
	
	public void pasarProducto() {
		System.out.print("Dime el nombre del producto: ");
		String nombre = sc.nextLine();
		System.out.print("Dime el precio del producto: ");
		double precio = Double.parseDouble(sc.nextLine());
		
		Producto prod = new Producto(nombre, precio);
		this.cesta.addProducto(prod);
	}
	
	public void pagar() {
		this.cesta.listarProductos();
		System.out.println("¿Cuánto dinero entrega el cliente? ");
		double pasta = Double.parseDouble(sc.nextLine());
		
		System.out.println("Este es su cambio: " + getCambio(pasta));
		
		this.totalVendidoDia += cesta.getPrecioTotal();
		
		this.resetearCesta();	
		
		System.out.println("Grasiah por venih, noh vemoh");
	
	}
	
	public boolean hayAlgunProducto() {
		return !this.cesta.estaVacia();
	}
}
