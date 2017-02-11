package me.costa.gustavo.java1.exercicios;

import org.junit.Test;

import junit.framework.Assert;
import me.costa.gustavo.java1.exercicios.aula2.Exercicio8;

public class Exercicio8Test {

	@Test
	public void test() {
		Exercicio8 exercicio8 = new Exercicio8();
		String resultado = exercicio8.calculaSequencia(13);
		Assert.assertEquals("13 > 40 > 20 > 10 > 5 > 16 > 8 > 4 > 2 > 1", resultado);
	}

}
