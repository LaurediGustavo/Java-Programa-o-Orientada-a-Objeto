package br.com.exercicios;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Exerc�cio n�: ");
			String numero = sc.next();
			
			String nomeClasse = "br.com.exercicios.listaexercicios.Exercicio".concat(numero);
			Class<?> classe = Class.forName(nomeClasse);
			Object exercicio = classe.newInstance();
			Method metodo = exercicio.getClass().getMethod("run", null);
			metodo.invoke(exercicio, null);
		}
		catch (ClassNotFoundException e) {
			System.err.println("Exerc�cio n�o encontrado!");
		}
		catch (NoSuchMethodException e) {
			System.err.println("M�todo n�o encontrado!");
		}
	}
	
}
