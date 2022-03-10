package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio18 implements Exercicio {

	@Override
	public void run() {

		System.out.println("18. Escreva um programa que leia um número inteiro entre 0 e 100 e\n"
				+ "o exiba por extenso, por exemplos: 16 -> \"dezesseis\",\n" 
				+ "34 -> \"trinta e quatro\", etc.. \n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número entre 0 e 100: ");
		int x = sc.nextInt();

		String[] unidade = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", 
				"oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", 
				"dezessete", "dezoito", "dezenove" };

		String[] dezena = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta",
				"setenta", "oitenta", "noventa" };

		if (x < 0 && x > 100) {
			System.out.println("Informe um valor entre 0 e 100");
		} 
		else {
			if (x < 20) {
				System.out.println(unidade[x]);
			} 
			else if (x < 100) {
				String valor = String.valueOf(x);

				int deze = Integer.parseInt(String.valueOf(valor.charAt(0)));
				int unid = Integer.parseInt(String.valueOf(valor.charAt(1)));
				
				if(unid < 1) {
					System.out.println(dezena[deze]);
				}
				else {
					System.out.println(dezena[deze] + " e " + unidade[unid]);
				}
			} 
			else {
				System.out.println("cem");
			}
		}
	}

}
