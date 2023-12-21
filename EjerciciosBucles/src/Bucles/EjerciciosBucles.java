package Bucles;

import java.util.Scanner;

public class EjerciciosBucles {
	
	public static void main(String[] args) {
	//bucles();
	ej1();
	}



public static void bucles() {
	
	int  condicion = 10;
	for (int i = 0; i<= condicion; i++) {
		System.out.println("Bucle for");
		
	}
	
	int parada = 0;
	for(int i = 10; i >= parada; i--) {
		System.out.println("Bucle for inverso");
		
	}
	
	int i = 0; {
		
		
	}
	while (i < condicion) {
		
		System.out.println("Bucle while");
		i++;
	}
	
}

public static void ej1() {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Porfavor introduzca una palabra");
	String palabra = scanner.next();
	scanner.close();
for(int i = 0; i < 10; i++) {
System.out.println(palabra);
	
}
}


}