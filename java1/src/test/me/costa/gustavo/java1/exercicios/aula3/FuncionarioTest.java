package me.costa.gustavo.java1.exercicios.aula3;

import java.util.Calendar;
import java.util.Date;

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
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(2017, 0, 1, 0, 0, 0);
		Date date = cal.getTime(); // get back a Date object
		Funcionario funcionario = new Funcionario("Funcionario",100.0,date, "12345");
		StringBuilder builder = new StringBuilder();
		builder.append("Salario: R$100.0\n");
		builder.append("RG: 12345\n");
		builder.append("Data de Entrada no Banco: 01/01/2017\n");
		Assert.assertEquals(builder.toString(), funcionario.toString());
	}
}
