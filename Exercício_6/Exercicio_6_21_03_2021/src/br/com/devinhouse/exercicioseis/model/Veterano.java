package br.com.devinhouse.exercicioseis.model;

public class Veterano extends EstudanteGraduacao {

	public Veterano(String nome, String sobrenome, String cpf, int idade, String curso, int anoDoCuros,
			String graduacao, String[] disciplinas, int[] notas) {
		super(nome, sobrenome, cpf, idade, curso, anoDoCuros, graduacao, disciplinas, notas);
	}
	
	@Override
	public void setSemestreDoCurso(int semestreDoCurso) {
		if (semestreDoCurso > 1) {
		super.setSemestreDoCurso(semestreDoCurso);
	} else {
		super.setSemestreDoCurso(2);
	}
	}
}
