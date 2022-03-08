package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio24 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("24. Implementar três programas para exibir a tabuada de um número\n"
				+ "inteiro entre 1 e 20 dado pelo usuário.\n"
				+ "a) Usando enquanto (while)\n"
				+ "b) Usando faça-enquanto (do-while)\n"
				+ "c) Usando para (for)\n"
				+ " Obs. Caso o valor dado seja inválido o programa deve apenas exibir uma mensagem de aviso.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor: ");
		int valor = sc.nextInt();
		
		if (valor < 21 && valor > 0) {
			tabuadaEmWhile(valor);
			tabuadaEmDoWhile(valor);
			tabuadaEmFor(valor);
		}
		else {
			System.out.println("Valor inválido!");
		}
		
	}

	private void tabuadaEmFor(int valor) {
		System.out.println("\n");
		System.out.println("Tabuada em For");
		
		for(int i = 1; i < 11; i++) {
			System.out.println(valor + " x " + i + " = " + i * valor);
		}
	}

	private void tabuadaEmDoWhile(int valor) {
		System.out.println("\n");
		System.out.println("Tabuada em Do While");
		
		int i = 1;
		do {
			System.out.println(valor + " x " + i + " = " + i * valor);
			i++;
		}
		while(i < 11);
	}

	private void tabuadaEmWhile(int valor) {
		System.out.println("\n");
		System.out.println("Tabuada em While");
		
		int i = 1;
		while(i < 11) {
			System.out.println(valor + " x " + i + " = " + i * valor);
			i++;
		}
	}

}
