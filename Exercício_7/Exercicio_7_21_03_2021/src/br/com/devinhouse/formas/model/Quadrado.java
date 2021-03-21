package br.com.devinhouse.formas.model;

public class Quadrado extends FormaBidimensional {

	private static final int QUANTIDADE_DE_LADOS = 4;

	private double tamanhoDoLado;
	private double vertices;
	private double angulosInternos;

	public Quadrado(int dimensoes, double area, double perimetro, double largura, double comprimento, double lados,
			double vertices, double angulosInternos) {
		super(dimensoes, area, perimetro, largura, comprimento);
		this.tamanhoDoLado = lados;
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

	public double calcularAreaDoQuadrado() {
		return this.tamanhoDoLado * this.tamanhoDoLado;
	}

	public double calcularPerimetroDoQuadrado() {
		return QUANTIDADE_DE_LADOS * this.tamanhoDoLado;
	}
}
