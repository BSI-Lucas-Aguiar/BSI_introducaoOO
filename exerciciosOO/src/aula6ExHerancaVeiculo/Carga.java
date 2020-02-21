package aula6ExHerancaVeiculo;

public class Carga extends Veiculo{
	
	protected double toneladas;
	
	public Carga(String placa, String marca, String modelo, int ano, double km_inicial, double km_final,double toneladas) {
		super(placa, marca, modelo, ano, km_inicial, km_final);
		this.toneladas = toneladas;
	}
	
	public double getToneladas() {
		return toneladas;
	}
	public void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}
	//Calculo do valor
	public double calculo_km(double preco_km){
		return super.calculo_km(preco_km)*1.1;
	}
	
}
