package br.com.devinhouse.exercicioquinze.model;

public class Quadrado extends Quadrilatero {

	private double lado;

	public double calcularArea() {
		return lado * lado;
	}

	public double calcularPerimetro() {
		return 4 * lado;
	}

	public Quadrado(Ponto coordenadaPonto1, Ponto coordenadaPonto2, Ponto coordenadaPonto3, Ponto coordenadaPonto4,
			double lado) {
		super(coordenadaPonto1, coordenadaPonto2, coordenadaPonto3, coordenadaPonto4);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
