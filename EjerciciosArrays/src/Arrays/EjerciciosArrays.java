package Arrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosArrays {
	


public static void main(String[] args) {
	
	//ejercicio1();
	//ejercicio2();
	//ejercicio3();
	
	//int numerosGanadores[] = {12365, 45678, 95956};
	//ejercicio4(numerosGanadores[0], numerosGanadores[1], numerosGanadores[2]);
	//ejercicio5();
	//ejercicio6();
	ejercicio7();
}

//1- Escribir un programa que almacene las asignaturas de un curso (por
	//ejemplo: Matemáticas, Física, Química, Historia y Lengua) en un array y la
	//muestre por pantalla. Las asignaturas deberán introducirse por consola en
	//una misma línea, separadas por espacios.


private static void ejercicio1() {
	
	String asignaturas [] = {"Física", "Química", "Historia", "Matemáticas", "Lengua"};
	
	for (int i=0; i<asignaturas.length; i++) {
		System.out.println(asignaturas[i] + " ");
	}
}


//2- Copia y pega el ejercicio anterior y haz los cambios pertinentes para que
	//imprima por pantalla “Yo estudio asignatura;, donde ;asignatura; es
	//cada una de las asignaturas almacenadas en el array.

private static void ejercicio2() {
	
String asignaturas [] = {"Física", "Química", "Historia", "Matemáticas", "Lengua"};
	
	for (int i=0; i<asignaturas.length; i++) {
		System.out.println("yo estudio " + asignaturas[i]);
	}
}


//3-Modifica el programa anterior para que te pregunte “¿Qué nota sacaste
	//en &lt;asignatura&gt;?, el usuario introduzca la nota, y finalmente imprima por
	//pantalla: “Sacaste un &lt;nota&gt; en &lt;asignatura&gt;”.


private static void ejercicio3() {
	
String asignaturas [] = {"Física", "Química", "Historia", "Matemáticas", "Lengua"};
	
Scanner scanner = new Scanner(System.in);

	for (int i=0; i<asignaturas.length; i++) {
		
		System.out.println("Que nota sacaste en " + asignaturas[i]);
		int nota = scanner.nextInt();
		
		System.out.println("Has sacado un  " + nota + " en " + asignaturas[i]);
		
		
	}
	scanner.close();
}

//4- Escribir un programa en el que se le pase en la llamada al método los 3
	//números ganadores de la lotería, los almacene en un array, y los muestre
	//por pantalla ordenados de menor a mayor. (Hay que usar una clase de
	//java.util)


private static void ejercicio4(int x, int y, int z) {
	
	int [] ganadores = new int[3];
	
	ganadores [0] = x;
	ganadores [1] = y;
	ganadores [2] = z;
	
	Arrays.sort(ganadores);
	
	//Esto imprime todo el array directamente
			System.out.println("Números ganadores ordenados de menor a mayor: " + Arrays.toString(ganadores));
	
}


//5 - Escribir un programa que cree e inicialice un array con los números del 1 al
	//10 y los muestre por pantalla en orden inverso separados por comas. (Hay
	//que usar dos clases de java.util)


private static void ejercicio5() {
	
	Integer numeros [] = new Integer [10];
	
	for(int i = 0; i < numeros.length; i++) {
		numeros[i] = i+1;
	}
	
	//Utilizo el método Collections.reverseOrder para imprimorlos al revés
Arrays.sort(numeros, Collections.reverseOrder());

System.out.println(Arrays.toString(numeros));
}


//6- Escribe un programa que en el que cree un array bidimensional cuyo
	//número de filas y columnas se le pase al método en la llamada. El método
	//rellenará el array con números aleatorios (del 0 a 9). Finalmente, debe
	//imprimir la tabla tal que así
	//0123
	//1234
	//2345


private static void ejercicio6() {
	
	Scanner scanner = new Scanner(System.in);
	
System.out.println("Dime un número de filas");
  int filas = scanner.nextInt();
  
  System.out.println("Dime el número de columnas");
  
  int columnas = scanner.nextInt();
	
  int [][] aleatorios = new int [filas] [columnas];
  
  for(int i = 0; i < filas; i++) {
	  for(int j = 0; j < columnas; j++) {
		  Random random = new Random();
		  int numAleatorio = random.nextInt(10);
		  
		  System.out.print(aleatorios [i] [j] = numAleatorio);
		  
	  }
	  System.out.println();
	  
  }
  scanner.close();
}

//7- Usando un array bidimensional, escribir un programa que almacena las
	//asignaturas de un curso en el array, y luego pregunte al usuario por su
	//nota y, finalmente, el programa muestre por pantalla solo las asignaturas
	//que el usuario deba repetir.

private static void ejercicio7() {
Scanner scanner = new Scanner(System.in);

int acc = 0;

String[][] asignatura = {
        {"Matemáticas", "Historia", "Programación"},
        {"Física", "Literatura", "Inglés"},
        {"Química", "Economía", "Biología"}
    };

String [] repetir = new String [asignatura.length];

for (int i = 0; i < asignatura.length; i++) {
	for (int j = 0; j < asignatura[i].length; j++) {
		System.out.println("Dime tu nota en " +asignatura[i][j]);
		int nota = scanner.nextInt();
		
		if (nota<5) {
			repetir[acc] = asignatura[i][j];
			acc++;
		}
	}
}

for (int i = 0; i < repetir.length; i++) {
	if (repetir[i] != null) {
		System.out.println("Debes repetir " +repetir[i]);
	}
}
scanner.close();
}
}