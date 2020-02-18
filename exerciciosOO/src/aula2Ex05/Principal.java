package aula2Ex05;

public class Principal {

	public static void main(String[] args) {
		
		Saldo s1;
		s1=new Saldo();
		
		s1.setSaldo(5000);
		System.out.println("Saldo: "+s1.exibirExtrato());
		s1.sacar(1000);
		System.out.println("Saque 1000, Saldo restante: "+ s1.exibirExtrato());
		s1.depositar(2000);
		System.out.println("Depositar 2000, Saldo restante: "+s1.exibirExtrato());
		
	}

}
