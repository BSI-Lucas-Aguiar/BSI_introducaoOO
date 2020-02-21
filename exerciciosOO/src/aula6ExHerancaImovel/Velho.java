package aula6ExHerancaImovel;
        
public class Velho extends Imovel{
	
	public Velho(String endereco, float preco) {
		super(endereco, preco);
	}

	//Retorno do valor
	public float imprimePreco() {
		return (float) (super.imprimePreco()*0.9);
	}
}
