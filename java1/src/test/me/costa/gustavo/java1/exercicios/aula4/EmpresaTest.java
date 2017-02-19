package me.costa.gustavo.java1.exercicios.aula4;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import me.costa.gustavo.java1.exercicios.aula3.Data;
import me.costa.gustavo.java1.exercicios.aula3.Funcionario;

public class EmpresaTest {

	@Test
	public void testAdicionar() {
		Empresa empresa = new Empresa();
		int posicao = empresa.adicionar(new Funcionario("Gustavo", 1000, new Data(19, 2, 2017), "123"));
		Assert.assertEquals(0, posicao);
		
	}

	@Test
	public void testGetFuncionarios() {
		Empresa empresa = new Empresa();
		int posicao = empresa.adicionar(new Funcionario("Gustavo", 1000, new Data(19, 2, 2017), "123"));
		Assert.assertEquals(10, empresa.getFuncionarios().length);
	}

	@Test
	public void deveMostrarFuncionariosInseridos() {
		Empresa empresa = new Empresa();
		
		int posicao = empresa.adicionar(new Funcionario("Gustavo", 1000, new Data(19, 2, 2017), "123"));
		String mensagem = "Funcionário na posição: " + posicao+"\n";
        mensagem+="R$" + empresa.getFuncionarios()[posicao].getSalario();
        
		Assert.assertEquals(mensagem, empresa.mostraEmpregados());
	}
	
	@Test
	public void deveMostrarTodosDadosDosFuncionariosInseridos() {
		Empresa empresa = new Empresa();
		
	
		Funcionario funcionario = new Funcionario("Funcionario",100.0,new Data(1, 1, 2017), "12345");
		int posicao = empresa.adicionar(funcionario);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Salario: R$100.0\n");
		builder.append("RG: 12345\n");
		builder.append("Data de Entrada no Banco: 01/01/2017\n");
		
		Assert.assertEquals(builder.toString(), empresa.mostraTodasAsInformacoes());
        
	}
	
	@Test
	public void deveConterFuncionariosInseridos() {
		Empresa empresa = new Empresa();
		
		Funcionario funcionario = new Funcionario("Gustavo", 1000, new Data(19, 2, 2017), "123");
		int posicao = empresa.adicionar(funcionario);
        
		Assert.assertEquals(true, empresa.contem(funcionario));
	}
	
	
}
