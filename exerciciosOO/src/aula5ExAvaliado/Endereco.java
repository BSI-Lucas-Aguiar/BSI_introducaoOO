package aula5ExAvaliado;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	private String complemento;
	
	Endereco endereco;
	
	public Endereco(String r, String b, String c, String e, int cep, String comp) {
		this.rua=r;
		this.bairro=b;
		this.cidade=c;
		this.estado=e;
		this.cep=cep;
		this.complemento=comp;
	}
	
	
	//Rua
	public String getRua() {
		return this.rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	//Bairro
	public String getBairro() {
		return this.bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	//Cidade
	public String getCidade() {
		return this.cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	//Estado
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//Cep
	public int getCep() {
		return this.cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	//Complemento
	public String getComplemento() {
		return this.complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String mostrarEndereco() {
		return ("Rua: "+this.rua+"\nBairro: "+this.bairro+"\nCidade: "+this.cidade+"\nEstado"+this.estado+"CEP: "+this.cep+"\nComplemento: "+this.complemento);
	}
	
}
