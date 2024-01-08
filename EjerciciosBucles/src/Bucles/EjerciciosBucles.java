package Bucles;


import java.util.Scanner;

public class EjerciciosBucles {
	
	public static void main(String[] args) {
	//bucles();
	//ej1();
	//ejercicio2();
	ejercicio3();	
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
//Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces.
public static void ej1() {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Porfavor introduzca una palabra");
	String palabra = scanner.next();
	scanner.close();
    int i = 1;
    
    while(i <=10) {
    	System.out.println(palabra);
    	i++;
}
    for (int j=1; j <=10 ; j++) {
    	System.out.println(palabra);
    }
    do {
    	System.out.println(palabra);
    	i++;
    	
    }
    while (i<=10);
}

//Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido desde 1 hasta su edad separados por un espacio

private static void ejercicio2() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Dime tu edad");
	int numero = scanner.nextInt();
	scanner.close();
	
	int i = 0;
	
	while (i<=numero) {
		System.out.println(i + " ");
		i++;
		
	}
	
	
}

private static void ejercicio3() {
	
	
	
}


}