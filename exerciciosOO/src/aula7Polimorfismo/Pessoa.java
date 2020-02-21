package aula7Polimorfismo;

public abstract class Pessoa {
	protected String nome;
	protected String dataNasc;
	
	public Pessoa(String nome, String dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	//Sets & Gets
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return this.dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public abstract String mostrarDados();
}
