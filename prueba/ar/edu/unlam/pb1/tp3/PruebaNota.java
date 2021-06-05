package ar.edu.unlam.pb1.tp3;

public class PruebaNota {

	public static void main(String[] args) {
		
		Nota ori=new Nota(7.0F);
		Nota juli=new Nota(2.0F);
		
		
		System.out.println(ori.aprobado());
		System.out.println(juli.aprobado());
		juli.setRecuperar(10.0F);
		System.out.println(juli.aprobado());
		
		
		
		
	}

}
