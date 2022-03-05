package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio12 implements Exercicio{

	private final float MENOR_IGUAL100 = 0.05f;
	private final float MAIOR_101_IGUAL_500 = 0.04f;
	private final float MAIOR_500 = 0.035f;
	
	@Override
	public void run() {
		
		System.out.println("12. Escreva um programa capaz de calcular o preço total a ser pago \n"
				+ "por uma compra de copos plásticos. O usuário deve fornecer o número de copos \n"
				+ "a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.\n"
				+ "Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05;\n"
				+ "se o número de copos está entre 101 e 500, o preço por copo é R$0.04; \n"
				+ "finalmente se o número de copos é superior a 500 o preço por copo é R$0.035.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de copos: ");
		int qtde = sc.nextInt();
		
		double valor;
		
		if(qtde <= 100) {
			valor = qtde * this.MENOR_IGUAL100;
		}
		else if(qtde > 100 && qtde <= 500) {
			valor = qtde * this.MAIOR_101_IGUAL_500;
		}
		else {
			valor = qtde * this.MAIOR_500;
		}
		
		System.out.printf("O valor a ser pago é: R$ %.2f", valor);
	}

}
