
public class Divididor<T extends Number> {
	private T number;

	public Divididor(T n) {
		this.number = n;
	}
	
	public Number mitad() {
		return number.doubleValue()/2;
	}
	
}
