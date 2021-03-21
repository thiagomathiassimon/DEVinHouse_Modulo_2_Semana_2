package br.com.devinhouse.exercicioseis.model;

public class EstudantePosGraduacao extends Estudante {

	private String graduacao;
	private String curso;
	private int semestreDoCurso;
	private String[] disciplinas;

	public EstudantePosGraduacao(String nome, String sobrenome, String cpf, int idade, String curso,
			int semestreDoCurso, String graduacao, String[] disciplinas, int[] notas) {
		super(nome, sobrenome, cpf, idade, notas);
		this.graduacao = graduacao;
		this.curso = curso;
		this.semestreDoCurso = semestreDoCurso;
		this.disciplinas = disciplinas;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSemestreDoCurso() {
		return semestreDoCurso;
	}

	public void setSemestreDoCurso(int semestreDoCurso) {
		this.semestreDoCurso = semestreDoCurso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

}
