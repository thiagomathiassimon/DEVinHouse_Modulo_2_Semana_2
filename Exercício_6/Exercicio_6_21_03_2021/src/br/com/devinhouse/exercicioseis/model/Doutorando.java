package br.com.devinhouse.exercicioseis.model;

public class Doutorando extends EstudantePosGraduacao {

	private boolean possuiMestrado;

	public Doutorando(String nome, String sobrenome, String cpf, int idade, String curso, int semestreDoCuros,
			String graduacao, String[] disciplinas, int[] notas, boolean possuiMetrado) {
		super(nome, sobrenome, cpf, idade, curso, semestreDoCuros, graduacao, disciplinas, notas);
	}

	public boolean isPossuiMestrado() {
		return possuiMestrado;
	}

	public void setPossuiMestrado(boolean possuiMestrado) {
		this.possuiMestrado = possuiMestrado;
	}

}
