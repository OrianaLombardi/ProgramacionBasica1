package ar.edu.unlam.pb1.tp2;

public class Persona {

	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private int edad;
	private double altura;
	private boolean viva=true;
	private boolean mayor=true;
	
	
	
public Persona (String nombre, String genero, long dni, double peso, double altura) {
	this.nombre=nombre;
	this.dni=dni;
	this.genero=genero;
	this.altura=altura;
	this.peso=peso;
	this.edad=0;
}

public void setAlimentar(double kilos) {
	this.peso=this.peso+kilos;
	
}

public void setCrecer(double metros) {
	this.altura=this.altura+metros;
	
}

public void setCumplirAnos() {
	this.edad++;
	
}

public void setMorir() {
	if(this.viva==true) {
		this.viva=false; }
		else {
			this.viva=true;
		}
	}
	
public double setPesar() {
	return this.peso;
	
}

public double setMedir() {
	return this.altura;
}

public int getEdad() {
	return this.edad;
}

public boolean getViva() {
	return this.viva;
}



public void esMayor(int edad) {
	if(edad>=18) {
		this.mayor=true;
	}
	else {
		this.mayor=false;
	}
	
	
}


public String toString() {
	return this.nombre+this.edad;
}





}
