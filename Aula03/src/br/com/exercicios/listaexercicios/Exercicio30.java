package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio30 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("30. Escreva um programa que calcule o valor de y = f(x) = a*x + b num\n"
				+ "intervalo de valores de x, sendo dados pelo usuário os coeficientes a e b, bem\n"
				+ "como os valores do limite inferior e superior do intervalo de x bem como o valor\n"
				+ "do incremento de x. O programa deve exibir resultados como um tabela onde constam\n"
				+ "os valores de x e y=f(x) lado a lado.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Coeficiente a: ");
		int a = sc.nextInt();
		System.out.println("Coeficiente b: ");
		int b = sc.nextInt();
		System.out.println("Limite inferior x: ");
		int lix = sc.nextInt();
		System.out.println("Limite superior x: ");
		int lsx = sc.nextInt();
		System.out.println("Valor de incremento de x: ");
		int vix = sc.nextInt();
		
		while(lix <= lsx) {
			int y = (a * lix) + b;
			
			System.out.println("x = " + lix + " e " + "y = " + y);
			lix += vix;
		}
		
	}

}
