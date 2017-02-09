package me.costa.gustavo.java1.exercicios;

import java.math.BigDecimal;

public class Exercicio6 implements IExercicio {

	@Override
	public void executarExercicio() {
		for (int i = 1; i <= 40 ; i++) {
			System.out.println("Fatorial de "+i+" = "+calcularFator(i).toString());
		}
		

	}

	private BigDecimal calcularFator(long fator) {
		BigDecimal temp = new BigDecimal(1);
		
		for (long j =1 ; j <= fator; j++) {
			temp = temp.multiply(new BigDecimal(j));
		}
		return temp;
	}

}
