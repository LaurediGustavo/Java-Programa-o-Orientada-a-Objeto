package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio19 implements Exercicio {

	private String[] unidade = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", 
			"oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", 
			"dezessete", "dezoito", "dezenove" };

	private String[] dezena = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta",
			"setenta", "oitenta", "noventa" };
	
	@Override
	public void run() {
		
		System.out.println("19. Escreva um programa que leia um número real entre\n"
				+ "0.00 e 100.00 e o exiba por extenso como se fosse uma quantia em\n"
				+ "dinheiro, por exemplo: 1.00 -> \"um real\", .12.73 -> \"doze reais\n"
				+ "e setenta e três centavos\".\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número entre 0.00 e 100.00: ");
		double x = sc.nextDouble();

		if (x < 0 && x > 100) {
			System.out.println("Informe um valor entre 0 e 100");
		} 
		else {
			String valor = String.valueOf(x);
			
			if (x < 20) {				
				
				System.out.println(unidade[pegarUnidade(valor)] 
						+ " reais " 
						+ retornarValorDecimal(valor));
			} 
			else if (x < 100) {
				int deze = Integer.parseInt(String.valueOf(valor.charAt(0)));
				int unid = Integer.parseInt(String.valueOf(valor.charAt(1)));
				
				System.out.println(unidadeIgualZero(unid, deze) 
						+ " reais"
						+ retornarValorDecimal(valor));
				
			} 
			else {
				System.out.println("cem reais");
			}
		}
	}
	
	private String retornarValorDecimal(String valor) {
		String v = verificarValorDecimal(valor);
		
		if (Integer.parseInt(v) < 20) {
			return " e " + unidade[Integer.parseInt(v)] + " centavos";
		} else {
			int dez = Integer.parseInt(String.valueOf(v.charAt(0)));
			int uni = Integer.parseInt(String.valueOf(v.charAt(1)));

			return " e " + unidadeIgualZero(uni, dez) + " centavos";
		}
	}
	
	private String verificarValorDecimal(String valor) {
		if(valor.length() > 4) {
			return String.valueOf(valor.charAt(3)) + String.valueOf(valor.charAt(4));
		}
		else {
			return String.valueOf(valor.charAt(2)) + String.valueOf(valor.charAt(3));
		}
	}
	
	private String unidadeIgualZero(int unidade, int dezeza) {
		if (unidade == 0) {
			return this.dezena[dezeza];
		} else {
			return this.dezena[dezeza] + " e " + this.unidade[unidade];
		}
	}
	
	private int pegarUnidade(String valor) {
		String unidade;

		if(valor.length() > 4) {
			unidade = String.valueOf(valor.charAt(0)) + String.valueOf(valor.charAt(1));
		}
		else {
			unidade = String.valueOf(valor.charAt(0));
		}

		return Integer.parseInt(unidade);
	}

}