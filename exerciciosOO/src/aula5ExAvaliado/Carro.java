package aula5ExAvaliado;

public class Carro {
	private String modelo;
	private String cor;
	private String ano;
	private String marca;
	private String chassi;
	private String proprietario;
	private int velocidadeMax;
	private int velocidadeAtual;
	private int numPortas;
	private String tetoSolar;
	private int numMarchas;
	private int marchaAtual;
	private String cambioAutomatico;
	private int volumeCombustivel;
	
	
	public Carro(String m, String cor, String ano, String marca, String  chassi, String nome, int portas, String teto, int  marchas, String cambio) {
		this.modelo=m;
		this.cor=cor;
		this.ano=ano;
		this.marca=marca;
		this.chassi=chassi;
		this.proprietario=nome;
		this.numPortas=portas;
		this.tetoSolar=teto;
		this.numMarchas=marchas;
		this.cambioAutomatico=cambio;
	}
	
	//Modelo
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//Cor
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	//Ano
	public String getAno() {
		return this.ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	//Marca
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//Chassi
	public String getChassi() {
		return this.chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	//Proprietario
	public String getProprietario() {
		return this.proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	//Velocidade Maxima
	public int getVelocidadeMax() {
		return this.velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	//Velocidade Atual
	public int getVelocidadeAtual() {
		return this.velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	//Numero de portas
	public int getNumPortas() {
		return this.numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	//Teto Solar
	public String getTetoSolar() {
		return this.tetoSolar;
	}
	public void setTetoSolar(String tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	//Numero de marchas
	public int getNumMarchas() {
		return this.numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	//Marcha Atual
	public int getMarchaAtual() {
		return this.marchaAtual;
	}
	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	//Cambio Automatico
	public String getCambioAutomatico() {
		return this.cambioAutomatico;
	}
	public void setCambioAutomatico(String cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	//Volume de Combustivel
	public int getVolumeCombustivel() {
		return this.volumeCombustivel;
	}
	public void setVolumeCombustivel(int volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}
	
	//Procedimentos
	public void acelera() {
		this.velocidadeAtual++;
	}
	
	public void freia() {
		this.velocidadeAtual=0;
		this.marchaAtual=1;
	}
	
	public void trocaMarcha() {
		if(this.marchaAtual<this.numMarchas) {
			this.marchaAtual++;
		}
	}
	
	public void reduzMarchas() {
		if(this.marchaAtual>=2) {
			this.marchaAtual--;
		}
	}
	
	public String verificaTanque() {
		if(this.volumeCombustivel<10) {
			return "Acabando";
		}
		if(this.volumeCombustivel>10 && this.volumeCombustivel<70) {
			return "Estado do tanque de combustivel: Metade";
		}
		if(this.volumeCombustivel>69) {
			return "Estado do tanque de combustivel: Cheio";
		}
		return "Estado do tanque de combust�vel: Indefinido";
	}
	
	
}
