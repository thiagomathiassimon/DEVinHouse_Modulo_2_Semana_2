package br.com.devinhouse.formas.model;

public class FormaTridimensional extends Forma {

	private double largura;
	private double comprimento;
	private double altura;
	private double volume;

	public FormaTridimensional(int dimensoes, double area, double perimetro, double largura, double comprimento,
			double altura, double volume) {
		super(dimensoes, area, perimetro);
		this.largura = largura;
		this.comprimento = comprimento;
		this.altura = altura;
		this.volume = volume;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

}
