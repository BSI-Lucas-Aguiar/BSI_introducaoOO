package aula4Ex03;

public class Energia {
	private double valorSalarioMinimo;
	private int quantQuilowatts;
	
	public Energia() {
		this.valorSalarioMinimo=998;
	}
	
	public double getValorSalarioMinimo() {
		return valorSalarioMinimo;
	}
	/*public void setValorSalarioMinimo(double valorSalarioMinimo) {
		this.valorSalarioMinimo = valorSalarioMinimo;
	}*/
	public int getQuantQuilowatts() {
		return quantQuilowatts;
	}
	public void setQuantQuilowatts(int quantQuilowatts) {
		this.quantQuilowatts = quantQuilowatts;
	}
	
	
	
	public double calcularValorQuilowatts(){
		double valor=(this.valorSalarioMinimo/7)/100;
		
		return valor;
	}
	
	public double calcularContaResidencia() {
		double valor=this.quantQuilowatts+this.calcularValorQuilowatts();
		
		return valor;
	}
	
	public double descontarContaResidencia() {
		double valor=calcularContaResidencia()*0.9;
		
		return valor;
	}
}
