package br.com.devinhouse.exerciciodezesseis.model;

public class FuncionarioComissionado extends Funcionario {

	private double vendasBrutas;
	private double taxaDeComissao;

	public FuncionarioComissionado(String nome, String sobrenome, String cpf, double vendasBrutas,
			double taxaDeComissao) {
		super(nome, sobrenome, cpf);
		this.vendasBrutas = this.validarVendasBrutas(vendasBrutas);
		this.taxaDeComissao = this.validarTaxaDeComissao(taxaDeComissao);
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = this.validarVendasBrutas(vendasBrutas);
	}

	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}

	public void setTaxaDeComissao(double taxaDeComissao) {
		this.taxaDeComissao = this.validarTaxaDeComissao(taxaDeComissao);
	}

	private double validarTaxaDeComissao(double taxaDeComissao) {
		if (taxaDeComissao > 0 && taxaDeComissao < 1) {
			return this.taxaDeComissao = taxaDeComissao;
		}
		return this.taxaDeComissao = 0;
	}

	private double validarVendasBrutas(double vendasBrutas) {
		if (vendasBrutas >= 0) {
			return this.vendasBrutas = vendasBrutas;
		}
		return this.vendasBrutas = 0;
	}

	public double ganhos() {
		return this.taxaDeComissao * this.vendasBrutas;
	}

	@Override
	public String toString() {
		return super.toString() + " vendas brutas: " + vendasBrutas + ", taxa de comissao: " + taxaDeComissao + ".";
	}

}
