package ejercicio2;

public class Hucha {

	boolean estaAbierta = true;

	String contraseña = "contraseña";
	
	// int uno = 0;
	//int dos = 0;
	//int cinco = 0;
	//int diez = 0;
	//int veinte = 0;
	//int cincuenta = 0;
	//int uno,dos,cinco,diez,veinte,cincuenta = 0;
	//el valor dentro de los indices sera el numero de cada moneda
	int [] monedas = new int [2];
	int [] billetes = new int[4];
	
	public Hucha() {
		
		monedas[0] = 2;
		monedas[1] = 6;
		billetes[0] = 3;
		
		
	}
	
	public void dineroEnLaHucha() {
		System.out.println("Tengo " + getMonedas()[0] + " monedas de 1€");
		System.out.println("Tengo " + getMonedas()[1] + " monedas de 2€");
		System.out.println("Tengo " + getBilletes()[0] + " billetes de 10€");
		System.out.println("Tengo " + getBilletes()[1] + " billetes de 20€");
		System.out.println("Tengo " + getBilletes()[2] + " billetes de 20€");
		System.out.println("Tengo " + getBilletes()[3] + " billetes de 50€");
		System.out.println("Tengo " + dineroTotal() + " € en la hucha");
	}
	
	public void cambiarContraseña (String contraseñaActual, String contraseñaNueva) {
		if (getContraseña() == contraseñaActual) 
			this.contraseña = contraseñaNueva;
		else 
			System.out.println("Contraseña incorrecta, no se pudo reestablecer la contraseña");
		}
	
	public void abrirHucha(String contraseña) {
		if (isEstaAbierta()==true)
			System.out.println("Ya esta abierta pringao");
		else if (contraseña.equals(getContraseña())) {
			setEstaAbierta(true);
		}
		else 
			System.out.println("Contraseña incorrecta");
		}
			
	public void cerrarHucha(String contraseña) {
		if (isEstaAbierta()==false)
			System.out.println("Ya esta cerrada pringao");
		else if (contraseña.equals(getContraseña())) {
			setEstaAbierta(false);
		}
		else 
			System.out.println("Contraseña incorrecta");
		}
			
	
	
		

	

private int dineroTotal() {
	int total = getMonedas()[0]*1 + getMonedas()[1]*2 + getMonedas()[0] * 5 +
			getBilletes()[1] * 10 + getBilletes()[2] * 20 + getBilletes()[3]*50;
return total;
}

public boolean isEstaAbierta() {
	return estaAbierta;
}

public void setEstaAbierta(boolean estaAbierta) {
	this.estaAbierta = estaAbierta;
}

public String getContraseña() {
	return contraseña;
}

public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

public int[] getMonedas() {
	return monedas;
}

public void setMonedas(int[] monedas) {
	this.monedas = monedas;
}

public int[] getBilletes() {
	return billetes;
}

public void setBilletes(int[] billetes) {
	this.billetes = billetes;
}
}