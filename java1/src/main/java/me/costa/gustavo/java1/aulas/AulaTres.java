package me.costa.gustavo.java1.aulas;

import me.costa.gustavo.java1.exercicios.IExercicio;
import me.costa.gustavo.java1.exercicios.aula3.Exercicio1;
import me.costa.gustavo.java1.main.App;

public class AulaTres extends AbstractAula {

	
	
	@Override
	public void gerarMenu() {
		StringBuilder menu = new StringBuilder();
		menu.append("==== Aula 3 ====\n");
		menu.append("1 - Exercicio 1\n");
		menu.append("2 - Exercicio 2\n");
		menu.append("3 - Exercicio 3\n");
		menu.append("4 - Exercicio 4\n");
		menu.append("5 - Exercicio 5\n");
		menu.append("6 - Exercicio 6\n");
		menu.append("7 - Exercicio 7\n");
		menu.append("8 - Exercicio 8\n");
		menu.append("9 - Exercicio 9\n");
		menu.append("16 - Retornar Menu Principal\n");
		menu.append("15 - Sair\n");
		System.out.println(menu);
		String opcaoMenu = recuperaOpcaoMenu();
		executaExercicio(opcaoMenu);
		
	}

	private void executaExercicio(String opcaoMenu) {
		switch (opcaoMenu) {
		case "1":
			executar(new me.costa.gustavo.java1.exercicios.aula3.Exercicio1());
			break;
		case "2":
			executar(new me.costa.gustavo.java1.exercicios.aula3.Exercicio4());
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
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
