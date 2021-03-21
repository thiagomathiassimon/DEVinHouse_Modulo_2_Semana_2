package br.com.devinhouse.exercicioseis.model;

public class Calouro extends EstudanteGraduacao {

	public Calouro(String nome, String sobrenome, String cpf, int idade, String curso, int anoDoCuros, String graduacao,
			String[] disciplinas, int[] notas) {
		super(nome, sobrenome, cpf, idade, curso, anoDoCuros, graduacao, disciplinas, notas);
	}

	@Override
	public void setSemestreDoCurso(int semestreDoCurso) {
		super.setSemestreDoCurso(1);
	}

}
