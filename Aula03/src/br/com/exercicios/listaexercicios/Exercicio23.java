package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio23 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("23. Escreva um programa que receba as seguintes informa��es: um valor real\n"
				+ "indicando capital inicial PV, um valor real que corresponde a taxa de juros da aplica��o\n"
				+ "J e um n�mero inteiro de per�odos da aplica��o N. O programa deve retornar o capital\n"
				+ "futuro FV dado pela rela��o abaixo: FV = PV * ( 1 + J )N\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Capital inicial: ");
		double pv = sc.nextDouble();
		System.out.println("Taxa de juros: ");
		double j = sc.nextDouble();
		System.out.println("Per�odo da aplica��o: ");
		int n = sc.nextInt();
		
		double fv = pv * Math.pow((1 + j), n); 
		
		System.out.println("FV = " + fv);
	}

}
