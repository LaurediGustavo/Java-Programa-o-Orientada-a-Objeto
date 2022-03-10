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
			if (x < 20) {
				String valor = String.valueOf(x);
				
				String deze, s;
				int v;
				if(valor.length() > 4) {
					deze = String.valueOf(valor.charAt(0)) + String.valueOf(valor.charAt(1));
					v = Integer.parseInt(deze);
				}
				else {
					deze = String.valueOf(valor.charAt(0));
					v = Integer.parseInt(deze);
				}
				
				System.out.println(unidade[v] + " reais " + retornarValorDecimal(valor));
			} 
			else if (x < 100) {
				String valor = String.valueOf(x);

				int deze = Integer.parseInt(String.valueOf(valor.charAt(0)));
				int unid = Integer.parseInt(String.valueOf(valor.charAt(1)));
				
				String j = "";
				
				if(unid < 1) {
					j += dezena[deze] + " reais";
				}
				else {
					j += dezena[deze] + " e " + unidade[unid] + " reais";
				}
				
				j += retornarValorDecimal(valor);
				
				System.out.println(j);
				
			} 
			else {
				System.out.println("cem reais");
			}
		}
	}
	
	private String retornarValorDecimal(String valor) {
		String s;
		if(valor.length() > 4) {
			s = String.valueOf(valor.charAt(3)) + String.valueOf(valor.charAt(4));
		}
		else {
			 s = String.valueOf(valor.charAt(2)) + String.valueOf(valor.charAt(3));
		}

		String retorno = "";
		
		if (Integer.parseInt(s) < 20) {
			retorno += " e " + unidade[Integer.parseInt(s)] + " centavos";
		} else {
			int dez = Integer.parseInt(String.valueOf(s.charAt(0)));
			int uni = Integer.parseInt(String.valueOf(s.charAt(1)));

			if (uni < 1) {
				retorno += " e " + dezena[dez] + " centavos";
			} else {
				retorno += " e " + dezena[dez] + " e " + unidade[uni] + " centavos";
			}
		}

		return retorno;
	}

}
