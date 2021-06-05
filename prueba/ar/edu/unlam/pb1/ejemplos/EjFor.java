package ar.edu.unlam.pb1.ejemplos;


import java.util.Scanner;

public class EjFor {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		
		double suma=0;
		
		
		
	for (double i = 0; i < 10; i++) {
		System.out.println("iNGRESE UN NUM");
		 double numero= teclado.nextDouble();
		 suma= suma+numero;
		 
		}
	System.out.println("El numero es: " + suma);

	}

}
