package aula7Polimorfismo;

public class Pagamento {
	private double valorFinal;
	
	public String efetuarPagamento(Pessoa p) {
		return (p.mostrarDados()+"\nValor Final"+this.valorFinal);
	}
}
