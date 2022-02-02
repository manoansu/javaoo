package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 *
 */
public class SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    double[] vetor = new double[n];
	    double sum = 0.0, avg;
	    
	    for(int i =0; i <n; i++) {
	    	System.out.print("Digite um numero: ");
	    	vetor[i] = sc.nextDouble();
	    	sum += vetor[i];
	    }
	    
	    avg = sum / vetor.length;
	    
	    System.out.print("VALORES = ");
	    
	    for(int i =0; i < vetor.length; i++) {
	    	System.out.printf("%.1f ", vetor[i]);
	    }
	    System.out.printf("\nSOMA = %.2f\n", sum);
	    System.out.printf("MEDIA = %.2f\n", avg);
	    sc.close();
	}
}
