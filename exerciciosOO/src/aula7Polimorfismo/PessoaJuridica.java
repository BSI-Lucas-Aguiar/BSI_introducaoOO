package aula7Polimorfismo;

public class PessoaJuridica extends Pessoa{
	protected String cnpj;

	public PessoaJuridica(String nome, String dataNasc, String cnpj) {
		super(nome, dataNasc);
		this.cnpj = cnpj;
	}
	
	//Sets & Gets
	public String getCnpj() {
		return this.cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String mostrarDados() {
		return ("\nNome: "+this.nome+"\nData de Nascimento: "+this.dataNasc+"\nCNPJ: "+this.cnpj);
	}
}
