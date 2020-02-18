package aula3Pesquisa;

public class Principal {

	public static void main(String[] args) {
		//Criou os objetos Projeto e pesquisador
		Projeto proj = new Projeto();
		Pesquisador pes = new Pesquisador();
		//projeto no atributo pesq recebe o objeto pes criado anteriormente
		proj.setPesq(pes);
		
		//Preenche
		proj.setNome("Reconciliando Projetos");
		proj.setArea("Engenharia de Software");
		
		//Preenche
		proj.getPesq().setNome("Renata");
		proj.getPesq().setCpf("123456789 12");
		
		//Imprime
		System.out.println(proj.getPesq().getNome());
		System.out.println(proj.getPesq().getCpf());
	}

}
