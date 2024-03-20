package ejercicio9;

import java.util.ArrayList;

public class Entrenador {

String nombre;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;  
}
public int getInsignias() {
	return insignias;
}
public void setInsignias(int insignias) {
	this.insignias = insignias;
}
public ArrayList<Pokemon> getPokemons() {
	return pokemons;
}
public void setPokemons(ArrayList<Pokemon> pokemons) {
	this.pokemons = pokemons;
}
int insignias = 0;
ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

}

 