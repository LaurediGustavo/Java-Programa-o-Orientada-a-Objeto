package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio22 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("22. Considerando um objeto móvel em movimento uniformemente variado, escreva\n"
				+ "um programa que receba as seguintes informações: um valor real indicando posição inicial\n"
				+ "do móvel P0, um valor real que corresponde a velocidade do móvel V, um outro valor real A\n"
				+ "correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido T.\n"
				+ "O programa deve calcular a posição final PF do móvel, dado pela relação abaixo: "
				+ "PF = P0 + V * T + (A * T2) / 2\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Posição inicial: ");
		double p0 = sc.nextDouble();
		System.out.println("Velocidade móvel: ");
		double v = sc.nextDouble();
		System.out.println("Aceleração: ");
		double a = sc.nextDouble();
		System.out.println("Tempo decorrido: ");
		int tempo = sc.nextInt();
		
		double pf = (p0 + (v * tempo) + (a * Math.pow(tempo, 2))) / 2;
		System.out.println("PF = " + pf);
	}

}
