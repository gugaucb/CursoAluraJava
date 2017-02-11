package me.costa.gustavo.java1.exercicios.aula2;

import me.costa.gustavo.java1.exercicios.IExercicio;

public class Exercicio4 implements IExercicio {

	@Override
	public void executarExercicio() {
		int soma = 0;
		int i = 1;

		while (i <= 1000) {
			soma = soma + i;
			i++;
		}
		System.out.println("Soma:" + soma);

	}

}
