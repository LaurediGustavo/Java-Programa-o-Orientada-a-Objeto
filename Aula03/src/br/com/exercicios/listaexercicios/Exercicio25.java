package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio25 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("25. Fa�a um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de n�meros que ser� informado: ");
		int soma = 0, i = 1, valor = sc.nextInt();

		while(i <= valor) {
			
			System.out.println("Informe o " + i + "� valor: ");
			soma += sc.nextInt();
			
			i++;
		}
		
		System.out.println("A soma �: " + soma);
		
	}

}
