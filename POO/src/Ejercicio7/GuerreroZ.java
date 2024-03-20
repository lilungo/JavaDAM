package Ejercicio7;

public class GuerreroZ {
	private String nombre;
	private boolean esSaiyan;
	private int vida, velocidad, ki, fuerza, defensa;
	static final int KI_MAX = 100;

	public void atacar(Enemigo enemigo) {
		int daño = getFuerza() * 2 - enemigo.getDefensa();// 2 veces al fuerza menos la defensa del enemigo
		// calcular las probailidades de fallar
		if (enemigo.getVelocidad() > getVelocidad()) // si el enemigo es m�s r�pido
		{
			if (((int) (Math.random()*4) == 0)) {
				System.out.println("Jaj�, fallaste!");
			} else {
				enemigo.setVida(enemigo.getVida() - daño);// para actualizar la vida hay que llamar al m�todo que
															// modifica la vida,
				// despu�s llamar al m�todo que contiene la vida actual del enemigo, y a esa
				// vida restarle el da�o producido

			}
		} else // si el enemigo es m�s lento se come el ataque
		{
			enemigo.setVida(enemigo.getVida() - daño); // para actualizar la vida hay que llamar al m�todo que modifica
														// la vida,
			// despu�s llamar al m�todo que contiene la vida actual del enemigo, y a esa
			// vida restarle el da�o producido
		}
		// restarle la vida al enemigo
	}

	public void kamehameHa(Enemigo enemigo) {
		int daño = getFuerza() * 2 - enemigo.getDefensa();// 4 veces la fuerza menos la defensa del enemigo

		if (getKi() >= 50)
		{
			if (enemigo.getVelocidad() > getVelocidad()) // si el enemigo es m�s r�pido
			{
				if (((int) (Math.random() * 3) == 0)) {
					System.out.println("Jaj�, fallaste!");
				} else {
					enemigo.setVida(enemigo.getVida() - daño);// para actualizar la vida hay que llamar al m�todo que
																// modifica la vida,
					// despu�s llamar al m�todo que contiene la vida actual del enemigo, y a esa
					// vida restarle el da�o producido
				}
				setKi(getKi()-50);
			} else // si el enemigo es m�s lento se come el ataque
			{
				enemigo.setVida(enemigo.getVida() - daño); // para actualizar la vida hay que llamar al m�todo que
															// modifica la vida,
				// despu�s llamar al m�todo que contiene la vida actual del enemigo, y a esa
				// vida restarle el da�o producido
				setKi(getKi()-50);
			}
		} else {
			System.out.println("Ay, no me queda energ�a");
		}

	}

	public void trasformarse() {

		if (esSaiyan == true) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHH!!");
		}

	}

	public void cargarKi() {
		setKi(KI_MAX);
	}

	public GuerreroZ(String nombre, boolean esSaiyan, int vida, int velocidad, int ki, int fuerza, int defensa) {

		setNombre(nombre);
		setEsSaiyan(esSaiyan);
		setVida(vida);
		setVelocidad(velocidad);
		setKi(ki);
		setFuerza(fuerza);
		setDefensa(defensa);
	}

	public GuerreroZ(String nombre, int vida, int velocidad, int ki, int fuerza, int defensa) {

		esSaiyan = true;

		setNombre(nombre);
		setVida(vida);
		setVelocidad(velocidad);
		setKi(ki);
		setFuerza(fuerza);
		setDefensa(defensa);

	}

	@Override
	public String toString() {
		return "GuerreroZ [nombre=" + nombre + ", esSaiyan=" + esSaiyan + ", vida=" + vida + ", velocidad=" + velocidad
				+ ", ki=" + ki + ", fuerza=" + fuerza + ", defensa=" + defensa + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsSaiyan() {
		return esSaiyan;
	}

	public void setEsSaiyan(boolean esSaiyan) {
		this.esSaiyan = esSaiyan;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getKi() {
		return ki;
	}

	public void setKi(int ki) {
		this.ki = ki;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public static int getKiMax() {
		return KI_MAX;
	}
}