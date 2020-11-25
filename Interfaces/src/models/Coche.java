package models;

import interfaces.Acelerable;

public class Coche extends Vehiculo implements Acelerable {

	@Override
	public void arrancar() {
		System.out.println("El coche está arrancado");
	}

	@Override
	public void detenerMotor() {
		System.out.println("El coche se ha detenido");

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
