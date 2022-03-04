package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio06 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("6. Escreva um programa que leia dois valores, os quais denominaremos A e B, \n"
				+ "fornecidos pelo usuário, exibindo respostas\n"
				+ "F ou V para as seguintes questões:\n"
				+ "(a) A é maior que zero?\n"
				+ "(b) B é maior que zero; \n"
				+ "(c) A E B são maiores do que zero?\n"
				+ "Use operadores lógicos para formular as expressões necessárias a avaliação dos valores.\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" (a) A é maior que zero? " + ((a >0) ? "verdadeiro" : "falso"));
		System.out.println(" (b) B é maior que zero?"  + ((b >0) ? "verdadeiro" : "falso"));
		System.out.println(" (c) A E B são maiores do que zero?" + (((a >0)&&(b >0)) ? "verdadeiro" : "falso"));
		
	}
}
