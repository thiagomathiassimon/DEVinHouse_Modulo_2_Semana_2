package br.com.devinhouse.formas.model;

public class Circulo extends FormaBidimensional {

	private double raio;
	private double diametro;

	public Circulo(int dimensoes, double area, double perimetro, double largura, double comprimento, double raio,
			double diametro) {
		super(dimensoes, area, perimetro, largura, comprimento);
		this.raio = raio;
		this.diametro = diametro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double calcularAreaDoCirculo() {
		return Math.PI * (this.raio * this.raio);
	}

	public double calcularComprimentoDaCircunferencia() {
		return 2 * Math.PI * this.raio;
	}

	public double calcularDiametro() {
		return 2 * this.raio;
	}

	public double calcularRaio() {
		return this.diametro / 2;
	}

}
