package me.costa.gustavo.java1.exercicios.aula2;

import me.costa.gustavo.java1.exercicios.IExercicio;

public class BalancoTrimestral implements IExercicio {
	/* (non-Javadoc)
	 * @see me.costa.gustavo.java1.exercicios.IExercicio#executarExercicio()
	 */
	@Override
	public void executarExercicio(){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre/3;
		System.out.println("Gasto do trimestre: R$" +gastosTrimestre);
		System.out.println("Valor da m�dia mensal = " + mediaMensal);
	}
}
