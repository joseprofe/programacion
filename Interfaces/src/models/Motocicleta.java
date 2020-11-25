package models;

import interfaces.Acelerable;

public class Motocicleta extends Vehiculo implements Acelerable {

	@Override
	public void arrancar() {
		System.out.println("La moto ha arrancado");
	}

	@Override
	public void detenerMotor() {
		System.out.println("La moto se ha detenido");
	}

	@Override
	public void acelerar(double v) {
		this.velosidad += v;
	}

	@Override
	public void frenar(double v) {
		this.velosidad -= v;
	}

}
