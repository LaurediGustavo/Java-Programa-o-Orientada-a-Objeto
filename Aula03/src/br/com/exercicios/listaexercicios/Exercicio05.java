package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio05 implements Exercicio {
	
	@Override
	public void run() {
		
		System.out.println("5. Dado um número inteiro qualquer, fornecido pelo usuário, \n"
				+ "descobrir se o mesmo é par ou ímpar.\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		if ( (valor % 2) == 0 ) {
			System.out.println("O valor lido " + valor + "  é par! ");
		} else {
			System.out.println("O valor lido " + valor + "  é impar! ");
		}
		
		
	}
}
