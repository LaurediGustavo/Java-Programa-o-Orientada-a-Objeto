package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio21 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("21. Faça um algoritmo que, lendo 3 números correspondentes aos\n"
				+ "coeficientes a, b, e c de uma equação do 2º grau, calcule\n"
				+ "seu DELTA e também as raízes desta equação, imprimindo seus valores.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de a: ");
		double a = sc.nextDouble();
		System.out.println("Informe o valor de b: ");
		double b = sc.nextDouble();
		System.out.println("Informe o valor de c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) + 4 * a * c;
		System.out.println("\nO valor de delta é: " + delta);
		
		if(delta >= 0) {
			calcularRaiz(delta, a, b);
		}
		else {
			System.out.println("\nDelta não possui raiz.");
		}
		
	}
	
	private void calcularRaiz(double delta, double a, double b) {
        double x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
        double x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
        System.out.println("\nx1 = " + x1);
        System.out.println("\nx2 = " + x2);
	}

}
