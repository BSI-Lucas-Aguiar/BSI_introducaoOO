package aula7Polimorfismo;

public class PessoaFisica extends Pessoa {
	protected String cpf;
	
	public PessoaFisica(String nome, String dataNasc, String cpf) {
		super(nome, dataNasc);
		this.cpf = cpf;
	}

	//Sets & Gets
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String mostrarDados() {
		return ("\nNome: "+this.nome+"\nData de Nascimento: "+this.dataNasc+"\nCPF: "+this.cpf);
	}
}
