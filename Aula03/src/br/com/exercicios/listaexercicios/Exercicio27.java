package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio27 implements Exercicio {

	@Override
	public void run() {

		System.out.println("27. Calcule a média de Notas de alunos. O programa deve parar de ler valores\n"
				+ "quando for fornecido um valor negativo como nota.\n");

		double valor, media = 0;
		int count = 0;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe a nota: ");
			valor = sc.nextDouble();
			
			if(valor > -1) {
				media += valor;
				count++;
			}
		} while (valor >= 0);

		System.out.println("A média é: " + media / count);
	}

}
