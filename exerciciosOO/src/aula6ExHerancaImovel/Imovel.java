package aula6ExHerancaImovel;

abstract class Imovel {
	protected String enredeco;
	protected float preco;
	
	public Imovel(String endereco, float preco) {
		this.enredeco=endereco;
		this.preco=preco;
	}
		
	public String getEnredeco() {
		return this.enredeco;
	}
	public void setEnredeco(String enredeco) {
		this.enredeco = enredeco;
	}
	public float getPreco() {
		return this.preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//Retorno do valor
	public float imprimePreco() {
		return this.preco;
	}
	
}
