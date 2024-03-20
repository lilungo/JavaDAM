package pooclases;

public class Alumno {
	
	int id;
	String nombre;
	String apellido;
	
	
	//metodo
	
	public Alumno() {
		
	}
	
	

	public Alumno(int id, String nombre, String apellido) {
	
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}



	
	//getters y setters, get es traer y set es colocar o setear
	//con get obtenemos datos para x funcion y con set colocamos valores a los atributos 
	//(modificar valores o dar a objetos vacios)
	
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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

	
	
	
	
	


	public void mostrarNombre() {
		System.out.println("Hola soy un alumno y se decir mi nombre:");
		
	}
	
	public void saberAprobado(double calificacion) {
		
		if (calificacion >=5 ) {
			System.out.println("aprobé la asignatura");
		}
		
		else {
			System.out.println("no aprobé");
		}
		
	}
	
}
