package Ejercicio7;

import java.util.ArrayList;

public class Enemigos {
	private ArrayList<Enemigo> villanos = new ArrayList<>();
	
	@Override
	public String toString() {
		return "Enemigos [villanos=" + villanos + "]";
	}

	public ArrayList<Enemigo> getVillanos() {
		return villanos;
	}

	public void setVillanos(ArrayList<Enemigo> villanos) {
		this.villanos = villanos;
	}

	public void add(Enemigo e) {
		villanos.add(e);
	}
	
	public void addCellJr() {
		Enemigo cellJr = new Enemigo();
		villanos.add(cellJr);
		//villanos.add(new Enemigo());
	}
}