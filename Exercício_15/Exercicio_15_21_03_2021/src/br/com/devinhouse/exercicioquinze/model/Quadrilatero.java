package br.com.devinhouse.exercicioquinze.model;

public class Quadrilatero {

	private String coordenadaPonto1;
	private String coordenadaPonto2;
	private String coordenadaPonto3;
	private String coordenadaPonto4;

	public Quadrilatero(Ponto coordenadaPonto1, Ponto coordenadaPonto2, Ponto coordenadaPonto3,
			Ponto coordenadaPonto4) {
		super();
		this.coordenadaPonto1 = coordenadaPonto1.getCoordenadas();
		this.coordenadaPonto2 = coordenadaPonto2.getCoordenadas();
		this.coordenadaPonto3 = coordenadaPonto3.getCoordenadas();
		this.coordenadaPonto4 = coordenadaPonto4.getCoordenadas();
	}

	public String getCoordenadaPonto1() {
		return coordenadaPonto1;
	}

	public void setCoordenadaPonto1(Ponto coordenadaPonto1) {
		this.coordenadaPonto1 = coordenadaPonto1.getCoordenadas();
	}

	public String getCoordenadaPonto2() {
		return coordenadaPonto2;
	}

	public void setCoordenadaPonto2(Ponto coordenadaPonto2) {
		this.coordenadaPonto2 = coordenadaPonto2.getCoordenadas();
	}

	public String getCoordenadaPonto3() {
		return coordenadaPonto3;
	}

	public void setCoordenadaPonto3(Ponto coordenadaPonto3) {
		this.coordenadaPonto3 = coordenadaPonto3.getCoordenadas();
	}

	public String getCoordenadaPonto4() {
		return coordenadaPonto4;
	}

	public void setCoordenadaPonto4(Ponto coordenadaPonto4) {
		this.coordenadaPonto4 = coordenadaPonto4.getCoordenadas();
	}

}
