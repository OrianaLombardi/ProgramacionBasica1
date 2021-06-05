package ar.edu.unlam.pb1.tp3;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto brasil=new Punto(2,4);
		
		brasil.consultarPunto();
		
		brasil.setCambiarX(52);
		brasil.setCambiarY(0);
		
		brasil.consultarPunto();
		
		
	}

}
