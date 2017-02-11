package me.costa.gustavo.java1.exercicios.aula2;

import me.costa.gustavo.java1.exercicios.IExercicio;

public class Exercicio5 implements IExercicio {

	@Override
	public void executarExercicio() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
