package ar.edu.unlam.pb1.segundoEjemplo;

public class Automovil {

	private String color;
	private String marca;
	private String patente;

	//final > nos permite declarar constantes
	//static > nos permite definir atributos a nivel clase (no objeto)



	private final static byte CANTIDAD_DE_RUEDAS=4;


	public Automovil(String color, String marca){
		this.marca=marca;
		this.color=color;
		
	}
	
	
	public Automovil() {
		color="";
		marca="";
		patente="";
	}




	//SOBRECARGA DE CONSTRUCTOR O METODOS
	public Automovil(String color, String marca, String patente){
		this.marca=marca;
		this.color=color;
		this.patente=patente;
		
	}



	public  void setColor(String color){
		this.color=color;
	}

	public static byte getCantidadDeRuedas(){
		return CANTIDAD_DE_RUEDAS;
	}

		
	
	
}
