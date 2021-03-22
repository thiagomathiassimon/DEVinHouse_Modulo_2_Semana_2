package br.com.devinhouse.exercicioquinze.main;

import br.com.devinhouse.exercicioquinze.model.Paralelogramo;
import br.com.devinhouse.exercicioquinze.model.Ponto;
import br.com.devinhouse.exercicioquinze.model.Quadrado;
import br.com.devinhouse.exercicioquinze.model.Trapezio;

public class Testa {

	public static void main(String[] args) {

		Ponto pontoA = new Ponto(1, 1);
		Ponto pontoB = new Ponto(1.5, 2);
		Ponto pontoC = new Ponto(2.5, 2);
		Ponto pontoD = new Ponto(3, 1);

		Trapezio trapezio = new Trapezio(pontoA, pontoB, pontoC, pontoD, 2, 4, 2, 2, 2);

		System.out.println("Ponto A: " + trapezio.getCoordenadaPonto1());
		System.out.println("Ponto B: " + trapezio.getCoordenadaPonto2());
		System.out.println("Ponto C: " + trapezio.getCoordenadaPonto3());
		System.out.println("Ponto D: " + trapezio.getCoordenadaPonto4());

		pontoA = new Ponto(1, 1);
		pontoB = new Ponto(1.5, 2);
		pontoC = new Ponto(3, 2);
		pontoD = new Ponto(2.5, 1);

		Paralelogramo paralelogramo = new Paralelogramo(pontoA, pontoB, pontoC, pontoD, 2, 3, 2);

		System.out.println("\nPonto A: " + paralelogramo.getCoordenadaPonto1());
		System.out.println("Ponto B: " + paralelogramo.getCoordenadaPonto2());
		System.out.println("Ponto C: " + paralelogramo.getCoordenadaPonto3());
		System.out.println("Ponto D: " + paralelogramo.getCoordenadaPonto4());

		pontoA = new Ponto(1, 1);
		pontoB = new Ponto(1.5, 1);
		pontoC = new Ponto(2, 2);
		pontoD = new Ponto(2, 1);

		Quadrado quadrado = new Quadrado(pontoA, pontoB, pontoC, pontoD, 2);

		System.out.println("\nPonto A: " + quadrado.getCoordenadaPonto1());
		System.out.println("Ponto B: " + quadrado.getCoordenadaPonto2());
		System.out.println("Ponto C: " + quadrado.getCoordenadaPonto3());
		System.out.println("Ponto D: " + quadrado.getCoordenadaPonto4());

	}

}
