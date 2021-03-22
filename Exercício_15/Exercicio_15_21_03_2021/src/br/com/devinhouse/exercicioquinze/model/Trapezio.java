package br.com.devinhouse.exercicioquinze.model;

public class Trapezio extends Quadrilatero {

	private double baseMenor;
	private double baseMaior;
	private double lado1;
	private double lado2;
	private double altura;

	public double calcularArea() {
		return ((this.baseMaior + this.baseMenor) * this.altura) / 2;
	}

	public double calcularPerimetro() {
		return this.baseMaior * this.baseMenor + this.lado1 + this.lado2;
	}

	public Trapezio(Ponto coordenadaPonto1, Ponto coordenadaPonto2, Ponto coordenadaPonto3, Ponto coordenadaPonto4,
			double baseMenor, double baseMaior, double lado1, double lado2, double altura) {
		super(coordenadaPonto1, coordenadaPonto2, coordenadaPonto3, coordenadaPonto4);
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
