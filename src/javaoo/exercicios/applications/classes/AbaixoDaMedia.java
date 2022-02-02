package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu Fazer um programa para ler um número inteiro N e depois um
 *         vetor de N números reais. Em seguida, mostrar na tela a média
 *         aritmética de todos elementos com três casas decimais. Depois mostrar
 *         todos os elementos do vetor que estejam abaixo da média, com uma casa
 *         decimal cada. Quantos elementos vai ter o vetor? 4 Digite um numero:
 *         10.0 Digite um numero: 15.5 Digite um numero: 13.2 Digite um numero:
 *         9.8 MEDIA DO VETOR = 12.125 ELEMENTOS ABAIXO DA MEDIA: 10.0 9.8
 */
public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}

		media = soma / n;

		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		sc.close();
	}
}
