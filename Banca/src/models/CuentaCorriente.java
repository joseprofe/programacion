package models;

public class CuentaCorriente {

	private String númeroCuenta;
	private double saldo;

	public CuentaCorriente(String númeroCuenta, double saldo) {
		super();
		this.númeroCuenta = númeroCuenta;
		this.saldo = saldo;
	}

	public String getNúmeroCuenta() {
		return númeroCuenta;
	}

	public void setNúmeroCuenta(String númeroCuenta) {
		this.númeroCuenta = númeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sumarCantidad(double cantidad) {
		this.saldo = this.saldo + cantidad;
	}

	public void restarCantidad(double cantidad) throws Exception {
		if (this.saldo - cantidad < 0) {
			throw new Exception("ERROR, se quiere sacar más de lo que tienes, TITÁN");
		} else {
			this.saldo -= cantidad;
		}
	}

	@Override
	public String toString() {
		return "CuentaCorriente [númeroCuenta=" + númeroCuenta + ", saldo=" + saldo + "]";
	}

}
