package ar.edu.unlam.pb1.tp4;

public class Motor {
	
	private int tipoBomba;
	private String tipoFluido;
	private String combustible;
	
	
	
	public Motor () {
		this.tipoBomba=0;
		this.combustible="agua";
		
		
		
	}
	
	
	public void dimeTipoMotor(int tipo) {
		switch(tipo) {
		
		case 0:
			System.out.println("No hay establecido un valor definido para el tipo de bomba");
			break;
			
		case 1:
			System.out.println("La bomba es una bomba de agua");
			break;
			
		case 2:
			System.out.println("La bomba esuna bomba de gasolina");
			break;
			
		case 3:
			System.out.println("La bomba es una bomba de hormigón");
			break;
			
		case 4:
			System.out.println("La bomba es una bomba de pasta alimenticia");
			break;
			
		default:
			System.out.println("No existe un valor válido para tipo de bomba");
			break;
		}
		
	}
	
	
	
	
	

}
