package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio20 implements Exercicio {

	private final float UM_METRO_EM_PES = 3.315f;
	
	@Override
	public void run() {
		
		System.out.println("20. Escreva um programa que leia um valor real correspondente a uma medida em metros,\n"
				+ "convertendo o valor dado em p�s (1 metro = 3.315 p�s), exibindo os valores dado e convertido.\n"
				+ "Caso o usu�rio forne�a um valor negativo, deve ser exibida uma mensagem e a opera��o de\n"
				+ "convers�o n�o deve ser efetuada.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor em metros: ");
		float x = sc.nextFloat();
		
		if(x < 0) {
			System.out.println("Informe um valor positivo.");
		}
		else {
			System.out.println(x + " metros = " + (x * this.UM_METRO_EM_PES) + " pes");
		}
		
	}
	
}
