package me.costa.gustavo.java1.aulas;

import me.costa.gustavo.java1.exercicios.IExercicio;

public interface IAulas {
	public void gerarMenu();
	public String recuperaOpcaoMenu();
	public void retornarMenuPrincipal();
	public void executar(IExercicio exercicio);
}