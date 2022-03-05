package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio15 implements Exercicio {

	@Override
	public void run() {
		System.out.println("15. Escreva um programa que realize as seguintes tarefas:\n"
				+ "a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;\n"
				+ "b) Realize a soma dos valores x e y, exibindo seu resultado;\n"
				+ "c) Realize o produto dos valores x e y exibindo seu resultado;\n"
				+ "d) Compare os valores x e y, indicando se \"X > Y\", \"X = Y\" e \"X < Y\"\n"
				+ "para os casos correspondentes.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor 1: ");
		int x = sc.nextInt();
		System.out.println("Valor 2: ");
		int y = sc.nextInt();
		
		System.out.println("\nSoma: " + (x + y) + "\n");
		System.out.println("Produto: " + (x * y) + "\n");
		
		if (x > y) {
			System.out.println("x > y");
		}
		else if (x == y) {
			System.out.println("x = y");
		}
		else {
			System.out.println("x < y");
		}
	}
	
	
}
