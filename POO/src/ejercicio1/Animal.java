package ejercicio1;

import java.time.LocalDate;

public class Animal {
	
	String nombre;

	LocalDate fecha;

	public Animal(String mote, LocalDate hoy) {
		
		setNombre(mote);
		setFecha(hoy);
		
	}
	
	public Animal(String mote) {
		setNombre(mote);
		LocalDate hoy = LocalDate.now();
		setFecha(hoy);
		
	}
	
	public String toString() {
		return "Nombre : " + getNombre() + " - Fecha Nacimiento : " + getFecha();
	}


	
	
	
	
	
	
	
	
	
	
	

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public LocalDate getFecha() {
	return fecha;
}

public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
}