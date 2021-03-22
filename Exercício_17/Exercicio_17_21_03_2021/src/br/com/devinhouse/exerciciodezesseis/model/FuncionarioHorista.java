package br.com.devinhouse.exerciciodezesseis.model;

public class FuncionarioHorista extends Funcionario {

	private double horas;
	private double salario;

	public FuncionarioHorista(String nome, String sobrenome, String cpf, double horas, double salario) {
		super(nome, sobrenome, cpf);
		this.horas = validarHoras(horas);
		this.salario = validarSalario(salario);
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = validarHoras(horas);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = validarSalario(salario);
	}

	private double validarSalario(double salario) {
		if (salario > 0) {
			return this.salario = salario;
		}
		return this.salario = 0;
	}

	private double validarHoras(double horas) {
		if (horas > 0 && horas < 168) {
			return this.horas = horas;
		}
		return this.horas = 0;
	}

	public double ganhos() {
		return this.horas * this.salario;
	}

	@Override
	public String toString() {
		return super.toString() + " horas: " + horas + ", salario: " + salario;
	}

}
