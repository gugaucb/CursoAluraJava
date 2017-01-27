package me.costa.gustavo.java1.aulas;

import java.util.Scanner;

import me.costa.gustavo.java1.exercicios.BalancoTrimestral;
import me.costa.gustavo.java1.exercicios.Exercicio3;
import me.costa.gustavo.java1.exercicios.IExercicio;
import me.costa.gustavo.java1.main.App;

public class AulaDois extends AbstractAula {

	
	
	@Override
	public void gerarMenu() {
		StringBuilder menu = new StringBuilder();
		menu.append("==== Aula 2 ====\n");
		menu.append("1 - Exercicio 1 e 2\n");
		menu.append("2 - Exercicio 3\n");
		menu.append("16 - Retornar Menu Principal\n");
		menu.append("15 - Sair\n");
		System.out.println(menu);
		String opcaoMenu = recuperaOpcaoMenu();
		executaExercicio(opcaoMenu);
		
	}

	private void executaExercicio(String opcaoMenu) {
		switch (opcaoMenu) {
		case "1":
			executar(new BalancoTrimestral());
			gerarMenu();
			break;
		case "2":
			executar(new Exercicio3());
			gerarMenu();
			break;
		case "15":
			System.out.println("Bye!");
			Runtime.getRuntime().exit(0);
			break;
		case "16":
			App.cleanConsole();
			break;
		default:
			gerarMenu();
			break;
		}
	}

	
	
	private void executar(IExercicio exercicio) {
		
		exercicio.executarExercicio();
		
	}
	
	
	

}
