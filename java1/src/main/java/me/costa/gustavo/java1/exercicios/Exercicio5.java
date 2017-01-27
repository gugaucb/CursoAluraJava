package me.costa.gustavo.java1.exercicios;

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
