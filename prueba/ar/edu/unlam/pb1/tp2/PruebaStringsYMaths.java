package ar.edu.unlam.pb1.tp2;

public class PruebaStringsYMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String cadena=("  java es case sensitive   ");
		int caracter=9;
		
		
		
		
		System.out.println("La letra de la posicion " +caracter+ " es: " + cadena.charAt(caracter)); //dice el caracter del numero de la posicion
		System.out.println("La cadena en mayus es: " +cadena.toUpperCase()); //la minus la convierte en mayus
		System.out.println("La cadena en minuscula es: " +cadena.toLowerCase()); //la mayuscula la convierte en minus
		System.out.println("La cadena sin espacios es: " + cadena.trim());  //le saca los espacios antes o despues en  la cadena 
		System.out.println("La cantidad de letras es: " +cadena.length()); //cuenta la cantidad de letras
		System.out.println("El numero  50   elevado al cuadrado es:  "  + Math.pow(50, 2));   //eleva el segundo numero al primero es decir 50 al cuadrado
		System.out.println("El numero random es: " + Math.random());  //numeros aleatorios entre 0.0 y 1.0 excluyendo este ultimo 
		System.out.println("La raiz cuadrada de 16 es : " + Math.sqrt(16));
		System.out.println("El numero pi es: " + Math.PI);
		
		
	}

}
