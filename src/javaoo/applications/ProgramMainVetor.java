package javaoo.applications;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Fazer um programa para ler um número inteiro N e a altura de N
 * pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
 * altura média dessas pessoas.
 * Input:
 * 3
 * 1.72
 * 1.56
 * 1.80
 *
 */
public class ProgramMainVetor {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entra com o valor de n: ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i = 0; i< n; i++) {
			System.out.print("Entra com a "+ (i + 1) +"ª altura da pessoa: ");
			vet[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i<n; i++) {
			sum += vet[i];
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
		
	}

}
