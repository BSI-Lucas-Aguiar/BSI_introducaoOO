package aula2ExContador;

public class Principal {

	public static void main(String[] args) {
		
		Contador n1;
		n1=new Contador();
		
		n1.setNumero(1);
		System.out.println(n1.getNumero());
		
		n1.incrementa();
		System.out.println(n1.getNumero());
		
		n1.desfaz();
		System.out.println(n1.getNumero());
	}

}
