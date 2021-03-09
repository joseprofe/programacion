import Excepciones.CajonException;

public class ProbarCajon {

	public static void main(String[] args) {

		Cajon<Integer> miCajon = new Cajon<Integer>();
		
		System.out.println(miCajon.mirar());
		
		try {
			miCajon.metela(1);
		} catch (CajonException e) {
			e.printStackTrace();
		}
		
		try {
			miCajon.metela(4);
		} catch (CajonException e) {
			System.out.println("El perro es bonito");
		}
		
		System.out.println(miCajon.mirar());
		
		miCajon.sacala();
		System.out.println(miCajon.mirar());
	}

}
