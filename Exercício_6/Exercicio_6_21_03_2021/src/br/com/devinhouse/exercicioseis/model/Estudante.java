package br.com.devinhouse.exercicioseis.model;

public class Estudante {

	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	private int[] notas;

	public Estudante(String nome, String sobrenome, String cpf, int idade, int[] notas) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.idade = idade;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int[] getNotas() {
		return this.notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
}
