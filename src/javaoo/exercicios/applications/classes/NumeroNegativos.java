package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois N n�meros inteiros
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros negativos lidos.
 *
 */
public class NumeroNegativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    int[] vetor = new int[n];
	    
	    for(int i =0; i <n; i++) {
	    	System.out.print("Digite um numero: ");
	    	vetor[i] = sc.nextInt();
	    }
	    
	    System.out.println("NUMEROS NEGATIVOS:");
	    
	    for(int i =0; i <vetor.length; i++) {
	    	if(vetor[i] < 0)
	    		System.out.printf("%d\n", vetor[i]);
	    }
	    
	    sc.close();
	}
}
