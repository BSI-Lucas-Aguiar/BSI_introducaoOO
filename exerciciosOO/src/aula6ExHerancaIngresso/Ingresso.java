package aula6ExHerancaIngresso;

abstract class Ingresso {
	protected float valor;

	public Ingresso(float valor) {
		this.valor=valor;
	}
	
	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	//Retorno do valor
	public float imprimeValor() {
		return this.valor;
	}
	
}
