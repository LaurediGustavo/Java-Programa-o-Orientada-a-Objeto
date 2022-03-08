package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio22 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("22. Considerando um objeto m�vel em movimento uniformemente variado, escreva\n"
				+ "um programa que receba as seguintes informa��es: um valor real indicando posi��o inicial\n"
				+ "do m�vel P0, um valor real que corresponde a velocidade do m�vel V, um outro valor real A\n"
				+ "correspondente a acelera��o do m�vel e um n�mero inteiro correspondente ao tempo decorrido T.\n"
				+ "O programa deve calcular a posi��o final PF do m�vel, dado pela rela��o abaixo: "
				+ "PF = P0 + V * T + (A * T2) / 2\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Posi��o inicial: ");
		double p0 = sc.nextDouble();
		System.out.println("Velocidade m�vel: ");
		double v = sc.nextDouble();
		System.out.println("Acelera��o: ");
		double a = sc.nextDouble();
		System.out.println("Tempo decorrido: ");
		int tempo = sc.nextInt();
		
		double pf = (p0 + (v * tempo) + (a * Math.pow(tempo, 2))) / 2;
		System.out.println("PF = " + pf);
	}

}
