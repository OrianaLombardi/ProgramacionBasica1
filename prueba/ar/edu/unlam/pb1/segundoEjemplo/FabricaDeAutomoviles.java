package ar.edu.unlam.pb1.segundoEjemplo;

public class FabricaDeAutomoviles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Automovil ferrari= new Automovil("Rojo", "ferrari");
		Automovil fitito= new Automovil("Blanco", "Fiat", "AE698DD");
		
		//Automovil.setCantidadDeRuedas((byte)4);
		
		System.out.println("La cantidad de ruedas del fitito es: " + fitito.getCantidadDeRuedas() );
		
		System.out.println("La cantidad de ruedas del ferrari es: " + ferrari.getCantidadDeRuedas() );
	

	}

}
