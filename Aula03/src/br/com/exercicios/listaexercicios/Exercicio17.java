package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio17 implements Exercicio {

	private final int HORAS_EM_SEGUNDOS = 3600;
	
	@Override
	public void run() {
		
		System.out.println("17. Escreva um programa que leia um valor inteiro correspondente a\n"
				+ "uma quantidade de segundos, convertendo o valor dado em horas corridas sabendo\n"
				+ "que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o\n"
				+ "usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de\n"
				+ "conversão não deve ser efetuada.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor em segundos: ");
		int x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("Informe um valor positivo!");
		}
		else {
			System.out.printf("O valor em horas é: %.2f h", (float) x / this.HORAS_EM_SEGUNDOS);
		}
	}

}
