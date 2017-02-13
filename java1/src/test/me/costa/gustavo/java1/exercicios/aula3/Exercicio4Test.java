package me.costa.gustavo.java1.exercicios.aula3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Exercicio4Test {

	@Test
	public void deveCompararObjetosComMesmoValor() {
		Exercicio4 exercicio4 = new Exercicio4();
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Danilo");
		funcionario1.setSalario(100);
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Danilo");
		funcionario2.setSalario(100);
		Assert.assertEquals(false, exercicio4.equalObjets(funcionario1, funcionario2));
	}

	@Test
	public void deveCompararObjetosComValorDiferentes() {
		Exercicio4 exercicio4 = new Exercicio4();
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("João");
		funcionario1.setSalario(200);
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Danilo");
		funcionario2.setSalario(100);
		Assert.assertEquals(false, exercicio4.equalObjets(funcionario1, funcionario2));
	}
	
	@Test
	public void deveCompararObjetosComMesmaReferencia() {
		Exercicio4 exercicio4 = new Exercicio4();
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("João");
		funcionario1.setSalario(200);
		Funcionario funcionario2 = funcionario1;
		Assert.assertEquals(true, exercicio4.equalObjets(funcionario1, funcionario2));
	}
}
