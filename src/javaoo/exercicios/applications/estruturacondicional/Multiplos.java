package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
 * números podem ser digitados em qualquer ordem.
 */
public class Multiplos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2;

	    System.out.println("Digite dois numeros inteiros:");
	    num1 = sc.nextInt();
	    num2 = sc.nextInt();

	    if (num1 % num2 == 0 || num2 % num1 == 0) {
	    	System.out.println("Sao multiplos");
	    }
	    else {
	    	System.out.println("Nao sao multiplos");
	    }
		sc.close();
	}

}
