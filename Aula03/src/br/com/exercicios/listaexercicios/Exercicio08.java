package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio08 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("8. Leia tr�s n�meros inteiros fornecidos pelo usu�rio. \n"
				+ "Descubra qual deles � o maior de todos, imprimindo seu valor.\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();
		System.out.print("Digite um valor para C: ");
		int c = input.nextInt();
		
		int maior = ((int) (Math.pow(2, 32)/2)*(-1) );// menor valor possível de int
		
		maior = (((a>b) && (a>c)) ? a : maior );
		maior = (((b>a) && (b>c)) ? b : maior );
		maior = (((c>a) && (c>b)) ? c : maior );
		
		System.out.print( " O maior valor digitado foi " + maior );
	}

}
