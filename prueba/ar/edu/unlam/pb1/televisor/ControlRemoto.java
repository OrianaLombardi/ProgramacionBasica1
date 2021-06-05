package ar.edu.unlam.pb1.televisor;

public class ControlRemoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor hitachi= new Televisor();
		Televisor hitachi2=new Televisor();
		
		
		hitachi.encendidaOApagada();
		System.out.println(hitachi.getEncendida());
		hitachi.seleccionarEntrada('C');
		System.out.println(hitachi.getEntrada());
		
		hitachi.subirVolumen();
		hitachi.subirVolumen();
		
		System.out.println(hitachi.getVolumen());
		hitachi.bajarVolumen();
		System.out.println(hitachi.getVolumen());
		
		
		hitachi.subirCanal();
		System.out.println(hitachi.getCanal());
		hitachi.bajarCanal();
		System.out.println(hitachi.getCanal());
		hitachi.setCanalDeseado(9);
		System.out.println(hitachi.getCanal());
		hitachi.silenciar();
		System.out.println(hitachi.getVolumen());
		System.out.println(hitachi.toString());
		
		
		
		
		System.out.println(hitachi.getCanal());
		
		
	}

}
