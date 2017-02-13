package me.costa.gustavo.java1.exercicios.aula3;

import me.costa.gustavo.java1.exercicios.IExercicio;

public class Exercicio4 implements IExercicio {

	@Override
	public void executarExercicio() {
		 Funcionario f1 = new Funcionario();        
	        f1.setNome("Danilo");
	        f1.setSalario(100);

	        Funcionario f2 = new Funcionario();        
	        f2.setNome("Danilo");
	        f2.setSalario(100);

	        
	        if (equalObjets(f1, f2)) {
	            System.out.println("iguais");
	        } else {
	            System.out.println("diferentes");        
	        }

	}

	public boolean equalObjets(Funcionario funcionario1, Funcionario funcionario2) {
		if (funcionario1 == funcionario2) {
		   return true;
		} else {
		    return false;        
		}
	}

}
