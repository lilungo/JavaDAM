package Bucles;


import java.text.DecimalFormat;
import java.util.Scanner;

public class EjerciciosBucles {
	
	public static void main(String[] args) {
	//bucles();
	//ej1();
	//ejercicio2();
	//ejercicio3();
	//ej4();
	//ej5();
	//ej6();
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
//Escribir un programa que pida al usuario una pala  bra y la muestre por pantalla 10 veces.
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

public static void ejercicio2() {
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

//3- Escribir un programa que pida al usuario un número entero positivo y
	//muestre por pantalla todos los números impares desde 1 hasta ese
	//número separados por comas.
public static void ejercicio3() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Dime un número entero");
	int number = scanner.nextInt();
	
	if (number%1 == 0 && number > 0) {
		
	for (int i = 1; i <=number; i+=2) {
		System.out.print(i + ",");
	}
		
	} else {
		System.out.println(number + " no es entero o positivo o es 0");
	}
	
	scanner.close();
	
}


//4- Escribir un programa que pida al usuario un número entero y muestre por
//pantalla si es par o impar.

public static void ej4() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Dime un número entero");
	int number = scanner.nextInt();
	
	if (number%1 == 0) {
		if (number%2 == 0) {
			System.out.println(number+ " es par");
		}else {
			System.out.println(number + " es impar");
		}
	} else {
		System.out.println("Dame un entero");
	}
	
	scanner.close();
}

//5- Escribir un programa que pregunte al usuario una cantidad a invertir, el
//interés anual y el número de años, y muestre por pantalla el capital
//obtenido en la inversión cada año que dura la inversión.
//En plan:
//Inversión inicial: XXXX,XX€
//Año 1: YYYY,YY
//Año 2: ZZZZ,ZZ …

public static void ej5() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Cantidad a invertir");
	double inversion = scanner.nextDouble();
	
	System.out.println("Dime el interes anual en %");
	double interesAnual = scanner.nextDouble();
	
	System.out.println("Dime el número de años");
	int años = scanner.nextInt();
	
	double capital;
    for (int i = 1; i <= años; ++i) {
    	//igualo el capital a la fórmula del interes compuesto
        capital = inversion * (1 + interesAnual / 100);
        
        //hago que inversión sea igual al capital anterior para emplearlo en la siguiente
        inversion = capital;

        DecimalFormat formato = new DecimalFormat("0.00");
        String total = formato.format(capital);
        
        // Mostrar por pantalla el capital obtenido en cada año
        System.out.println("Año " +i+ ": " +total);
    }
	
    scanner.close();
}

//6- Escribir un programa que pida al usuario un número entero y muestre por
//pantalla un triángulo rectángulo como el de más abajo, de altura el
//número introducido.
//*
//**
//***
//****
//*****

public static void ej6() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Dime un número");
	int number = scanner.nextInt();
	
	//que el número sea positivo y entero
	if (number>=0 && number%number == 0) {
		
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}else {
		System.out.println("Escribe un número entero");
	}
	
	scanner.close();
}
}