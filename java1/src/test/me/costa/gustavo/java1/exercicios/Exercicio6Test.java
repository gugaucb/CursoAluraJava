package me.costa.gustavo.java1.exercicios;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;

public class Exercicio6Test {

	@Test
	public void testCalcularFatorComFatorialZero() {
		Assert.assertEquals(new BigDecimal(1), new Exercicio6().calcularFator(0));
	}

	@Test
	public void testCalcularator() {
		Assert.assertEquals(new BigDecimal(1), new Exercicio6().calcularFator(0));
	}
	
	
	@Test
	public void testCalcularFatorComFatorialUm() {
		Assert.assertEquals(new BigDecimal(1), new Exercicio6().calcularFator(1));
	}
	
	@Test
	public void testCalcularFatorComFatorialDez() {
		Assert.assertEquals(new BigDecimal(3628800), new Exercicio6().calcularFator(10));
	}
}
