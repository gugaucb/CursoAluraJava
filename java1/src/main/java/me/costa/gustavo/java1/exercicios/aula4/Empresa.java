package me.costa.gustavo.java1.exercicios.aula4;

import me.costa.gustavo.java1.exercicios.aula3.Funcionario;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios = new Funcionario[10];

	/***
	 * 
	 * @param funcionario
	 * @return posição no Array
	 */
	public int adicionar(Funcionario funcionario){
		int posicaoVazia = recuperarPosicaoVaziaFuncionarios();
		getFuncionarios()[posicaoVazia]=funcionario;
		return posicaoVazia;
	}
	
	private int recuperarPosicaoVaziaFuncionarios(){
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i]==null){
				return i;
			}
		}
		throw new ArrayIndexOutOfBoundsException("Lista cheia.");
	}
	
	
	public Funcionario[] getFuncionarios() {
		return this.funcionarios;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String mostraEmpregados() {
		Funcionario[] funcionarios = getFuncionarios();
		String mensagem = new String();
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i]!=null){
				mensagem+="Funcionário na posição: " + i+"\n";
				mensagem+="R$" + funcionarios[i].getSalario();
			}
        }
		System.out.println(mensagem);
		return mensagem;
	}

	public String mostraTodasAsInformacoes() {
		String retorno = new String();
		for (Funcionario funcionario : funcionarios) {
			if(funcionario!=null){
				retorno+=funcionario.mostrar();
			}
		}
		return retorno;
	}

	public boolean contem(Funcionario funcionario1) {
		boolean retorno = false;
		for (Funcionario funcionario : funcionarios) {
			if(funcionario!=null && funcionario.equals(funcionario1)){
				retorno = true;
			}
		}
		return retorno;
	}

}
