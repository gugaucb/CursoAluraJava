package me.costa.gustavo.java1.exercicios.aula3;

import java.text.SimpleDateFormat;
import java.util.Date;

/***Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, 
 * seu salário (double), a data de entrada no banco (String) e seu RG (String).
 * 
 * Você deve criar alguns métodos de acordo com sua necessidade. 
 * Além deles, crie um método recebeAumento que aumenta o salario do funcionário de acordo com o
 * parâmetro passado como argumento. Crie também um método calculaGanhoAnual, que não recebe 
 * parâmetro algum, devolvendo o valor do salário multiplicado por 12..
 * 
 * A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes e o que 
 * um funcionário faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.*/

public class Funcionario {
	private double salario=100;
	private Data dataEntradaBanco;
	private String RG;
	private String nome;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, double salario, Data dataEntradaBanco, String rG) {
		super();
		this.salario = salario;
		this.dataEntradaBanco = dataEntradaBanco;
		RG = rG;
	}

	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntradaBanco() {
		return dataEntradaBanco;
	}

	public void setDataEntradaBanco(Data dataEntradaBanco) {
		this.dataEntradaBanco = dataEntradaBanco;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double recebeAumento(double aumento){
		this.salario+=aumento;
		return this.salario;
	}
	
	public double getGanhoAnual(){
		return this.salario*12;
	}
	
	public String mostrar(){
		String dadosFuncionario = this.toString();
		System.out.println(dadosFuncionario);
		return dadosFuncionario;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Salario: R$"+this.salario+"\n");
		builder.append("RG: "+this.RG+"\n");
		builder.append("Data de Entrada no Banco: "+this.dataEntradaBanco.toString()+"\n");
		return builder.toString();
	}
	
	
}
