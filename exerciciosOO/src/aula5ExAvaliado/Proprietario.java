package aula5ExAvaliado;

public class Proprietario {
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	
	Endereco endereco;
	
	public Proprietario(String n, String c, String r, Endereco e1) {
		this.nome=n;
		this.cpf=c;
		this.rg=r;
		this.endereco=e1;
	}
	//Nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//CPF
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//RG
	public String getRg() {
		return this.rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	//Data de Nascimento
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	//Mostrar as informa��es do construtor
	public String mostrarProprietario() {
		return("Nome: "+this.nome+"\nCPF: "+this.cpf+"\nRG: "+this.rg);
	}
	
	
}
