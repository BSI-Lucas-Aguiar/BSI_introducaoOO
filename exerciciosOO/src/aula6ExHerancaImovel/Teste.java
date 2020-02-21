package aula6ExHerancaImovel;

public class Teste {

	public static void main(String[] args) {
		Imovel i1=new Novo("Rua Sem Nome  - 01", 100000);
		Imovel i2=new Velho("Rua Sem Nome - 02", 100000);
		
		System.out.println(i1.getEnredeco()+" "+i1.imprimePreco());
		System.out.println(i2.getEnredeco()+" "+i2.imprimePreco());
		
	}

}
