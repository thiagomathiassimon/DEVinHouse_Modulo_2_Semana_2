package br.com.devinhouse.exerciciodezesseis.main;

import br.com.devinhouse.exerciciodezesseis.model.Funcionario;
import br.com.devinhouse.exerciciodezesseis.model.FuncionarioComissionado;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("João", "Silveira", "11122233344");

		System.out.println(funcionario.toString());

		FuncionarioComissionado fc = new FuncionarioComissionado("Silva", "Joanes", "11122233344", 1000, 0.5);
		
		System.out.println(fc.toString());
		System.out.println(fc.ganhos());
	}

}
