package br.com.devinhouse.exercicioseis.model;

public class EstudanteGraduacao extends Estudante {

	private String curso;
	private int semestreDoCurso;
	private String[] disciplinas;

	public EstudanteGraduacao(String nome, String sobrenome, String cpf, int idade, String curso, int anoDoCuros,
			String graduacao, String[] disciplinas, int[] notas) {
		super(nome, sobrenome, cpf, idade, notas);
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
