package me.costa.gustavo.java1.exercicios.aula2;

import me.costa.gustavo.java1.exercicios.IExercicio;

public class Exercicio8 implements IExercicio {

	@Override
	public void executarExercicio() {
		System.out.println(calculaSequencia(13));

	}
	/***
	 * se x é par, x = x / 2
     * se x é ímpar, x = 3 * x + 1
     * imprime x
     * o programa deve parar quando x == 1
	 * @param x
	 * @return Sequência 
	 */
	public String calculaSequencia(int x) {
		String sequencia = x+"";
		while(x!=1){
			sequencia+=" > ";
			if(x%2==0){
				x = x /2; 
			}else{
				x = 3*x+1;
			}
			sequencia+=x;
		}
		return sequencia;
	}

}
