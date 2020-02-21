package aula6ExHerancaIngresso;

public class Normal extends Ingresso {
	
	
	public Normal(float valor) {
		super(valor);
	}
	
	//Retorno do valor
	public float valorNormal() {
		return this.valor;
	}
	
	//Retorno do valor
	public float imprimeValor(){
		return super.imprimeValor();
	}
}
