package me.costa.gustavo.java1.aulas;

import me.costa.gustavo.java1.exercicios.aula2.BalancoTrimestral;
import me.costa.gustavo.java1.exercicios.aula2.Exercicio3;
import me.costa.gustavo.java1.exercicios.aula2.Exercicio4;
import me.costa.gustavo.java1.exercicios.aula2.Exercicio5;
import me.costa.gustavo.java1.exercicios.aula2.Exercicio6;
import me.costa.gustavo.java1.exercicios.aula2.Exercicio8;
import me.costa.gustavo.java1.main.App;

public class AulaDois extends AbstractAula {

	
	
	@Override
	public void gerarMenu() {
		StringBuilder menu = new StringBuilder();
		menu.append("==== Aula 2 ====\n");
		menu.append("1 - Exercicio 1 e 2\n");
		menu.append("2 - Exercicio 3\n");
		menu.append("3 - Exercicio 4\n");
		menu.append("4 - Exercicio 5\n");
		menu.append("5 - Exercicio 6\n");
		menu.append("6 - Exercicio 8\n");
		menu.append("16 - Retornar Menu Principal\n");
		menu.append("15 - Sair\n");
		System.out.println(menu);
		String opcaoMenu = recuperaOpcaoMenu();
		executaExercicio(opcaoMenu);
		
	}

	protected void executaExercicio(String opcaoMenu) {
		switch (opcaoMenu) {
		case "1":
			executar(new BalancoTrimestral());
			gerarMenu();
			break;
		case "2":
			executar(new Exercicio3());
			gerarMenu();
			break;
		case "3":
			executar(new Exercicio4());
			gerarMenu();
			break;
		case "4":
			executar(new Exercicio5());
			gerarMenu();
			break;
		case "5":
			executar(new Exercicio6());
			gerarMenu();
			break;
		case "6":
			executar(new Exercicio8());
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

	
	
	
	
	

}
