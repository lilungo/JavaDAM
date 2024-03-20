package Ejercicio7;

import java.util.ArrayList;

public class GuerrerosZ {

	private ArrayList<GuerreroZ> personajes = new ArrayList<>();
	
	@Override
	public String toString() {
		return "GuerrerosZ [personajes=" + personajes + "]";
	}
	public ArrayList<GuerreroZ> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(ArrayList<GuerreroZ> personajes) {
		this.personajes = personajes;
	}

	public void add(GuerreroZ guerreroz) {
		personajes.add(guerreroz);
	}
	
	public void addSaiyan(GuerreroZ guerreroz) {
		personajes.add(guerreroz);
	}
	
	public GuerreroZ get(int i) {
		return personajes.get(i);
	}
}