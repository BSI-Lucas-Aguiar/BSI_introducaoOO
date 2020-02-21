package aula6ExHerancaIngresso;

public class CamaroteInferior extends VIP {

	protected String localizacao;

	public String getLocalizacao() {
		return this.localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public CamaroteInferior(float valor) {
		super(valor);
		this.localizacao="Inferior";
	}
	
	//Retorno do valor
	public float imprimeValor(){
		return super.imprimeValor()+50;
	}
}
