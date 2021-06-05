package ar.edu.unlam.pb1.tp2;

public class PruebaUsuario {

	public static void main(String[] args) {
		
		
		Usuario uno= new Usuario("orilom","oriana1234","Oriana","Lombardi",41548291,22);
		
		
		System.out.println(uno.getContrasenia());
		uno.setEdad(20);
		System.out.println(uno.getEdad());
		System.out.println(uno.getUsuario());
		uno.setContrasenia("nueva1234");
		System.out.println(uno.getContrasenia());
	}

}
