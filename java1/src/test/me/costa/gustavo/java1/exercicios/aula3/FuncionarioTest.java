package me.costa.gustavo.java1.exercicios.aula3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FuncionarioTest {
	
	
	@Test
	public void testRecebeAumento() {
		Funcionario funcionario = new Funcionario();
		double salarioComAumento = funcionario.recebeAumento(10);
		Assert.assertEquals(110.0, salarioComAumento);
	}

	@Test
	public void testCalculaGanhoAnual() {
		Funcionario funcionario = new Funcionario();
		double ganhoAnual = funcionario.calculaGanhoAnual();
		Assert.assertEquals(1200.0, ganhoAnual);
	}

	@Test
	public void deveRecuperarOsAtributosDoObjetoFuncionario(){
		Funcionario funcionario = new Funcionario(100.0,"01/01/2017", "12345");
		StringBuilder builder = new StringBuilder();
		builder.append("Salario: R$100.0\n");
		builder.append("RG: 12345\n");
		builder.append("Data de Entrada no Banco: 01/01/2017\n");
		Assert.assertEquals(builder.toString(), funcionario.toString());
	}
}
