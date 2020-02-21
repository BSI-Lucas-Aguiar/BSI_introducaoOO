package aula6ExHerancaVeiculo;

public class Veiculo {

	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected double km_inicial;
	protected double km_final;
	
	public Veiculo(String placa, String marca, String modelo, int ano, double km_inicial, double km_final) {
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.km_inicial=km_inicial;
		this.km_final=km_final;
	}
	
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getKm_inicial() {
		return this.km_inicial;
	}
	public void setKm_inicial(double km_inicial) {
		this.km_inicial = km_inicial;
	}
	
	public double getKm_final() {
		return this.km_final;
	}
	public void setKm_final(double km_final) {
		this.km_final = km_final;
	}
	//Calculo do valor
	public double calculo_km(double preco_km){
		return ((km_final - km_inicial)*preco_km);
	}
	
}
