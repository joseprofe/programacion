package models;

import java.util.Date;

public class Animal {

	private Date fNac;

	public Animal(Date fNac) {
		super();
		this.fNac = fNac;
	}

	public Date getfNac() {
		return fNac;
	}

	public void setfNac(Date fNac) {
		this.fNac = fNac;
	}	
}
