package MockExam;



public class MockExam {

	public static void main(String[] args) {
		long n = ejercicio1();
        boolean b = megustaelnumero(n); 
        System.out.println(b);
		
		
		
	}
	
	private static boolean megustaelnumero(long n) {
		long copiaDeN = n;
		boolean meGusta = false;
		long sumaImpar = 0;
		long sumaRestoDeDigitos = 0;
		
		while (n > 10) {
			long ultimoDigito = n % 10;
			if (ultimoDigito % 2 == 0) {
				sumaRestoDeDigitos += ultimoDigito;
			}
			
			else {
				sumaImpar += ultimoDigito;
			}
			n = n / 10;
			//System.out.println(n);
		}
		if(sumaImpar > sumaRestoDeDigitos) {
			meGusta = true;
			return meGusta;
		}
		else if (copiaDeN%2 == 1 && (sumaImpar + sumaRestoDeDigitos) %2 == 1) {
			meGusta = true;
			return meGusta;
			
		}
		else {
			return meGusta;
		}
		
	}
	

	public static long ejercicio1() {
		
		long min = 1000;
		long max = 100000;
		long numeroAleatorio = (long) (Math.random() * (max - min) + min);
		System.out.println(numeroAleatorio);
		return numeroAleatorio;
		
	}

}
