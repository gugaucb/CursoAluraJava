package me.costa.gustavo.java1.exercicios.aula4;

import org.junit.Test;

import junit.framework.Assert;
import me.costa.gustavo.java1.exercicios.aula3.Funcionario;

public class TestExercicio1 {

	@Test
	public void deveRecuperarUmArrayDeFuncionarioComTamanho10() {
	
		Empresa empresa = new Empresa();
		Funcionario[] funcionarios = empresa.getFuncionarios();
		Assert.assertEquals(10, funcionarios.length);	
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void deveAdicionarUmFuncionarioAlemDaCapacidade() {
		Empresa empresa = new Empresa();
		for (int i = 0; i < 11; i++) {
			empresa.adicionar(new Funcionario());
		}
	}
	
	@Test
	public void deveAdicionarPrimeiroFuncionarioNoArray() {
		Empresa empresa = new Empresa();
		Assert.assertEquals(0, empresa.adicionar(new Funcionario()));	
	}
	
	@Test
	public void deveAdicionarCincoFuncionarioNoArray() {
		
		Empresa empresa = new Empresa();
		int ultimaPosicao = 0;
		for (int i = 0; i < 5; i++) {
	        Funcionario f = new Funcionario();
	        f.setSalario(1000 + i * 100);
	        ultimaPosicao = empresa.adicionar(f);
	    }
		Assert.assertEquals(4, ultimaPosicao);	
	}
	
	
}
