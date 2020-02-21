package aula6ExHerancaIngresso;

public class CamaroteSuperior extends VIP {
	
	protected String localizacao;

	public String getLocalizacao() {
		return this.localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public CamaroteSuperior(float valor) {
		super(valor);
		this.localizacao="Superior";
	}
	
	//Retorno do valor
	public float imprimeValor(){
		return super.imprimeValor()+100;
	}
}
