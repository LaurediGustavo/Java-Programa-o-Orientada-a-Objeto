package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio16 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("16. Preparar um programa para ler as medidas da base e da altura de um\n"
				+ "tri�ngulo, calculando e imprimindo sua �rea, sabendo que o c�lculo da �rea �\n"
				+ "dado por: area = (base*altura)/2\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Base: ");
		float base = sc.nextFloat();
		System.out.println("Altura: ");
		float altura = sc.nextFloat();
		
		float media = (base * altura) / 2;
		
		System.out.println("A �rea �: " + media);
	}
	
}
