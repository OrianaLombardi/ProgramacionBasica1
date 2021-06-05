package ar.edu.unlam.pb1.tp2;

public class EjemploDeVida {

	public static void main(String[] args) {
		
		
	Persona sofia= new Persona("Sofia", "Mujer", 38432153,2.8 , 0.50); 
	
	
	System.out.println("El peso de Sofia es: " + sofia.setPesar() + " y su altura es: " + sofia.setMedir());
	
	
	sofia.setAlimentar(1.0);
	sofia.setCrecer(0.5);
	sofia.setCumplirAnos();sofia.setCumplirAnos();sofia.setCumplirAnos();
	sofia.setCumplirAnos();sofia.setCumplirAnos();sofia.setCumplirAnos();
	
	//sofia.setMorir();
	System.out.println("El peso de Sofia es: " + sofia.setPesar() + " y su altura es: " + sofia.setMedir() + " y su edad es: "  + sofia.getEdad() );
	System.out.println(sofia.getViva());
	sofia.esMayor(18);
	
	sofia.toString();
	
	

	}

}
