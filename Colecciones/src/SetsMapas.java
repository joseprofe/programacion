import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class SetsMapas {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(1, "Pollo");
		map.put(2, "Cerdo");
		map.put(3, "Ternera");
		map.put(4, "Ternera");
		
		System.out.println(map.get(4));
		
		map.remove(2);
		map.values().forEach(System.out::println);
		
		System.out.println(map);
		
	}

}
