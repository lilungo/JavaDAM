package loteria;

import java.util.Random;

public class LoteriaNavidad {
static int [] gordo = new int[5];
int decimo;
public int getDecimo() {
	return decimo;
}


public void setDecimo(int decimo) {
	this.decimo = decimo;
}


public int[] getGordo() {
	return gordo;
}





public static void main(String[] args) {
	 generarGordo();
	 printGordo();
}

private static void printGordo() {
	for (int i = 0; i < 5; i++) {
		
		System.out.printf("Premio " + (i + 1) + " Âº: %05d \n", gordo[i]);
		
	}
	
	
}

private static void generarGordo() {
	
	Random rand = new Random();
	
	

for(int i = 0; i < gordo.length; i++) {
	int numeroRandom = rand.nextInt(100000);
	gordo [i] = numeroRandom;
}

	
}



}