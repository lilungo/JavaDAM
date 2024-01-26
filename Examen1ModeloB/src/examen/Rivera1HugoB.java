package examen;

import java.util.Random;
import java.util.Scanner;


public class Rivera1HugoB {

	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();

	}
	
	public static void ejercicio1() {
		
		double a = 1234;
		double b = 532;
		double c = a / b;
		
		System.out.print("El resultado de la división es " + c );
		
	}
	
	public static void ejercicio2() {
	int v = 5;
	int a = 2;
	int d = 5;
	int t = 10;
	
	double s = d + v + 0.5 * a * Math.pow(t, 2);
	
	System.out.println(" El espacio recorrido S es " + s);
		
	}
	
	public static void ejercicio3() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el número n");
		
		int n = scanner.nextInt(); 
		double suma = 0;
		
		for(int i = 0; i<=n; i++) {
			suma += Math.pow(2, i);
		}
		
		System.out.println("La suma de los primeros " + n + " números es " + suma);
		scanner.close();
	}
	
	public static void ejercicio4() {
		
		int [] nums = new int [20];
		
		int maximo = 50;
		int minimo = 10;
		
		Random random = new Random();
		
	
		for(int i = 0; i < nums.length; i++) {
			int aleatorio = random.nextInt(maximo - minimo + 1) + minimo;
			nums[i] = aleatorio;
			
			
		}
		
		int mayor = nums[0];
		int posicion = 0;
		int suma = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] > mayor ) {
				
				mayor = nums[i];
				posicion = i;
				
			}
			
			suma += nums[i];
		}
		
		double media = suma / 20;
		
		for (int n : nums) {
			
			System.out.println(n + " ");
		}
		System.out.println("El número mayor es " + mayor + " situado en la posicion " + posicion+ " y la media total es " + media);
		
	}
	
	public static void ejercicio5() {
		
		Random random = new Random();
		int numero = random.nextInt(100) + 1;
		
		int intentos = 0;
		int dif;
		
		System.out.println("Intenta adivinar un número del 1 al 100!!");
		
		Scanner scanner = new Scanner(System.in);	
		
		do {
			int numIntro = scanner.nextInt();
			
			dif = Math.abs(numero - numIntro);
			
			intentos++;
		
		if(dif > 40) {
			System.out.println("Te congelas, el número es " + (numIntro < numero ? "mayor" : "menor") );
      

		 } else if (dif > 30) {
	        	System.out.println("Frío frío, el número es " + (numIntro < numero ? "mayor" : "menor") );
			

		
     } else if (dif > 21) {
	System.out.println("Templaditoo, el número es " + (numIntro < numero ? "mayor" : "menor") );



		} else if (dif > 11) {
			System.out.println("Caliente caliente, el número es " + (numIntro < numero ? "mayor" : "menor"));
		
	
	} else {
		System.out.println("Te quemas tu número es " + (numIntro < numero ? "mayor" : "menor"));
	}
		
			
		} while(dif!=0);
		
		System.out.println("Felicidades, adivinaste el numero "+numero+" en "+intentos+ " Enhorabuena!!");
		scanner.close();
	}

}
