package herencias;

public class Persona {

	int id;
	String dni;
	String nombre;
	String apellido;
	String domicilio;
	String telefono;
	
	
	
	public Persona() {
	}



	public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDomicilio() {
		return domicilio;
	}



	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
	
	
}
