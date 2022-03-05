package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio13 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("13. Dados 3 valores reais representando os lados de um poss�vel tri�ngulo,\n"
				+ "verifique se os mesmos formam um tri�ngulo (a medida de qualquer um de seus lados\n"
				+ "deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um\n"
				+ "tri�ngulo, descubra tamb�m se este tri�ngulo � escaleno (tr�s lados diferentes),\n"
				+ "is�sceles (dois lados iguais) ou eq�il�tero (tr�s lados iguais).\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o lado A: ");
		float a = sc.nextFloat();
		System.out.println("Informe o lado B: ");
		float b = sc.nextFloat();
		System.out.println("Informe o lado C: ");
		float c = sc.nextFloat();
		
		if(!((a < b + c) && (b < a + c) && (c < b + a))) {
			System.out.println("N�o � um tri�ngulo!");
		}
		else {
			trianguloEscaleno(a, b, c);
			trianguloIsosceles(a, b, c);
			trianguloEquilatero(a, b, c);
		}
	}
	
	private void trianguloEscaleno(float... lados) {
		if(lados[0] != lados[1] &&
		   lados[1] != lados[2] &&
		   lados[2] != lados[0]) 
		{
			System.out.println("� um tri�ngulo Escaleno");
		}
	}
	
	private void trianguloIsosceles(float... lados) {
		if ((lados[0] == lados[1] && lados[1] != lados[2]) ||
			(lados[1] == lados[2] && lados[2] != lados[0]) ||
			(lados[2] == lados[0] && lados[1] != lados[0]))
		{
			System.out.println("� um tri�ngulo Is�sceles");
		}
	}
	
	private void trianguloEquilatero(float... lados) {
		if(lados[0] == lados[1] &&
		   lados[1] == lados[2]) 
		{
			System.out.println("� um tri�ngulo Eq�il�tero");
		}
	}

}
