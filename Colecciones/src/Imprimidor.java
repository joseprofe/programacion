public class Imprimidor<T> {

	private T objeto;
	
	
	public Imprimidor() {

	}

	public Imprimidor(T objeto) {

		this.objeto = objeto;

	}

	public void setObjeto(T objeto) {

		this.objeto = objeto;

	}

	public T getObjeto() {

		return objeto;

	}

	public void imprimir() {

		System.out.println(objeto.toString());

	}

	public void imprimir_reves() {

		StringBuffer sb = new StringBuffer(objeto.toString());

		System.out.println(sb.reverse());

	}

}