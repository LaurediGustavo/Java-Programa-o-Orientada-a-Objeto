package br.com.exercicios.listaexercicios;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio29 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("29. Fa�a um programa que exiba a tabela verdade da opera��o OU-L�gico\n"
				+ "para todas as combina��es de tr�s vari�veis l�gicas A, B e C. Os resultados da\n"
				+ "tabela devem ser exibidos como F ou V.\n");
		
		tabelaVerdade(true, true, true);
		tabelaVerdade(true, true, false);
		tabelaVerdade(true, false, true);
		tabelaVerdade(true, false, false);
		tabelaVerdade(false, true, true);
		tabelaVerdade(false, false, true);
		tabelaVerdade(false, true, false);
		tabelaVerdade(false, false, false);
	}

	private void tabelaVerdade(boolean a, boolean b, boolean c) {
		System.out.println(a + " || " + b + " || " + c + " = " + (a || b || c? "V" : "F"));
	}
	
}
