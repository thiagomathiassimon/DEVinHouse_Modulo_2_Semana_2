package br.com.devinhouse.exercicioseis.model;

public class Mestrando extends EstudantePosGraduacao {

	public Mestrando(String nome, String sobrenome, String cpf, int idade, String curso, int semestreDoCuros,
			String graduacao, String[] disciplinas, int[] notas) {
		super(nome, sobrenome, cpf, idade, curso, semestreDoCuros, graduacao, disciplinas, notas);
	}

}
