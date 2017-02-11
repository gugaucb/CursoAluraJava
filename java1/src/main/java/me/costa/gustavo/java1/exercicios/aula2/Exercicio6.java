package me.costa.gustavo.java1.exercicios.aula2;

import java.math.BigDecimal;

import me.costa.gustavo.java1.exercicios.IExercicio;

public class Exercicio6 implements IExercicio {

	@Override
	public void executarExercicio() {
		for (int i = 1; i <= 40 ; i++) {
			System.out.println("Fatorial de "+i+" = "+calcularFator(i).toString());
		}
		

	}

	public BigDecimal calcularFator(long fator) {
		BigDecimal temp = new BigDecimal(1);
		if(fator == 0){
			return new BigDecimal(1);
		}
		for (long j =1 ; j <= fator; j++) {
			temp = temp.multiply(new BigDecimal(j));
		}
		return temp;
	}

}
