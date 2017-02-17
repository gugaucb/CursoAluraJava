package me.costa.gustavo.java1.aulas;

import java.util.Scanner;

import me.costa.gustavo.java1.exercicios.IExercicio;
import me.costa.gustavo.java1.main.App;

public abstract class AbstractAula implements IAulas {

	protected abstract void executaExercicio(String opcaoMenu);
	
	@Override
	public String recuperaOpcaoMenu() {
		System.out.print("Digita a opcao do menu: ");
		Scanner scanner = new Scanner(System.in);
		String opcaoMenu = scanner.nextLine();
		return opcaoMenu;
	}
	
	@Override
	public void executar(IExercicio exercicio) {
		
		exercicio.executarExercicio();
		
	}
	
	@Override
	public void retornarMenuPrincipal() {
		App app = new App();
		
	}

}
