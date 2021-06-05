package ar.edu.unlam.pb1.tp3;

public class PruebaCuenta {

	public static void main(String[] args) {
	
		
		Cuenta icbc= new Cuenta("Ivan de Pineda" , 0);
		
		
		
		icbc.depositar(500);
		System.out.println(icbc.getSaldo());
		icbc.retirar(400);
		System.out.println(icbc.getSaldo());
		
		
		
		
		
	}

}
