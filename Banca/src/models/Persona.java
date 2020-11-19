package models;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private CuentaCorriente cuenta;

	public Persona(String nombre, String apellidos, String dni, double sueldo, CuentaCorriente c) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuenta = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public CuentaCorriente getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}
	
	public void cobrarSueldo() {
		this.cuenta.sumarCantidad(getSueldo());
		//this.cuenta.sumarCantidad(this.sueldo);
	}
	
	public void sacarPasta(double cantidad) {
		try {
			this.cuenta.restarCantidad(cantidad);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Te doy lo que tienes en la cuenta, crack.");
			System.out.println("Has sacado: " + this.cuenta.getSaldo() + "leros");
			try {
				this.cuenta.restarCantidad(this.cuenta.getSaldo());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void subirSueldo(double nuevoSueldo) {
//		this.sueldo = nuevoSueldo;
		this.setSueldo(nuevoSueldo);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sueldo=" + sueldo
				+ ", cuenta=" + cuenta + "]";
	}

}
