package ar.edu.unlam.pb1.tp2;

public class Coche {

	

	private int CERO_KM;
	private int ANO_ACTUAL;
	private static int cantidadCoches;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private double precio;
	
	
	
	
	public Coche(String marca, String modelo, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
		cantidadCoches++;
		
	}
	
	public Coche(String marca, String modelo, int kilometrosActuales, int ANO_ACTUAL,int anioDeFabricacion,double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
		this.kilometrosActuales=kilometrosActuales;
		this.ANO_ACTUAL=ANO_ACTUAL;
		this.anioDeFabricacion=anioDeFabricacion;
		cantidadCoches++;
		
		
		
		
	}
	
	public static int getCantidadCoches() {
		return cantidadCoches;
		
		
	}
	
	public void setKilometrosActuales(int kilometrosActuales) {
		this.kilometrosActuales=kilometrosActuales;
		
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
		
	}
	
	public double getPrecio() {
		return precio;
	}
	
	
	public int calcularAntiguedad() {
		int antiguedad=this.ANO_ACTUAL-this.anioDeFabricacion;
		
		
		
		return antiguedad;
		
	}
	
	public int getKilometros() {
		return kilometrosActuales;
	}
	
	
}
