package herencias;

public class Herencia {

	
	
	public static void main(String[] args) {
		
		//Esto es de herencias
		Empleado emple1 = new Empleado();
		
		//esto es de polimorfismo
		
		Persona vector [] = new Persona[5];
		
		vector [0] = new Empleado();
		vector [1] = new Consultor();
		vector [2] = new Jefe();
		
		
		Persona perso = new Persona();
		Persona emple = new Empleado();
		
		perso = emple;
		
		
		//es un atributo de empleado
		emple1.getNum_empleado();
		
		//es un atributo de persona
		emple1.getDni();
		
		
	}
	
}
