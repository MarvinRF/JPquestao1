package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno;
		
		System.out.print("digite a matricula do Aluno: ");
		String matricula = sc.nextLine();
		
		System.out.print("digite o nome do Aluno: ");
		String name = sc.nextLine();
		
		
		System.out.print("digite a nota da primeira prova do Aluno: ");
		double prova1 = sc.nextDouble();
		
		System.out.print("digite a nota da segunda prova do Aluno: ");
		double prova2 = sc.nextDouble();
		
		System.out.print("digite a nota do trabalho do Aluno: ");
		double trabalho = sc.nextDouble();
		
		aluno = new Aluno(matricula, name, prova1, prova2, trabalho);
		
		System.out.println();
		System.out.println(aluno.toString());
		
		
		sc.close();
	}

}
