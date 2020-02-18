package aula1SistemaBancario;

public class Principal {

	public static void main(String[] args) {
			Conta c1;
			c1 = new Conta();
			
			c1.nome="Lucas";
			c1.numero="123-0";
			c1.saldo=1000;
			c1.limite=10000;
			System.out.println("Primeira Conta");
			System.out.println(c1.nome+" possui a conta de n�mero " + c1.numero + " com saldo " + c1.saldo + " e limite " + c1.limite + ".");
			c1.sacar(500);
			System.out.println("Saque 500:");
			System.out.println(c1.nome+" possui a conta de n�mero " + c1.numero + " com saldo " + c1.saldo + " e limite " + c1.limite + ".");
			
			c1.depositar(2000);
			System.out.println("Depositar 2000:");
			System.out.println(c1.nome+" possui a conta de n�mero " + c1.numero + " com saldo " + c1.saldo + " e limite " + c1.limite + ".");
			
	
			System.out.println("Saque 1000:");
			if(c1.sacar2(1000)==true){
				System.out.println("Saque Efetuado");
			}else{
				System.out.println("Saque Nao Efetuado");
			}
			System.out.println(c1.nome+" possui a conta de numero " + c1.numero + " com saldo " + c1.saldo + " e limite " + c1.limite + ".");
			
			
			Conta c2 = new Conta();
			
			c2.nome="Elias";
			c2.numero="123-1";
			c2.saldo=4000;
			c2.limite=10000;
			System.out.println("\nSegunda Conta:");
			System.out.println(c2.nome+" possui a conta de n�mero " + c2.numero + " com saldo " + c2.saldo + " e limite " + c2.limite + ".");
			
			
			
			/*Teste
			c1.saldo=0;
			c1.depositar(100);
			c2.saldo=c1.saldo;
			c2.depositar(200);
			System.out.println("\nSaldo: "+ c1.saldo);
			System.out.println("\nSaldo: "+ c2.saldo);
			*/
			
			Conta c3 = new Conta();
			
			c3.nome="Mateus";
			c3.numero="123-2";
			c3.saldo=0;
			c3.limite=10000;
			System.out.println("\nTerceira Conta");
			System.out.println(c3.nome+" possui a conta de n�mero " + c3.numero + " com saldo " + c3.saldo + " e limite " + c3.limite + ".");
			
			c1.transfere(c3, 100);
			System.out.println("\nTransfere 100 de Lucas para Mateus");
			System.out.println(c1.nome+" possui a conta de n�mero " + c1.numero + " com saldo " + c1.saldo + " e limite " + c1.limite + ".");
			System.out.println(c3.nome+" possui a conta de n�mero " + c3.numero + " com saldo " + c3.saldo + " e limite " + c3.limite + ".");

			
			
			
	}

}
