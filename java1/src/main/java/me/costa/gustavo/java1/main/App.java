package me.costa.gustavo.java1.main;

import java.io.IOException;
import java.util.Scanner;

import me.costa.gustavo.java1.aulas.AulaDois;
import me.costa.gustavo.java1.aulas.AulaTres;

/**
 * Classe principal que será executada ao iniciar o jar.
 **/
public class App {
	public static void main(String[] args) {
				principal();
	}

	private static void principal() {
		gerarMenu();
		String opcaoMenu = recuperaOpcaoMenu();
		
		switch (opcaoMenu) {
		case "1":
			AulaDois aulaDois = new AulaDois();
			aulaDois.gerarMenu();
			principal();
			break;
		case "2":
			AulaTres aulaTres = new AulaTres();
			aulaTres.gerarMenu();
			principal();
			break;
		case "15":
			System.out.println("Bye!");
			Runtime.getRuntime().exit(0);
			break;
		default:
			gerarMenu();
			break;
		}
	}

	private static void gerarMenu() {
		StringBuilder menu = new StringBuilder();
		menu.append("==== Menu Principal ====\n");
		menu.append("1 - Aula 2\n");
		menu.append("15 - Sair\n");
		cleanConsole();
		System.out.println(menu);
	}
	
	private static String recuperaOpcaoMenu(){
		System.out.print("Digita a opcao do menu: ");
		Scanner scanner = new Scanner(System.in);
		String opcaoMenu = scanner.nextLine();
		return opcaoMenu;
	}
	
	public static void cleanConsole() {
		try {
			Runtime.getRuntime().exec("cls");
		} catch (IOException e) {
			for(int i = 0; i < 1000; i++)
			{
			    System.out.println("\b");
			}
		}
	}

}
