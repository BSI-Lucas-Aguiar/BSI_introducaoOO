package aula1SistemaBancario;

public class Conta {
	String nome;
	String numero;
	double saldo, limite;
	
	public void sacar(double quantidade){
		/*double novoSaldo=this.saldo - quantidade;
		saldo=novoSaldo;*/
		this.saldo=this.saldo-quantidade;
	}
	
	public boolean sacar2(double quantidade){
		if(this.saldo<quantidade){
			return false;
		}
		else{
			this.saldo-=quantidade;
			return true;
		}
	}
	
	public void depositar(double quantidade){
		this.saldo += quantidade;
	}
	
	public void transfere(Conta destino, double valor){
		this.saldo-=valor;
		destino.saldo+=valor;
	}
}
