package es.gestionalumnado.models;

public class Alumno {
	private String nombre;
	private String clase;
	private float nota1T, nota2T, nota3T, media;

	public Alumno(String nombre, String clase, float nota1t, float nota2t, float nota3t) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		nota1T = nota1t;
		nota2T = nota2t;
		nota3T = nota3t;
		this.media = this.calcularMedia();
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public float getNota1T() {
		return nota1T;
	}

	public void setNota1T(float nota1t) {
		nota1T = nota1t;
	}

	public float getNota2T() {
		return nota2T;
	}

	public void setNota2T(float nota2t) {
		nota2T = nota2t;
	}

	public float getNota3T() {
		return nota3T;
	}

	public void setNota3T(float nota3t) {
		nota3T = nota3t;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", clase=" + clase + ", nota1T=" + nota1T + ", nota2T=" + nota2T
				+ ", nota3T=" + nota3T + ", media=" + media + "]";
	}
	
	public float calcularMedia() {
		return (this.nota1T + this.nota2T + this.nota3T) / 3;
	}

}
