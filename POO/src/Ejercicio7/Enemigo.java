package Ejercicio7;

public class Enemigo {
	 String nombre;
	 boolean esAndroide;
	 private int vida, velocidad, ki, fuerza, defensa;
	 @Override
	public String toString() {
		return "Enemigo [nombre=" + nombre + ", esAndroide=" + esAndroide + ", vida=" + vida + ", velocidad="
				+ velocidad + ", ki=" + ki + ", fuerza=" + fuerza + ", defensa=" + defensa + "]";
	}

	static final int KI_MAX = 100;
	 
	 public Enemigo(String nombre, boolean esAndroide, int vida, int velocidad, int ki, int fuerza, int defensa) {
		 setNombre(nombre);
		 setEsAndroide(esAndroide);
		 setVida(vida);
		 setVelocidad(velocidad);
		 setKi(ki);
		 setFuerza(fuerza);
		 setDefensa(defensa);
	 }
	 
	 public Enemigo() {
		 setNombre("Cell Jr");
		 setEsAndroide(false);
		 setVida(500);
		 setVelocidad(150);
		 setKi(KI_MAX);
		 setFuerza(150);
		 setDefensa(60);
	 }
	 
	 public void atacar(GuerreroZ guerreroZ) {
		 int daño = getFuerza()*2-guerreroZ.getDefensa();//2 veces al fuerza menos la defensa del enemigo
			//calcular las probailidades de fallar
			if (guerreroZ.getVelocidad()>getVelocidad()) //si el enemigo es m�s r�pido
			{
				if (((int) (Math.random()*4) == 0))
						{
					System.out.println("Jaj�, fallaste!");
						}
				else {
					guerreroZ.setVida(guerreroZ.getVida()-daño);
				}
			}
			else //si el enemigo es m�s lento se come el ataque
			{
				guerreroZ.setVida(guerreroZ.getVida()-daño);
			}
			//restarle la vida al enemigo
		}

	public void ondaKi(GuerreroZ guerreroz) {
		int daño = getFuerza() * 2 - guerreroz.getDefensa();// 4 veces la fuerza menos la defensa del enemigo

		if (getKi() >= 50)
		{
			if (guerreroz.getVelocidad() > getVelocidad()) // si el enemigo es m�s r�pido
			{
				if (((int) (Math.random() * 3) == 0)) {
					System.out.println("Jaj�, fallaste!");
				} else {
					guerreroz.setVida(guerreroz.getVida() - daño);// para actualizar la vida hay que llamar al m�todo que
																// modifica la vida,
					// despu�s llamar al m�todo que contiene la vida actual del enemigo, y a esa
					// vida restarle el da�o producido
				}
				setKi(getKi()-50);
			} else // si el enemigo es m�s lento se come el ataque
			{
				guerreroz.setVida(guerreroz.getVida() - daño); // para actualizar la vida hay que llamar al m�todo que
															// modifica la vida,
				// despu�s llamar al m�todo que contiene la vida actual del enemigo, y a esa
				// vida restarle el da�o producido
				setKi(getKi()-50);
			}
		} else {
			System.out.println("Ay, no me queda energ�a");
		}
	}

	 
	 public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsAndroide() {
		return esAndroide;
	}

	public void setEsAndroide(boolean esAndroide) {
		this.esAndroide = esAndroide;
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

	 
	 
	 
	 public void Transformarse() {
		 if (nombre.equals("Cell"));
	 }
	 
	 public void cargarKi() {
		 setKi(KI_MAX);
	 }
	 
}
