package ar.edu.unlam.pb1.televisor;

public class Televisor {

	
	private final char ENTRADA_TELEVISION_DE_AIRE='A';
	private final char ENTRADA_TELEVISION_POR_CABLE='C';
	private final char ENTRADA_HDMI1='1';
	private final char ENTRADA_HDMI2='2';
	private final char ENTRADA_USB='U';
	private boolean ENCENDIDA=false;
	private char entradaActual; 
	private long plaqueta;
	private final int maxVolumen=100;
	private final int minVolumen=0;
	private int volumen=1;
	private int canal=1;
	private final int canalMaxAire=127;
	private final int canalMaxCable=32767;
	private final int canalMax=9;
	private final int canalMin=0;
	private int canalAire=0;
	private int canalCable=0;
	
	
	
	
	public Televisor() {
		
		
		
	}
	
	
	public String toString() {
		return "Televisor [ENCENDIDA=" + ENCENDIDA + ", entradaActual=" + entradaActual + ", volumen=" + volumen
				+ ", canal=" + canal + "]";
	}



	public void encendidaOApagada() {
		if(this.ENCENDIDA==false) {
			this.ENCENDIDA=true;
		}
		else {
			this.ENCENDIDA=false;
		}
		
	}
	
	
	public void seleccionarEntrada(char entradaDeseada) {
		if(this.ENCENDIDA==true) {
			if(entradaDeseada==this.ENTRADA_HDMI1|| entradaDeseada==this.ENTRADA_HDMI2||entradaDeseada==this.ENTRADA_TELEVISION_DE_AIRE|| 	
			entradaDeseada==this.ENTRADA_TELEVISION_POR_CABLE||entradaDeseada==this.ENTRADA_USB) {
			this.entradaActual=entradaDeseada;}
			
				}
		
		
		
		}
	
	
	
	public void subirVolumen() {
		if(this.ENCENDIDA==true) {
			if(this.volumen<this.maxVolumen ) {
				volumen++;
				
			}
			
		}
	}
	
	public void bajarVolumen() {
		if(this.ENCENDIDA==true) {
			if(this.volumen>this.minVolumen) {
				volumen--;
				
			}
		}
		
		
		
	}
	
	
	public void  subirCanal() {
		if(this.ENCENDIDA==true) {
			if(this.entradaActual==this.ENTRADA_TELEVISION_DE_AIRE) {
				if(this.canal>this.canalMin && this.canal<this.canalMaxAire) {
					canalAire++;
					}
				
			}
			else { 
				if(this.canal>this.canalMin && this.canal<this.canalMaxCable) {
					canalCable++;
				}
			}
			
		}
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	public void  bajarCanal() {
		if(this.ENCENDIDA==true) {
			if(this.entradaActual==this.ENTRADA_TELEVISION_DE_AIRE) {
				if(this.canal>this.canalMin && this.canal<this.canalMaxAire) {
					canalAire--;
					}
				
			}
			else { 
				if(this.canal>this.canalMin && this.canal<this.canalMaxCable) {
					canalCable--;
				}
			}
			
		}
	}
	
		
	
	public void setCanalDeseado(int canalDeseado) {
		this.canal=canalDeseado;
		
	}
	
	
	
	public void cambiarCanal(int primerDigito, int segundoDigito, int tercerDigito, int cuartoDigito) {
		if(this.ENCENDIDA==true) {
			
		}
		
	}
	
	
	public void silenciar() {
		if(this.ENCENDIDA==true) {
			if(this.volumen!=0) {
				volumen=0;
			}
			
		}
	}
	
	
	public void subirOBajarAnaliticamente(char operacion) {
		switch(operacion) {
		
		case '+':
			subirVolumen();
			break;
		case '-':
			bajarVolumen();
			break;
		case '>':
			subirCanal();
			break;
		case '<':
			bajarCanal();
			break;
		
		default:
			System.out.println("Opcion incorrecta ");
			break;
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ------------------------------------------------------------------------------
	
	
	public int getVolumen() {
		return volumen;
		
	}
	
	
	
			
	
	public boolean getEncendida() {
		return ENCENDIDA;
		
	}
	
	public char getEntrada() {
		return entradaActual;
		
	}
	
	public long getPlaquetas() {
		return plaqueta;
	}
	
	
	public int getCanal() {
		return canal;
	}
	
	
	
	
	
	
	
		}
	
	
	
	
	
	

