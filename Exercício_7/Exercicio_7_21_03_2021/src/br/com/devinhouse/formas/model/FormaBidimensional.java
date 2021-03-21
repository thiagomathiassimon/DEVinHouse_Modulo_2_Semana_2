package br.com.devinhouse.formas.model;

public class FormaBidimensional extends Forma {

	private double largura;
	private double comprimento;

	public FormaBidimensional(int dimensoes, double area, double perimetro, double largura, double comprimento) {
		super(dimensoes, area, perimetro);
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

}
