package br.com.devinhouse.exercicioquinze.model;

public class Ponto {

	private double coordenadaEmX;
	private double coordenadaEmY;

	public Ponto(double x, double y) {
		this.coordenadaEmX = x;
		this.coordenadaEmY = y;
	}

	public String getCoordenadas() {
		return String.format("(%f,%f)", this.coordenadaEmX, this.coordenadaEmY);
	}

}
