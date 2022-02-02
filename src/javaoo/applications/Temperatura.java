package javaoo.applications;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * 
 *         Fazer um programa para ler uma temperatura em Celsius e mostrar o
 *         equivalente em Fahrenheit. Perguntar se o usuÃ¡rio deseja repetir
 *         (s/n). Caso o usuÃ¡rio digite "s", repetir o programa. FÃ³rmula: ð??¹ =
 *         9C / 5 + 32
 *
 */
public class Temperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}
