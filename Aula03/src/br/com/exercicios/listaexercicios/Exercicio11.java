package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio11 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("11. Escreva um programa que leia dois n�meros inteiros A e B quaisquer\n"
				+ "indicando se A � m�ltiplo de B ou se B � m�ltiplo de A.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Segundo n�mero: ");
		int n2 = sc.nextInt();
		
		verificarMultiplo(n1, n2);
		verificarMultiplo(n2, n1);
	}
	
	private void verificarMultiplo(int n1, int n2) {
		String texto;
		
		if(n1 > n2) {
			int valor1 = n1 / n2;
			valor1 *= n2;
			texto = n1 + (valor1 == n1? " �": " n�o �") + " multiplo de " + n2;
		}
		else {
			texto = n1 + " n�o �" + " multiplo de " + n2;
		}
		
		System.out.println(texto);
	}
	
}
