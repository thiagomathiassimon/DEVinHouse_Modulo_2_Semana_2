package br.com.devinhouse.exercicioseis.model;

public class Secundarista extends Estudante {

	private int anoDoEnsinoMedio;

	public Secundarista(String nome, String sobrenome, String cpf, int idade, int[] notas, int anoDoEnsinoMedio) {
		super(nome, sobrenome, cpf, idade, notas);
		this.anoDoEnsinoMedio = anoDoEnsinoMedio;
	}

	public int getAnoDoEnsinoMedio() {
		return this.anoDoEnsinoMedio;
	}

	public void setAnoDoEnsinoMedio(int ano) {
		this.anoDoEnsinoMedio = ano;
	}

}
