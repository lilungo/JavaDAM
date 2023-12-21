package EjerciciosCondicionales;



import java.util.Scanner;

public class EjerciciosCondicionales {

	public static void main(String[] args) {
		//ej1();
		//ej2();
		//ej3();
	     //ej4();
		//ej5();
		//ej6();
		//ej7();
		//ej8();
		//ej9();
		ej10();
	}

	public static void ej1() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuál es tu edad??");
		int edad = scanner.nextInt();
		scanner.close();
		int i = 18;

		if (edad < i) {

			System.out.println("eres un menol guarra");
		}

		else {
			System.out.println("eres legal putita");

		}

	}
	
	public static void ej2() {
		
		String Contraseña="1234MmMm";
		Scanner pass = new Scanner(System.in);
		System.out.println("Introduce tu contraseña");
		String contraseña2 = pass.next();
		pass.close();
		if(Contraseña.equalsIgnoreCase(contraseña2)) {
			
			System.out.println("La contraseña es correcta");
			
		}
		else {
			System.out.println("La contraseña es incorrecta");
			
		}
		
	}
	
	public static void ej3() {
		
		 Scanner nums = new Scanner(System.in);
		 System.out.println("Introduce número 1");
		 int num1 = nums.nextInt();
		 System.out.println("Intoduce número 2");
		 int num2 = nums.nextInt();
		 nums.close();
		 
		 
		 if(num2 == 0) {
		 
		 System.err.println("El divisor no puede ser 0");
		 
	}
		 else {
			 System.out.println(num1/num2);
		 }
	}
	
	public static void ej4() {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = num.nextInt();
		num.close();
		
		if(numero%2 == 0) {
			System.out.println("El número es par");
		}
		else {
			
			System.out.println("El número es impar");
		}
		
		
	}
	
	public static void ej5() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = scanner.nextInt();
		System.out.println("Introduce tus ingresos mensuales perro");
		int ingresos = scanner.nextInt();
		scanner.close();
		
		if(edad>16 && ingresos>1000) {
			System.out.println("Tiene que tributar");
		}
		else {
			System.out.println("No tiene que tributar");
		}
		
	}
	
	public static void ej6() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = scanner.nextLine();
		System.out.println("Introduce tu sexo");
		String sexo = scanner.nextLine();
		scanner.close();
		
		
		if((sexo.equalsIgnoreCase("mujer"))&& Character.toString(nombre.charAt(0)).matches("[A-Ma-m]") ) {
			
			System.out.println("Estas en el grupo A");
		}
		
		else if((sexo.equalsIgnoreCase("hombre"))&& Character.toString(nombre.charAt(0)).matches("[N-Zn-z]")){
			System.out.println("Estas en el grupo A");
			
		}
		
		else {
			System.out.println("Estas en el grupo B");
		}
		  
	}
	
	public static void ej7() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu puntuación");
		double score = scanner.nextDouble();
		
		int dinero = 2400;
		
		if (score == 0.0) {
			System.out.println("El nivel es inaceptable");
			System.out.println("Tu bono es: " +dinero);
		} if (score == 0.4) {
			System.out.println("El nivel es aceptable");
			System.out.println("Tu bono es: " +dinero * 1.05);
		} if (score == 0.6) {
			System.out.println("El nivel es meritorio");
			System.out.println("Tu bono es: " +dinero * 1.10);
		} 
		
		scanner.close();
		
		
	}
	
	public static void ej8() {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Dime tu edad");
			int edad = scanner.nextInt();
			
			if (edad < 4) {
				System.out.println("Puedes entrar gratis");
			} if (edad >=4 && edad <=18) {
				System.out.println("Tienes que pagar 5$");
			} else {
				System.out.println("Tienes que pagar 10$");
			} 
			
			scanner.close();
	}
	
	public static void ej9() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quieres pizza vegetariana? Marca 1 si quieres y 2 si no");
		
		int respuesta = scanner.nextInt();
		
		if(respuesta==1) {
			
			System.out.println("Marca 1 si quieres pimiento y 2 si quieres tofu");
			int respuestaVeg = scanner.nextInt();
			
		if (respuestaVeg==1) {
			
			System.out.println("Pizza vegetariana con tomate, mozarella y pimientos");
		} else if (respuestaVeg == 2) {
			
			System.out.println("Pizza vegetariana con tomate, mozarella y tofu");
		}else if (respuesta == 2) {
			System.out.println("Pizza con carne, marca 1 si quieres Salami, 2 jamón y 3 salmón");
			int respuestaCarne = scanner.nextInt();
			
			
			if(respuestaCarne == 1) {
				
				System.out.println("Pizza de carne con tomte, mozarella y salami");
			} else if(respuestaCarne == 2) {
				
				System.out.println("Pizza de carne con tomate, mozarella y jamón");
			} else if (respuestaCarne == 3) {
				
				System.out.println("Pizza de carne con tomate, mozarella y salmón");
			}
				
			
			
			}
		scanner.close();
		
		}
		
		
		
	}
	
	public static void ej10() {
		
	}
	
	
}
