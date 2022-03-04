package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio09 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("9. Leia três números reais fornecidos pelo usuário. Descubra qual \n"
				+ "deles é o menor de todos, imprimindo seu valor.\n");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();
		System.out.print("Digite um valor para C: ");
		int c = input.nextInt();

		int menor = ((int) (Math.pow(2, 32) / 2) - 1);// maior valor possÃ­vel de int

		menor = (((a < b) && (a < c)) ? a : menor);
		menor = (((b < a) && (b < c)) ? b : menor);
		menor = (((c < a) && (c < b)) ? c : menor);

		System.out.print(" O menor valor digitado foi " + menor);
	}

}
