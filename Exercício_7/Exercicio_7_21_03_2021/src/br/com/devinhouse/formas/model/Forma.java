package br.com.devinhouse.formas.model;

public class Forma {

	private int dimensoes;
	private double area;
	private double perimetro;

	public Forma(int dimensoes, double area, double perimetro) {
		super();
		this.dimensoes = dimensoes;
		this.area = area;
		this.perimetro = perimetro;
	}

	public int getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(int dimensoes) {
		this.dimensoes = dimensoes;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

}
