package RepasoExamen;


import java.util.Scanner;

public class RepasoExamen {

	public static void main(String[] args) {
		
		euros();
		gravitacion();
		
		
	}
	
	
	//Convierta de euros a dolares. El resultado de la conversión
	//se mostrará en la sálida estándar con una precisión de 2 decimales
	
	
	public static void euros() {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca cantidad a convertir");
		
	double euros = scanner.nextDouble();
	
	double conversion = 1.09;
	double dolares = euros * conversion;
	
	System.out.println("Los " + euros + " introducidos equivalen a " + dolares +" dolares." );
	
	
	 scanner.close();
 
	
		
	}
	
	//Emplear la fórmula de la gravitación universal
	
	public static void gravitacion() {
		
	}
	
}

