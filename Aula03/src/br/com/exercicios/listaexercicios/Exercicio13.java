package br.com.exercicios.listaexercicios;

import java.util.Scanner;

import br.com.exercicios.inteface.Exercicio;

public class Exercicio13 implements Exercicio {

	@Override
	public void run() {
		
		System.out.println("13. Dados 3 valores reais representando os lados de um possível triângulo,\n"
				+ "verifique se os mesmos formam um triângulo (a medida de qualquer um de seus lados\n"
				+ "deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um\n"
				+ "triângulo, descubra também se este triângulo é escaleno (três lados diferentes),\n"
				+ "isósceles (dois lados iguais) ou eqüilátero (três lados iguais).\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o lado A: ");
		float a = sc.nextFloat();
		System.out.println("Informe o lado B: ");
		float b = sc.nextFloat();
		System.out.println("Informe o lado C: ");
		float c = sc.nextFloat();
		
		if(!((a < b + c) && (b < a + c) && (c < b + a))) {
			System.out.println("Não é um triângulo!");
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
			System.out.println("É um triângulo Escaleno");
		}
	}
	
	private void trianguloIsosceles(float... lados) {
		if ((lados[0] == lados[1] && lados[1] != lados[2]) ||
			(lados[1] == lados[2] && lados[2] != lados[0]) ||
			(lados[2] == lados[0] && lados[1] != lados[0]))
		{
			System.out.println("É um triângulo Isósceles");
		}
	}
	
	private void trianguloEquilatero(float... lados) {
		if(lados[0] == lados[1] &&
		   lados[1] == lados[2]) 
		{
			System.out.println("É um triângulo Eqüilátero");
		}
	}

}
