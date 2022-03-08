package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio26 implements Exercicio {

	@Override
	public void run() {
		System.out.println("26. Escreva um programa que calcule a soma de N n�meros quaisquer fornecidos\n"
				+ "pelo usu�rio. O programa deve parar de ler e, portanto somar os valores quando for\n"
				+ "introduzido o n�mero 0 (zero).\n");
		
		int valor, soma = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o valor: ");
			valor = sc.nextInt();
			
			soma += valor; 		
		}
		while(valor != 0);
		
		System.out.println("A soma �: " + soma);
	}
	
}
