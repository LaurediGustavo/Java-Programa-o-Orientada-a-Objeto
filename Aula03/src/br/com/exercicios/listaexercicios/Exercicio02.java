package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio02 implements Exercicio{
	
	@Override
	public void run() {
		
		System.out.println("\n2. 	Escreva um programa que leia um n�mero real fornecido pelo usu�rio, \n"
				+ "armazenando-o numa vari�vel apropriada. Imprima o valor lido.\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		System.out.println("O valor lido foi: " + valor);		
	}
	
}
