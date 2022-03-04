package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio01 implements Exercicio {
	
	@Override
	public void run() {
		
		System.out.println("\n1.  Escreva um programa que leia um número inteiro fornecido pelo usuário, \n"
				+ "armazenando-o numa variável apropriada. "
				+ "Imprima o valor lido.\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		System.out.println("O valor lido foi: " + valor);
		
	}
}
