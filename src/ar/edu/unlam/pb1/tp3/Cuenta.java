package ar.edu.unlam.pb1.tp3;

public class Cuenta {
	
	
	private String titular;
	private double saldo;
	
	
	
	public Cuenta(String titular) {
		this.titular=titular;
		
	}
	
	public Cuenta(String titular, double saldoInicial) {
		this.saldo=saldoInicial;
	}
	
	
	
	
	public String getTitular() {
		return titular;
	}
	
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Saldo: " +this.saldo+ ", Titular: " + this.titular;
	}
	
	public void depositar(double cantidad) {
		this.saldo=this.saldo+cantidad;
	}
	
	
	public void retirar(double cantidad) {
		this.saldo=this.saldo-cantidad;
	}
	
	
	
	
	
	
	
	

}
