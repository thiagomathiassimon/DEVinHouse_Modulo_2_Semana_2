package br.com.devinhouse.formas.model;

public class Esfera {

	private double raio;
	private double diametro;

	public double calcularAreaDaEsfera() {
		return 4 * Math.PI * (this.raio * this.raio);
	}

	public double calcularVolumeDaEsfera() {
		return (4 / 3) * Math.PI * (this.raio * this.raio * this.raio);
	}

	public double calcularDiametro() {
		return 2 * this.raio;
	}

	public double calcularRaio() {
		return this.diametro / 2;
	}

}
