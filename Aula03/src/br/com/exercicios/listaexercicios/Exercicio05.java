package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio05 implements Exercicio {
	
	@Override
	public void run() {
		
		System.out.println("5. Dado um n�mero inteiro qualquer, fornecido pelo usu�rio, \n"
				+ "descobrir se o mesmo � par ou �mpar.\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		if ( (valor % 2) == 0 ) {
			System.out.println("O valor lido " + valor + "  � par! ");
		} else {
			System.out.println("O valor lido " + valor + "  � impar! ");
		}
		
		
	}
}
