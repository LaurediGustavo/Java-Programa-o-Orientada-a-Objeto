package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio06 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("6. Escreva um programa que leia dois valores, os quais denominaremos A e B, \n"
				+ "fornecidos pelo usu�rio, exibindo respostas\n"
				+ "F ou V para as seguintes quest�es:\n"
				+ "(a) A � maior que zero?\n"
				+ "(b) B � maior que zero; \n"
				+ "(c) A E B s�o maiores do que zero?\n"
				+ "Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores.\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" (a) A � maior que zero? " + ((a >0) ? "verdadeiro" : "falso"));
		System.out.println(" (b) B � maior que zero?"  + ((b >0) ? "verdadeiro" : "falso"));
		System.out.println(" (c) A E B s�o maiores do que zero?" + (((a >0)&&(b >0)) ? "verdadeiro" : "falso"));
		
	}
}
