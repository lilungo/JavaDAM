package Ejercicio7;


public class JuegosDeCell {
	static GuerrerosZ heroes = new GuerrerosZ();
	static Enemigos villanos = new Enemigos();

	public static void main(String[] args) {

		GuerreroZ krilin = new GuerreroZ("Krilin", false, 150, 300, 80, 45, 0);
		GuerreroZ goku = new GuerreroZ("Goku", 700, 500, 300, 200, 80);

		heroes.add(krilin);
		heroes.addSaiyan(goku);

		villanos.addCellJr();
		villanos.add(new Enemigo("Celula", false, 700, 300, 300, 200, 100));

		System.out.println(heroes.toString());
		System.out.println(villanos.toString());
		combate();
		System.out.println(heroes.toString());
		System.out.println(villanos.toString());
	}

	private static void combate() {
		// mientras el arraylist personajes, de la clase GuerrerosZ, no esté vacío (y lo
		// mismo para el de Enemigos)
		while (!heroes.getPersonajes().isEmpty() && !villanos.getVillanos().isEmpty()) {
			// si el héroe es más rápido que el villano
			if (heroes.getPersonajes().get(0).getVelocidad() > villanos.getVillanos().get(0).getVelocidad()) {
				// modificamos aquí
				if ((int) (Math.random() * 2) == 0)
					heroes.getPersonajes().get(0).atacar(villanos.getVillanos().get(0)); // el heroe ataca al villano
				else {
					heroes.getPersonajes().get(0).kamehameHa(villanos.getVillanos().get(0)); // el heroe hace kamehameHa
					System.out.println("KA ME HA ME HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
				}
				if (villanos.getVillanos().get(0).getVida() >= 0) // si el villano sigue vivo
				{
					if ((int) (Math.random() * 2) == 0)
						villanos.getVillanos().get(0).atacar(heroes.getPersonajes().get(0));// el villano contrataca
					else {
						villanos.getVillanos().get(0).ondaKi(heroes.getPersonajes().get(0));// el villano contrataca
						System.out.println("MUEEEREEEEEEEEEE");
					}
				}
			}

			else // si el villano es igual de rápido o más
			{
				if ((int) (Math.random() * 2) == 0)
					villanos.getVillanos().get(0).atacar(heroes.getPersonajes().get(0));// el villano contrataca
				else {
					villanos.getVillanos().get(0).ondaKi(heroes.getPersonajes().get(0));// el villano contrataca
					System.out.println("MUEEEREEEEEEEEEE");
				}
				if (heroes.getPersonajes().get(0).getVida() >= 0) {
					if ((int) (Math.random() * 2) == 0)
						heroes.getPersonajes().get(0).atacar(villanos.getVillanos().get(0)); // el heroe ataca al
																								// villano
					else {
						heroes.getPersonajes().get(0).kamehameHa(villanos.getVillanos().get(0)); // el heroe hace
																									// kamehameHa
						System.out.println("KA ME HA ME HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
					}
				}
			}
			if (villanos.getVillanos().get(0).getVida() <= 0) {
				villanos.getVillanos().remove(0);
				System.out.println("Villano murió");
			}

//			for( Enemigo e: villanos.getVillanos())
//			{
//				if (e.getVida()<=0)
//				{
//					villanos.getVillanos().remove(e);
//				}
//			}

			if (heroes.getPersonajes().get(0).getVida() <= 0) {
				heroes.getPersonajes().remove(0);
				System.out.println("Heroe murió");
			}
		}

	}

}