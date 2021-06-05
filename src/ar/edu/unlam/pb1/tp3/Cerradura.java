package ar.edu.unlam.pb1.tp3;

public class Cerradura {

	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean abierta=false;
	private int contador;
	
	
	
	
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura=claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean=cantidadDeFallosConsecutivosQueLaBloquean;
		this.contador=0;
	}
	
	
	public boolean abrir(int clave) {
	if(claveDeApertura==clave) {
		this.abierta=true;
	}
	else {
		this.contador++;
		
	}
		
	return this.abierta;	
	}
	
	
	public void cerrar() {
		if(this.abierta==true) {
			this.abierta=false;
		}
	}
	
	
	public boolean getEstaAbierta() {
		return abierta;
	}
	
	public boolean fueBloqueada() {
		if(this.cantidadDeFallosConsecutivosQueLaBloquean<=this.contador) {
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Cerradura [claveDeApertura=" + claveDeApertura + ", abierta=" + abierta + ", fueBloqueada()="
				+ fueBloqueada() + "]";
	}
	
	
	
	
}
