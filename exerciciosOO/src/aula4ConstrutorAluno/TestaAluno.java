package aula4ConstrutorAluno;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno a1, a2;
		
		a1=new Aluno("Lucas", "Matematica", 10);
		a2=new Aluno("Mateus", "Matematica", 0);
		
		/*a1.setNome("Lucas");
		a1.setDisciplina("Matem�tica");
		a1.setNotaFinal(10);*/
		
		System.out.println(a1.mostrarAluno());
		System.out.println(a1.mostrarSituacao());
		
		System.out.println(a2.mostrarAluno());
		System.out.println(a2.mostrarSituacao());
		
	}
}
