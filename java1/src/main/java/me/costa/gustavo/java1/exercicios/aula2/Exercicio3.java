package me.costa.gustavo.java1.exercicios.aula2;

import me.costa.gustavo.java1.exercicios.IExercicio;

public class Exercicio3 implements IExercicio {

	@Override
	public void executarExercicio() {
		int i = 150;
		while(i<=300){
			System.out.println(i);
			i++;
		}
		
	}

}
