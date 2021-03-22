package br.com.devinhouse.exercicioquinze.model;

public class Paralelogramo extends Quadrilatero {

	private double laterais;
	private double baseETopo;
	private double altura;

	public double calcularArea() {
		return baseETopo * altura;
	}

	public double calcularPerimetro() {
		return 2 * (baseETopo + laterais);
	}

	public Paralelogramo(Ponto coordenadaPonto1, Ponto coordenadaPonto2, Ponto coordenadaPonto3,
			Ponto coordenadaPonto4, double laterais, double baseETopo, double altura) {
		super(coordenadaPonto1, coordenadaPonto2, coordenadaPonto3, coordenadaPonto4);
		this.laterais = laterais;
		this.baseETopo = baseETopo;
		this.altura = altura;
	}

	public double getLaterais() {
		return laterais;
	}

	public void setLaterais(double laterais) {
		this.laterais = laterais;
	}

	public double getBaseETopo() {
		return baseETopo;
	}

	public void setBaseETopo(double baseETopo) {
		this.baseETopo = baseETopo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
