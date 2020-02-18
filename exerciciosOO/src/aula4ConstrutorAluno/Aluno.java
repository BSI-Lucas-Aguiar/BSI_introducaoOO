package aula4ConstrutorAluno;

public class Aluno {
	private String nome;
	private String disciplina;
	private double notaFinal;
	
	public Aluno(String n, String d, double nf){
		this.nome = n;
		this.disciplina = d;
		this.notaFinal = nf;
	}
	
	/*public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}*/
	
	public String mostrarAluno() {
		return(this.nome+" "+this.disciplina+" "+this.notaFinal);
	}
	
	public String mostrarSituacao(){
		if(this.notaFinal>=6){
			return ("Aprovado");
		}else{
			return ("Reprovado");
		}
	}
}
