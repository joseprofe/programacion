package Comparators;
import java.util.Comparator;
 
public class ComparadorNombre implements Comparator<Persona> {
 
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre()) == 0 
        		? (p1.getApellido1().compareTo(p2.getApellido1()) == 0 
        				? p1.getApellido2().compareTo(p2.getApellido2())
        				: p1.getApellido1().compareTo(p2.getApellido1()) 
        		   ) 
        		: p1.getNombre().compareTo(p2.getNombre());
    }
 
}