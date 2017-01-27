package me.costa.gustavo.java1.aulas;

import java.util.Scanner;

import me.costa.gustavo.java1.main.App;

public class AbstractAula implements IAulas {

	@Override
	public void gerarMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public String recuperaOpcaoMenu() {
		System.out.print("Digita a opcao do menu: ");
		Scanner scanner = new Scanner(System.in);
		String opcaoMenu = scanner.nextLine();
		return opcaoMenu;
	}

	@Override
	public void retornarMenuPrincipal() {
		App app = new App();
		
	}

}
