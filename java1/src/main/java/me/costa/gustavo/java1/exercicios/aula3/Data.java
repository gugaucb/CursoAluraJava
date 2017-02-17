package me.costa.gustavo.java1.exercicios.aula3;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		String tmes = new String();
		String tdia = new String();
		if(dia>0 || dia<10){
			tdia = "0"+dia;
		}else{
			tdia+=dia;
		}
		if(mes>0 || mes<10){
			tmes = "0"+dia;
		}else{
			tmes+=mes;
		}
		
			
		String resultado = tdia+"/"+tmes+"/"+ano;
		
		return resultado;
	}
	
}
