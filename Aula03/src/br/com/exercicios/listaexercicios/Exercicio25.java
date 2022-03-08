package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio25 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("25. Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de números que será informado: ");
		int soma = 0, i = 1, valor = sc.nextInt();

		while(i <= valor) {
			
			System.out.println("Informe o " + i + "° valor: ");
			soma += sc.nextInt();
			
			i++;
		}
		
		System.out.println("A soma é: " + soma);
		
	}

}
