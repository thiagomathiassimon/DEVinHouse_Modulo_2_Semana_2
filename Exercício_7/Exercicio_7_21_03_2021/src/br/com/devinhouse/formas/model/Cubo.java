package br.com.devinhouse.formas.model;

public class Cubo extends FormaTridimensional {

	private static final int QUANTIDADE_DE_LADOS = 6;

	private double tamanhoDoLado;
	private double vertices;
	private double angulosInternos;

	public Cubo(int dimensoes, double area, double perimetro, double largura, double comprimento, double altura,
			double volume, double tamanhoDoLado, double vertices, double angulosInternos) {
		super(dimensoes, area, perimetro, largura, comprimento, altura, volume);
		this.tamanhoDoLado = tamanhoDoLado;
		this.vertices = vertices;
		this.angulosInternos = angulosInternos;
	}

	public double getTamanhoDoLado() {
		return tamanhoDoLado;
	}

	public void setTamanhoDoLado(double lados) {
		this.tamanhoDoLado = lados;
	}

	public double getVertices() {
		return vertices;
	}

	public void setVertices(double vertices) {
		this.vertices = vertices;
	}

	public double getAngulosInternos() {
		return angulosInternos;
	}

	public void setAngulosInternos(double angulosInternos) {
		this.angulosInternos = angulosInternos;
	}

	public double calcularAreaDoCuboo() {
		return QUANTIDADE_DE_LADOS * (this.tamanhoDoLado * this.tamanhoDoLado);
	}

	public double calcularVolumeDoCubo() {
		return (this.tamanhoDoLado * this.tamanhoDoLado * this.tamanhoDoLado);
	}
}
