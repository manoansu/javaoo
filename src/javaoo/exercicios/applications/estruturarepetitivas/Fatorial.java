package javaoo.exercicios.applications.estruturarepetitivas;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
 * fatorial de N.
 *
 */
public class Fatorial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial;

	    System.out.print("Digite o valor de N: ");
	    n = sc.nextInt();

	    fatorial = 1;
	    for (int i=n; i>0; i--) {
	        fatorial = fatorial * i;
	    }

	    System.out.printf("FATORIAL = %d\n", fatorial);

		sc.close();
	}
}
