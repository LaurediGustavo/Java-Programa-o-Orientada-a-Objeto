package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio14 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("14. Escreva um programa que leia 3 notas (valores reais), calculando e\n"
				+ "exibindo sua média aritmética. Imprima também \"Aprovado\" se a média for maior que 7,\n"
				+ "\"Reprovado\" se for menor que 3 e \"Exame\" se estiver entre 3 e 7.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota 1: ");
		float n1 = sc.nextFloat();
		System.out.println("Nota 2: ");
		float n2 = sc.nextFloat();
		System.out.println("Nota 3: ");
		float n3 = sc.nextFloat();
		
		float media = (n1 + n2 + n3) / 3;
		
		if (media > 6) {
			System.err.println("Média " + media + " - Aprovado!");
		}
		else if (media > 3 && media < 7) {
			System.err.println("Média " + media + " - Exame!");
		}
		else {
			System.err.println("Média " + media + " - Reprovado!");
		}
		
	}
	
}
