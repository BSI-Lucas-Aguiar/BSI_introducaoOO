package aula6ExHerancaImovel;

public class Novo extends Imovel{
	
	public Novo(String endereco, float preco) {
		super(endereco, preco);
	}

	//Retorno do valor
	public float imprimePreco() {
		return (float) (super.imprimePreco()*1.1);
	}
}
