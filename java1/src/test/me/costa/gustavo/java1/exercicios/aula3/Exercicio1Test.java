package me.costa.gustavo.java1.exercicios.aula3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Exercicio1Test {

	@Test
	public void deveCriarUmObjetoComBaseNaClasseFuncionario() {
		Exercicio1 exercicio1 = new Exercicio1();
		Funcionario funcionario = exercicio1.instanciarFuncionario();
		Assert.assertEquals(true, (funcionario instanceof Funcionario));
	}
	
	

}
