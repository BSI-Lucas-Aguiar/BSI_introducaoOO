package aula5ExAvaliado;

public class teste {

	public static void main(String[] args) {
		
		//Endere�o
		Endereco e1;
		e1=new Endereco("Rua Silva Pinto 102", "Turf Club", "Campos dos Goytacazes", "RJ", 28028270, "Casa");
				
		System.out.println("Endere�o:");
				
		System.out.println(e1.mostrarEndereco());
		
		
		//Proprietario
		Proprietario p1;
		p1=new Proprietario("Lucas de Figueiredo Aguiar", "14972985712", "213135270", e1);
		
		System.out.println("\nProprietario:");
		System.out.println(p1.mostrarProprietario());
		
		p1.setDataNascimento("06/05/1994");
		System.out.println("Nascimento: "+p1.getDataNascimento());
		
		//Carro
		Carro c1;
		c1=new Carro("A4", "Prata", "2018", "BMW", "00000-0", p1.getNome(), 2, "Convers�vel",  6, "Autom�tico");
		
		
		c1.setVelocidadeMax(280);
		c1.setVelocidadeAtual(10);
		c1.setMarchaAtual(1);
		c1.setVolumeCombustivel(50);
		
		System.out.println("\nCarro:");
		System.out.println(c1.getModelo());
		System.out.println(c1.getCor());
		System.out.println(c1.getAno());
		System.out.println(c1.getMarca());
		System.out.println("Chassi: "+c1.getChassi());
		System.out.println("Proprietario: "+c1.getProprietario());
		System.out.println("Vel Max: "+c1.getVelocidadeMax());
		System.out.println("Vel Atual: "+c1.getVelocidadeAtual());
		System.out.println("NumPortas: "+c1.getNumPortas());
		System.out.println(c1.getTetoSolar());
		System.out.println("Num Marchas: "+c1.getNumMarchas());
		System.out.println("Marcha Atual: "+c1.getMarchaAtual());
		System.out.println("Cambio: "+c1.getCambioAutomatico());
		System.out.println("Tanque: "+c1.getVolumeCombustivel()+"%");
		
		
		//Troca de Marchas
		System.out.println("\nTestes dos procedimentos:");
		System.out.println("Marcha Atual: "+c1.getMarchaAtual());
		c1.trocaMarcha();
		System.out.println("Marcha Atual: "+c1.getMarchaAtual());
		c1.reduzMarchas();
		System.out.println("Marcha Atual: "+c1.getMarchaAtual());
		c1.trocaMarcha();
		c1.trocaMarcha();
		System.out.println("Marcha Atual: "+c1.getMarchaAtual());
		
		//Acelera, Freia
		System.out.println("\nVel Atual: "+c1.getVelocidadeAtual());
		c1.acelera();
		c1.acelera();
		c1.acelera();
		System.out.println("Vel Atual: "+c1.getVelocidadeAtual());
		c1.freia();
		System.out.println("Vel Atual: "+c1.getVelocidadeAtual());
		
		//Volume de combust�vel
		System.out.println("\n"+c1.verificaTanque());
	}

}
