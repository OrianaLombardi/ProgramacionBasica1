package ar.edu.unlam.pb1.tp2;

public class PruebaCoche {

	public static void main(String[] args) {
		
		
		
		Coche fiat=new Coche("Fiat","147",90000,2021,1998,25.000);
		System.out.println(fiat.calcularAntiguedad());
		System.out.println(fiat.getCantidadCoches());
		
		
		
		Coche bmw=new Coche("bmw","i8",1.280000);
		System.out.println(bmw.getCantidadCoches());
		bmw.setPrecio(90000.00000);
		System.out.println(bmw.getPrecio());
		
		
	}

}
