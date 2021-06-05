package ar.edu.unlam.pb1.tp3;

public class Nota {

	private float valor;
	private boolean aprobado=true;
	
	
	
	public Nota(float valorInicial) {
		this.valor=valorInicial;
		
	}
	
	
	public float getValor() {
		
		return valor;
		
	}
	
	public boolean aprobado() {
		if(valor>=7) {
			aprobado=true;
			
		}
		else {
			aprobado=false;
			
		}
		return aprobado;
	}
	
	
	public void setRecuperar(float nuevoValor) {
		this.valor=nuevoValor;
	
	
	}
	
	
	
}
