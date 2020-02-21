package aula7Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Pessoa pf=new PessoaFisica("Lucas", "06/05/1994", "123.123.123-12");
		Pessoa pj=new PessoaJuridica("Super Bom", "01/01/1990", "12.345.789/1234-56");
		
		Pagamento p = new Pagamento();
		
		System.out.println(p.efetuarPagamento(pf));
		System.out.println(p.efetuarPagamento(pj));

	}

}
