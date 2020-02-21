package aula6ExHerancaVeiculo;

public class Teste {

	public static void main(String[] args) {
		Veiculo v1=new Veiculo("abc-1234", "Ferrari", "Esporte", 2000, 100000, 120000);
		
		System.out.println("Valor do aluguel: "+v1.calculo_km(200));
		
		Veiculo v2=new Carga("def-5678", "Volksvagem", "1313", 1990, 100000, 120000, 10);
		
		System.out.println("Valor do aluguel Carga: "+v2.calculo_km(200));

	}

}
