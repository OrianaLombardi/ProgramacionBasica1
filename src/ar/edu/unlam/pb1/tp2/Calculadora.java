package ar.edu.unlam.pb1.tp2;

public class Calculadora {

	
	private double operador1;
	private double operador2;
	private double suma;
	private double resta;
	private double multiplicar;
	private double dividir;
	private double resultado=1;
	
	///set para cambiar alguna variable
	//get para conseguir los valores de las variables de la clase;
	//this. hace referencia a las variables de la clase
		
	
	public Calculadora() {
		
	}
	
	
	
	
	public Calculadora(double operador1, double operador2) {
		this.operador1=operador1;
		this.operador2=operador2;
	}
	
	//metodos
	
	
	
	public double Sumar(double operador1, double operador2) {
		suma=operador1+operador2;
		return suma;
		
		
	}
	
	public double getSumar() {
		return suma;
		
		
	}
	
	
	public double Restar(double operador1, double operador2) {
		
		resta=operador1-operador2;
		return resta;
		
	}
	
	public double getRestar() {
		return resta;
	}
	
	public double Multiplicar(double operador1, double operador2) {
		multiplicar=operador1*operador2;
		return multiplicar;
		
	}
	
	public double getMultiplicar() {
		return multiplicar;
	}
	
	public double Dividir(double operador1, double operador2) {
		if(operador2==0) {
			System.out.println("No se puede efectuar la division");}
			else {
				dividir=operador1/operador2;
				
		}
		return dividir;
		
	}
	
	
	public double getDividir() {
		return dividir;
		
	}
	
	public double esPositivo(double numero) {
		if(numero>=0) {
			System.out.println("Es positivo");
		}
		else {
			System.out.println("Es negativo");
		}
		return numero; 
	
	}
	
	public double potencia(double base, double exponente) {
		double resultado=1;
		for (int i = 0; i < exponente; i++) {
			resultado*=base;
		}
		return resultado;
		
		
	}
	
	public int sumatoria(int limite) {
		for (int i = 0; i < limite ; i++) {
			resultado+=i;
		}
		
		return (int) resultado;
		
	}
	
	public int sumatoria(int limiteInferior, int limiteSuperior) {
		if(limiteInferior<limiteSuperior) {
		for (int i = limiteInferior ; i < limiteSuperior; i++) {
			resultado+=i;
			
		}
		}
		return (int)resultado;
	}
	
	
	public int productoria(int limite) {
		int resultado=1;
		for (int i = 1; i <limite; i++) {
			resultado=resultado*i;
		}
		return  resultado;
	}
	
	public int productoria(int limiteInferior, int limiteSuperior) {
		if(limiteInferior<limiteSuperior) {
		for (int i = limiteInferior; i < limiteSuperior; i++) {
			resultado*=i;
		}
		}
		return  (int)resultado;
	}
	
	public int contarDivisores(int numero) {
		for (int i = 1; i <=numero; i++) {
			if(numero%i==0) {
				resultado=i;
			}
		}
		return (int) resultado;
	}




	public double getResultado() {
		return resultado;
	}
	
	

	
	
	
	
}
