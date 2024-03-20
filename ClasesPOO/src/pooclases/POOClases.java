package pooclases;

import java.util.Set;

public class POOClases {
	
	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno(12, "Hugo", "Rivera");
		
		
		System.out.println("La id del alu2 es: " + alu2.getId());
		System.out.println("El nombre del alu2 es: " + alu2.getNombre());
		System.out.println("El apellido del alu2 es: " + alu2.getApellido()); 
		
		alu1.setId(23);
		alu1.setNombre("Moises");
		alu1.setApellido("Alvarez");
		
		System.out.println("--------------");
		System.out.println("La id del alu1 es: " + alu1.getId());
		System.out.println("El nombre del alu1 es: " + alu1.getNombre());
		System.out.println("El apellido del alu1 es: " + alu1.getApellido());
		
	}

}
