package Comparators;
public class Persona implements Comparable<Persona>{
 
    private String nombre;
    private String apellido1;
    private String apellido2;
     
     
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public Persona(String nombre, String apellido1, String apellido2) {
        super();
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
    }
    

	@Override
	public int compareTo(Persona o) {
		return this.getNombre().compareTo((o).getNombre()) == 0 
        		? (this.getApellido1().compareTo((o).getApellido1()) == 0 
        				? this.getApellido2().compareTo((o).getApellido2())
        				: this.getApellido1().compareTo((o).getApellido1()) 
        		   ) 
        		: this.getNombre().compareTo((o).getNombre());
	}
     
     
}