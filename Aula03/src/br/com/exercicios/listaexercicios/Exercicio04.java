package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio04 implements Exercicio {
	
	@Override
	public void run() {
		
		System.out.println("4. Leia um n�mero qualquer fornecido pelo usu�rio. \n"
				+ "Determine se o n�mero � maior do que 100, imprimindo uma\n"
				+ "mensagem indicando que o \"valor � maior que 100\" ou uma mensagem \n"
				+ "indicando que o \"valor � menor ou igual a 100\". \n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor < 100){
			System.out.println("O valor lido " + valor + " eh menor que 100!");
		}else {
			System.out.println("O valor lido " + valor + " eh maior ou igual a 100!");
		}
	}
}
