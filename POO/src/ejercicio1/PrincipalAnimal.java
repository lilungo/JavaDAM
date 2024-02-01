package ejercicio1;

import java.time.LocalDate;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Animal perro = new Animal("León");
		Animal gato = new Animal("Maikol", LocalDate.of(2009, 1, 10));
		
		System.out.println(perro.toString());
		System.out.println(gato.toString());
		

	}

}
