package aula6ExHerancaIngresso;

public class VIP extends Ingresso {
	
	protected float valorAdicional;
	
	public VIP(float valor) {
		super(valor);
		this.valorAdicional=50;
	}

	public float getValorAdicional() {
		return this.valorAdicional;
	}
	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	//Retorno do valor
	public float imprimeValor(){
		return super.imprimeValor()+this.valorAdicional;
	}
}
