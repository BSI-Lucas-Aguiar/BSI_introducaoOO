package aula6ExHerancaIngresso;

public class Teste {
	public static void main(String[] args) {
		Ingresso i1 = new Normal(50);
		Ingresso i2 = new VIP(50);
		Ingresso i3 = new CamaroteInferior(50);
		Ingresso i4 = new CamaroteSuperior(50);
	
		System.out.println("Valor Normal: "+i1.imprimeValor());
		System.out.println("Valor VIP: "+i2.imprimeValor());
		System.out.println("Valor Camarote Inferior: "+i3.imprimeValor());
		System.out.println("Valor Camarote Superior: "+i4.imprimeValor());
	
	
	}
}
