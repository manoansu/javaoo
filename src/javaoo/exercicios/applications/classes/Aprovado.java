package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
 * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
 * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
 * igual a 6.0 (seis).
 * 
 * Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires
 *
 */
public class Aprovado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
	    double media;

	    System.out.print("Quantos alunos serao digitados? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    double[] notas1 = new double[n];
	    double[] notas2 = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:\n", i + 1);
	        sc.nextLine();
	        nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
	    }

	    System.out.println("Alunos aprovados:");

	    for (int i=0; i<n; i++) {
	        media = (notas1[i] + notas2[i]) / 2;

	        if(media >= 6.0) {
	            System.out.printf("%s\n", nomes[i]);
	        }
	    }
	    sc.close();
	}
}
