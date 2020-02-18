package aula2Ex05;

public class Saldo {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo+=valor;
		
	}
	
	public void sacar(double valor) {
		this.saldo-=valor;
		
	}
	
	public double exibirExtrato() {
		
		return this.saldo;
	}
}
