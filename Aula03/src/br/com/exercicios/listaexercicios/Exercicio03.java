package br.com.exercicios.listaexercicios;
import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio03 implements Exercicio{
	
	@Override
	public void run() {
		
		System.out.println("3.   Leia um n�mero qualquer fornecido pelo usu�rio. \n"
				+ "Determine se o n�mero � maior do que 50, imprimindo uma mensagem \n"
				+ "indicando tal fato.\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor > 50){
			System.out.println("O valor lido " + valor + " eh maior que 50!");
		}
	}
}
