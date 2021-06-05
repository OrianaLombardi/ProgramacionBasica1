package ar.edu.unlam.pb1.tp2;

public class PruebaCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora casio=new Calculadora();
		
		
		
		//double operador1=16.5;
		//double operador2=18.9;
		
//		System.out.println(casio.Sumar(16.5, 18.9));    //proCTRL+7 COMENTARIO BLOQUE
//		System.out.println(casio.Dividir(12.0, 0.0));
//		System.out.println(casio.Multiplicar(15, 5));
//		System.out.println(casio.Restar(65, 10));
		
		System.out.println(casio.productoria(4));
		System.out.println(casio.productoria(2, 6));
		System.out.println(casio.sumatoria(5));
		System.out.println(casio.contarDivisores(5));
		System.out.println(casio.potencia(2, 3));
		
	}

}
