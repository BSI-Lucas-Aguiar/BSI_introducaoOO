package aula2Ex01;

public class Principal {

	public static void main(String[] args) {
		
		Numero numero1;
		numero1=new Numero();
		
		numero1.setN1(5);
		numero1.setN2(6);
		System.out.println("Antes da troca:");
		System.out.println(numero1.getN1());
		System.out.println(numero1.getN2());
		
		numero1.troca();
		
		System.out.println("Depois da troca:");
		System.out.println(numero1.getN1());
		System.out.println(numero1.getN2());

	}

}
