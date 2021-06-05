package ar.edu.unlam.pb1.tp4;

public class Temperatura {

//static = constante , final = Estatico , que NO CAMBIA	
	
public final byte CELSIUS=0;
public final byte FARENHEIT=1;
public final byte KELVIN=2;
private double valor;








public Temperatura(double valor) {
	this.valor=valor;
}






// celsius
	public void setValor(double valorNuevo,int  unidad) {
		//this.valor=valorNuevo;
		
		
		final double CELSIUS_A_KELVIN=273.15;
		final double CELSIUS_A_FARENHEIT=((9/5)*valorNuevo)+32;
		
		switch(unidad) {
		case 0:
			this.valor=valorNuevo;
			System.out.println("Celsius: " + this.valor);
			break;
		case 2: 
			this.valor=valorNuevo+CELSIUS_A_KELVIN;
			System.out.println("Celsius a Kelvin: " + this.valor);
			break;
		case 1:
			this.valor=CELSIUS_A_FARENHEIT;
			System.out.println("Celsius a Farenheit: " + this.valor);
			break;
			
		
		}
		
	}


	public double getValor() {
		return valor;
	}











}
