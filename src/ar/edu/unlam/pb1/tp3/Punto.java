package ar.edu.unlam.pb1.tp3;

public class Punto {

	
	private int x;
	private int y;
	
	
	
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
		
		
		
		
	}
	
	
	
	public void consultarPunto() {
		if(y==0 && x==0) {
			System.out.println("Las coordenadas estan en el punto de origen");
			
		}
		if(y==0 && x!=0) {
			System.out.println("El punto esta en el eje X");
		}
		
		if(y!=0 && x==0) {
			System.out.println("El punto esta en el eje Y");
			
		}
		
		if(y!=0 && x!=0) {
			System.out.println("Esta en el eje X e Y");
		}
		
	}
	
	
	public void setCambiarX(int x) {
		 this.x=x;
		
	}
	
	public void setCambiarY(int y) {
		this.y=y;
	}
	
	
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
	
	
	
	
	
	
	
}
