package br.com.exercicios;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Exercício n°: ");
			String numero = sc.next();
			
			String nomeClasse = "br.com.exercicios.listaexercicios.Exercicio".concat(numero);
			Class<?> classe = Class.forName(nomeClasse);
			Object exercicio = classe.newInstance();
			Method metodo = exercicio.getClass().getMethod("run", null);
			metodo.invoke(exercicio, null);
		}
		catch (ClassNotFoundException e) {
			System.err.println("Exercício não encontrado!");
		}
		catch (NoSuchMethodException e) {
			System.err.println("Método não encontrado!");
		}
	}
	
}
